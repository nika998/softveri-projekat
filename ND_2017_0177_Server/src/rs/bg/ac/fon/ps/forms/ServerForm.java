/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.bg.ac.fon.ps.forms;

import java.awt.Color;
import rs.bg.ac.fon.ps.threads.StartServerThread;

/**
 *
 * @author nikola.dulovic
 */
public class ServerForm extends javax.swing.JFrame {

    /**
     * Creates new form ServerForm
     */
    StartServerThread startServerThread;

    public ServerForm() {
        initComponents();
        this.setLocationRelativeTo(null);
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

        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnDBConfiguration = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblStatusServ = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPort = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serverska forma");

        btnStart.setText("Pokreni");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("Zaustavi");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnDBConfiguration.setText("Konfiguracija baze");
        btnDBConfiguration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDBConfigurationActionPerformed(evt);
            }
        });

        jLabel1.setText("Status servera:");

        jLabel2.setText("Port:");

        lblPort.setText("9000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnDBConfiguration))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblStatusServ, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(lblPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPort))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStatusServ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnStop)
                    .addComponent(btnDBConfiguration))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        startServerThread = new StartServerThread(this);
        startServerThread.start();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnDBConfigurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDBConfigurationActionPerformed
        new DBConfigForm(this, true).setVisible(true);
    }//GEN-LAST:event_btnDBConfigurationActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        startServerThread.stopServer();
    }//GEN-LAST:event_btnStopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDBConfiguration;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPort;
    private javax.swing.JLabel lblStatusServ;
    // End of variables declaration//GEN-END:variables

    private void init() {
        lblStatusServ.setText("Ugašen");
        lblStatusServ.setForeground(Color.red);
        btnStop.setEnabled(false);
    }

    public void serverStarted() {
        btnStart.setEnabled(false);
        btnStop.setEnabled(true);
        lblStatusServ.setText("Pokrenut");
        lblStatusServ.setForeground(Color.green);
    }

    public void serverStopped() {
        btnStart.setEnabled(true);
        btnStop.setEnabled(false);
        lblStatusServ.setText("Ugašen");
        lblStatusServ.setForeground(Color.red);
    }
}