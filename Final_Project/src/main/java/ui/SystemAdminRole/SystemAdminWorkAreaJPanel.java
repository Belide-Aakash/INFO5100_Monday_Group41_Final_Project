/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author aakashbelide
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Ecosystem ecosystemBusiness;
    Enterprise enterprise;
    Organization org;
    UserAccount userAccount;

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, Ecosystem ecosystemBusiness, Enterprise enterprise, Organization org, UserAccount userAccount) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystemBusiness = ecosystemBusiness;
        this.enterprise = enterprise;
        this.org = org;
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
        pageTitle = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMngNetworks = new javax.swing.JButton();
        btnMngEnterprises = new javax.swing.JButton();
        btnMngEnterpriseAdmins = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        pageTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        pageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitle.setText("System Admin Work Area");

        btnLogout.setBackground(new java.awt.Color(0, 153, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/power-off.png"))); // NOI18N
        btnLogout.setBorder(null);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(936, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnLogout)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(pageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(35, 35, 35)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin-rafiki.png"))); // NOI18N

        btnMngNetworks.setBackground(new java.awt.Color(0, 153, 255));
        btnMngNetworks.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnMngNetworks.setForeground(new java.awt.Color(255, 255, 255));
        btnMngNetworks.setText("Manage Networks");
        btnMngNetworks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngNetworksActionPerformed(evt);
            }
        });

        btnMngEnterprises.setBackground(new java.awt.Color(0, 153, 255));
        btnMngEnterprises.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnMngEnterprises.setForeground(new java.awt.Color(255, 255, 255));
        btnMngEnterprises.setText("Manage Enterprises");
        btnMngEnterprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngEnterprisesActionPerformed(evt);
            }
        });

        btnMngEnterpriseAdmins.setBackground(new java.awt.Color(0, 153, 255));
        btnMngEnterpriseAdmins.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnMngEnterpriseAdmins.setForeground(new java.awt.Color(255, 255, 255));
        btnMngEnterpriseAdmins.setText("Manage Enterprise Admins");
        btnMngEnterpriseAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngEnterpriseAdminsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMngEnterprises, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(btnMngNetworks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(btnMngEnterpriseAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnMngNetworks)
                        .addGap(18, 18, 18)
                        .addComponent(btnMngEnterprises)
                        .addGap(18, 18, 18)
                        .addComponent(btnMngEnterpriseAdmins)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMngNetworksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngNetworksActionPerformed
        // TODO add your handling code here:
        
        MngNetworksJPanel manageNetworksJPanel = new MngNetworksJPanel(this.userProcessContainer, this.ecosystemBusiness);
        this.userProcessContainer.add("ManageNetworksJPanel",manageNetworksJPanel);
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        layout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnMngNetworksActionPerformed

    private void btnMngEnterprisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngEnterprisesActionPerformed
        // TODO add your handling code here:
        
        MngEnterprisesJPanel mngEnterprisesJPanel = new MngEnterprisesJPanel(this.userProcessContainer, this.ecosystemBusiness);
        this.userProcessContainer.add("MngEnterprisesJPanel",mngEnterprisesJPanel);
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        layout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnMngEnterprisesActionPerformed

    private void btnMngEnterpriseAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngEnterpriseAdminsActionPerformed
        // TODO add your handling code here:
        
        MngEnterpriseAdminsJPanel mngEnterpriseAdminsJPanel = new MngEnterpriseAdminsJPanel(this.userProcessContainer, this.ecosystemBusiness);
        this.userProcessContainer.add("MngEnterpriseAdminsJPanel",mngEnterpriseAdminsJPanel);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnMngEnterpriseAdminsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.previous(this.userProcessContainer);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMngEnterpriseAdmins;
    private javax.swing.JButton btnMngEnterprises;
    private javax.swing.JButton btnMngNetworks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pageTitle;
    // End of variables declaration//GEN-END:variables
}
