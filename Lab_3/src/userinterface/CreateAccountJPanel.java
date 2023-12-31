/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import business.Account;
import business.Accountdirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gagan
 */
public class CreateAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccountJPanel
     */
    private JPanel userProcessContainer;
    private Accountdirectory accountdirectory;

    CreateAccountJPanel(JPanel userProcessContainer, Accountdirectory accountdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accountdirectory = accountdirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle = new javax.swing.JLabel();
        lblroutingnumber = new javax.swing.JLabel();
        lblaccountnumber = new javax.swing.JLabel();
        lblbankname = new javax.swing.JLabel();
        lblbalance = new javax.swing.JLabel();
        btncreate = new javax.swing.JButton();
        txtroutingnumber = new javax.swing.JTextField();
        txtaccountnumber = new javax.swing.JTextField();
        txtbankname = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lbltitle.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Create Account");
        lbltitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblroutingnumber.setText("Routing Number:");

        lblaccountnumber.setText("Account Number:");

        lblbankname.setText("Bank Name:");

        lblbalance.setText("Balance:");

        btncreate.setBackground(new java.awt.Color(255, 204, 153));
        btncreate.setText("Create");
        btncreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        txtaccountnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaccountnumberActionPerformed(evt);
            }
        });

        txtbankname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbanknameActionPerformed(evt);
            }
        });

        txtbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalanceActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(255, 204, 153));
        btnback.setText("Back");
        btnback.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblaccountnumber)
                                .addComponent(lblroutingnumber)
                                .addComponent(lblbalance, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblbankname)
                            .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtroutingnumber)
                                .addComponent(txtaccountnumber)
                                .addComponent(txtbankname)
                                .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnback)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(296, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnback, btncreate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbltitle)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblroutingnumber)
                    .addComponent(txtroutingnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaccountnumber)
                    .addComponent(txtaccountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbankname)
                    .addComponent(txtbankname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbalance))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnback, btncreate});

    }// </editor-fold>//GEN-END:initComponents

    private void txtaccountnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaccountnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccountnumberActionPerformed

    private void txtbanknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbanknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbanknameActionPerformed

    private void txtbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalanceActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
          String routingnumber =txtroutingnumber.getText();
          String accountnumber = txtaccountnumber.getText();
          String bankname = txtbankname.getText();
          int balance = Integer.parseInt(txtbalance.getText());
          Account account = accountdirectory.addAccount();
          account.setRoutingnumber(routingnumber);
          account.setAccountnumber(accountnumber);
          account.setBalance(balance);
          account.setBankname(bankname);

          JOptionPane.showMessageDialog(null,"Account successfully created");
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreate;
    private javax.swing.JLabel lblaccountnumber;
    private javax.swing.JLabel lblbalance;
    private javax.swing.JLabel lblbankname;
    private javax.swing.JLabel lblroutingnumber;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtaccountnumber;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtbankname;
    private javax.swing.JTextField txtroutingnumber;
    // End of variables declaration//GEN-END:variables
}
