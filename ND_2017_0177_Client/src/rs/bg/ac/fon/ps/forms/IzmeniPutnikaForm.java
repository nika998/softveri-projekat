/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.bg.ac.fon.ps.forms;

import javax.swing.JOptionPane;
import rs.bg.ac.fon.ps.communication.Response;
import rs.bg.ac.fon.ps.controler.Controller;
import rs.bg.ac.fon.ps.domain.impl.Putnik;
import rs.bg.ac.fon.ps.table.KoriscenjeLinijaTableModel;
import rs.bg.ac.fon.ps.table.PrisustvaTableModel;
import rs.bg.ac.fon.ps.table.PutnikTableModel;

/**
 *
 * @author nikola.dulovic
 */
public class IzmeniPutnikaForm extends javax.swing.JDialog {

    private final Putnik passenger;
    private final PutnikTableModel passengerTableModel;
    private final PrisustvaTableModel attendancesTableModel;
    private final KoriscenjeLinijaTableModel usedLinesTableModel;
    private static final String POTVRDI = "Potvrdite izbor";

    public IzmeniPutnikaForm(java.awt.Dialog parent, boolean modal, Putnik passenger, PutnikTableModel passengerTableModel, PrisustvaTableModel attendancesTableModel, KoriscenjeLinijaTableModel usedLinesTableModel) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.passenger = passenger;
        this.passengerTableModel = passengerTableModel;
        this.attendancesTableModel = attendancesTableModel;
        this.usedLinesTableModel = usedLinesTableModel;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEnableEdit = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtJmbg = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        rbChild = new javax.swing.JRadioButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nalog putnika");

        jLabel1.setText("Id:");

        jLabel2.setText("Ime:");

        jLabel3.setText("Prezime:");

        jLabel4.setText("Jmbg:");

        jLabel5.setText("Pol");

        btnEnableEdit.setText("Izmeni");
        btnEnableEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnableEditActionPerformed(evt);
            }
        });

        btnEdit.setText("Sačuvaj izmene");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Obriši");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtJmbg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJmbgActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMale);
        rbMale.setText("Musko");

        buttonGroup1.add(rbFemale);
        rbFemale.setText("Žensko");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbChild);
        rbChild.setText("Dete");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbChild)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJmbg))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSurname))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEnableEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnEnableEdit)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(jLabel3)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJmbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbMale)
                    .addComponent(rbFemale)
                    .addComponent(rbChild))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJmbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJmbgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJmbgActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        if (JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da izmenite putnika?", POTVRDI, JOptionPane.YES_NO_OPTION) == 0) {
            try {

                String name = txtName.getText();
                String surname = txtSurname.getText();
                String jmbg = txtJmbg.getText();
                String gender = selectGender();

                String validationMessage = validateFields(name, surname, jmbg, gender);

                if (!validationMessage.isEmpty()) {
                    JOptionPane.showMessageDialog(this, validationMessage, "Nepotpuni podaci", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                passenger.setName(name);
                passenger.setSurname(surname);
                passenger.setJmbg(jmbg);
                passenger.setGender(gender);

                Response res = Controller.getInstance().editPassenger(passenger);

                if (res.getException() == null) {
                    passengerTableModel.editPassengerInfo(passenger);
                    JOptionPane.showMessageDialog(this, "Sistem je izmenio putnika.", "Uspešno izmenjen putnik", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, res.getException().getMessage(), "Neuspešna izmena putnika", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Sistem ne može da izmeni putnika.", "Greška prilikom izmene putnika", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnEnableEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnableEditActionPerformed
        btnEnableEdit.setEnabled(false);
        btnEdit.setEnabled(true);
        txtName.setEditable(true);
        txtSurname.setEditable(true);
        rbMale.setEnabled(true);
        rbFemale.setEnabled(true);
        rbChild.setEnabled(true);
    }//GEN-LAST:event_btnEnableEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da obrišete putnika?\nBrisanjem nestaju svi podaci o prisustvima za ovog putnika!", POTVRDI, JOptionPane.YES_NO_OPTION) == 0) {
            try {
                Response res = Controller.getInstance().deletePassenger(passenger);

                if (res.getException() == null) {
                    passengerTableModel.deletePassengerInfo(passenger);
                    attendancesTableModel.deleteResults();
                    usedLinesTableModel.deleteResults();
                    JOptionPane.showMessageDialog(this, "Sistem je obrisao putnika.", "Uspešno obrisan putnik", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, res.getException().getMessage(), "Neuspešno brisanje putnika", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Sistem ne može da obriše putnika.", "Greška prilikom brisanja putnika", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da napustite stranicu?", POTVRDI, JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEnableEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbChild;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJmbg;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables

    private void init() {
        btnEdit.setEnabled(false);
        txtId.setEditable(false);
        txtName.setEditable(false);
        txtSurname.setEditable(false);
        txtJmbg.setEditable(false);
        rbMale.setEnabled(false);
        rbFemale.setEnabled(false);
        rbChild.setEnabled(false);

        txtId.setText(passenger.getId().toString());
        txtName.setText(passenger.getName());
        txtSurname.setText(passenger.getSurname());
        txtJmbg.setText(passenger.getJmbg());
        if (passenger.getGender().equalsIgnoreCase("Muski")) {
            rbMale.setSelected(true);
        }
        if (passenger.getGender().equalsIgnoreCase("Zenski")) {
            rbFemale.setSelected(true);
        }
        if (passenger.getGender().equalsIgnoreCase("Dete")) {
            rbChild.setSelected(true);
        }
    }

    private String selectGender() {

        String gender = "";

        if (rbMale.isSelected()) {
            gender = "Muski";
        }
        if (rbFemale.isSelected()) {
            gender = "Zenski";
        }
        if (rbChild.isSelected()) {
            gender = "Dete";
        }

        return gender;
    }

    private String validateFields(String name, String surname, String jmbg, String gender) {
        StringBuilder sb = new StringBuilder();

        if (name.isEmpty() || surname.isEmpty() || jmbg.isEmpty() || gender.isEmpty()) {
            sb.append("Morate popuniti sledeća polja:\n");
            if (name.isEmpty()) {
                sb.append("Ime\n");
            }
            if (surname.isEmpty()) {
                sb.append("Prezime\n");
            }
            if (jmbg.isEmpty()) {
                sb.append("JMBG\n");
            }
            if (gender.isEmpty()) {
                sb.append("Pol");
            }
        }
        return sb.toString();
    }

}
