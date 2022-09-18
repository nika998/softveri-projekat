/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.bg.ac.fon.ps.forms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rs.bg.ac.fon.ps.communication.Response;
import rs.bg.ac.fon.ps.controler.Controller;
import rs.bg.ac.fon.ps.domain.impl.AvioLinija;
import rs.bg.ac.fon.ps.domain.impl.Let;

/**
 *
 * @author nikola.dulovic
 */
public class ZapamtiLetForm extends javax.swing.JDialog {

    private final Let flight;
    private List<AvioLinija> lines;
    private static final String NEPOTPUNO = "Nepotpuni podaci";
    private static final String TIME_FORMAT = "yyyy.MM.dd HH:mm:ss";

    public ZapamtiLetForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        flight = new Let();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbLines = new javax.swing.JComboBox<>();
        txtStartTime = new javax.swing.JTextField();
        txtEndTime = new javax.swing.JTextField();
        txtCompany = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdFlight = new javax.swing.JTextField();
        btnSaveFlight = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kreiraj let");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dodavanje novog leta"));

        jLabel1.setText("Avio linija:");

        jLabel2.setText("Vreme polaska:");

        jLabel3.setText("Vreme dolaska:");

        jLabel4.setText("Prevoznik:");

        cbLines.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Šifra leta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbLines, 0, 180, Short.MAX_VALUE)
                    .addComponent(txtStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtEndTime, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtCompany, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtIdFlight))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbLines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtStartTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        btnSaveFlight.setText("Dodaj");
        btnSaveFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFlightActionPerformed(evt);
            }
        });

        btnCancel.setText("Izađi");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSaveFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFlightActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da dodate let?", "Potvrdite izbor", JOptionPane.YES_NO_OPTION) == 0) {
            try {
                Date startTime = startTimeValidation();
                Date endTime = endTimeValidation();
                String id = txtIdFlight.getText();
                String prevoznik = txtCompany.getText();
                AvioLinija avioLinija = (AvioLinija) cbLines.getSelectedItem();

                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Morate uneti identifikacioni broj leta!", NEPOTPUNO, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (startTime == null) {
                    JOptionPane.showMessageDialog(this, "Vreme polaska mora biti u formatu " + TIME_FORMAT + "!", NEPOTPUNO, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (endTime == null) {
                    JOptionPane.showMessageDialog(this, "Vreme dolaska mora biti u formatu " + TIME_FORMAT + "!", NEPOTPUNO, JOptionPane.WARNING_MESSAGE);
                    return;

                }

                if (startTime.after(endTime)) {
                    JOptionPane.showMessageDialog(this, "Vreme polaska mora biti pre vremena dolaska!", NEPOTPUNO, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (prevoznik.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Morate uneti naziv prevoznika!", NEPOTPUNO, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                flight.setId(id);
                flight.setLine(avioLinija);
                flight.setEndTime(endTime);
                flight.setStartTime(startTime);
                flight.setCompany(prevoznik);

                Response res = Controller.getInstance().saveFlight(flight);

                if (res.getException() == null) {
                    JOptionPane.showMessageDialog(this, "Sistem je uspešno zapamtio let.", "Uspešno zapamćen let", JOptionPane.INFORMATION_MESSAGE);
                    emptyFields();
                } else {
                    JOptionPane.showMessageDialog(this, res.getException().getMessage(), "Neuspešno pamćenje leta", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Sistem ne može da zapamti let.", "Greška prilikom pamćenja", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveFlightActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da napustite stranicu?", "Potvrdite izbor", JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSaveFlight;
    private javax.swing.JComboBox<Object> cbLines;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtIdFlight;
    private javax.swing.JTextField txtStartTime;
    // End of variables declaration//GEN-END:variables

    private void emptyFields() {
        txtIdFlight.setText("");
        txtEndTime.setText("");
        txtStartTime.setText("");
        txtCompany.setText("");

    }

    private void init() {
        try {
            lines = Controller.getInstance().getLinesList();

            cbLines.removeAllItems();
            lines.forEach((linija) -> {
                cbLines.addItem(linija);
            });

        } catch (Exception ex) {
            Logger.getLogger(ZapamtiPrisustvoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Date startTimeValidation() {
        try {
            String startTimeStr = this.txtStartTime.getText();
            return new SimpleDateFormat(TIME_FORMAT).parse(startTimeStr);
        } catch (ParseException pe) {
            return null;
        }
    }

    private Date endTimeValidation() {
        try {
            String endTimeStr = this.txtEndTime.getText();
            return new SimpleDateFormat(TIME_FORMAT).parse(endTimeStr);
        } catch (ParseException pe) {
            return null;
        }
    }

}