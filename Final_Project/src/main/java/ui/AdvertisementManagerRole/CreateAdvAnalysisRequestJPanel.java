/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdvertisementManagerRole;

import Business.AdvManagement.Advertisement;
import Business.Enterprise.AdvertisementEnterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdvertisementWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aishwarya
 */
public class CreateAdvAnalysisRequestJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    AdvertisementEnterprise enterprise;
    Advertisement selectedAdv;
    UserAccount userAccount;

    /**
     * Creates new form CreateAdvAnalysisRequestJPanel
     */
    public CreateAdvAnalysisRequestJPanel(JPanel userProcessContainer, AdvertisementEnterprise enterprise, Advertisement selectedAdv, UserAccount userAccount) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.selectedAdv = selectedAdv;
        this.userAccount = userAccount;
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
        lbltitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnCreateReq = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 102));

        lbltitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Create Advertisement Analysis Request");

        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnBack)
                .addGap(113, 113, 113)
                .addComponent(lbltitle)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        lblMessage.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblMessage.setText("Message:");

        btnCreateReq.setBackground(new java.awt.Color(0, 153, 255));
        btnCreateReq.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnCreateReq.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateReq.setText("Create Request");
        btnCreateReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateReq)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnCreateReq)
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateReqActionPerformed
        // TODO add your handling code here:
        String getMessage = txtMessage.getText();
        
        if (getMessage.isBlank()) {
            JOptionPane.showMessageDialog(this, "Message cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        AdvertisementWorkRequest newAdvWorkReq = new AdvertisementWorkRequest();
        newAdvWorkReq.setMessage(getMessage);
        newAdvWorkReq.setSender(this.userAccount);
        newAdvWorkReq.setWorkStatus("Pending");
        newAdvWorkReq.setRequestAdver(this.selectedAdv);
        
        this.userAccount.getWorkQueue().addToWorkQueue(newAdvWorkReq);
        this.enterprise.getWorkQueue().addToWorkQueue(newAdvWorkReq);
        
        JOptionPane.showMessageDialog(this, "Work Request created successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        txtMessage.setText("");
    }//GEN-LAST:event_btnCreateReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateReq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}