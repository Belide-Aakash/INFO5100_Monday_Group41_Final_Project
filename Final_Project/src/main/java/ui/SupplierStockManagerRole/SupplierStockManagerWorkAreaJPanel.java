/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SupplierStockManagerRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.StockManagement.Stock;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aishwarya
 */
public class SupplierStockManagerWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Ecosystem ecosystemBusiness;
    Network network;
    SupplierEnterprise enterprise;
    Organization org;
    UserAccount userAccount;

    /**
     * Creates new form SupplierStockManagerWorkAreaJPanel
     */
    public SupplierStockManagerWorkAreaJPanel(JPanel userProcessContainer, Ecosystem ecosystemBusiness, Network network, SupplierEnterprise enterprise, Organization org, UserAccount userAccount) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystemBusiness = ecosystemBusiness;
        this.network = network;
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
        lbltitle = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMngStock = new javax.swing.JButton();
        btnViewSupReqs = new javax.swing.JButton();
        btnViewMarketReqs = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 102));

        lbltitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Supplier Stock Manager Work Area");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addGap(156, 156, 156)
                .addComponent(btnLogout)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Supermarket workers-pana.png"))); // NOI18N

        btnMngStock.setBackground(new java.awt.Color(0, 153, 255));
        btnMngStock.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnMngStock.setForeground(new java.awt.Color(255, 255, 255));
        btnMngStock.setText("Manage Stock");
        btnMngStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngStockActionPerformed(evt);
            }
        });

        btnViewSupReqs.setBackground(new java.awt.Color(0, 153, 255));
        btnViewSupReqs.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnViewSupReqs.setForeground(new java.awt.Color(255, 255, 255));
        btnViewSupReqs.setText("View Supplier Requests");
        btnViewSupReqs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSupReqsActionPerformed(evt);
            }
        });

        btnViewMarketReqs.setBackground(new java.awt.Color(0, 153, 255));
        btnViewMarketReqs.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnViewMarketReqs.setForeground(new java.awt.Color(255, 255, 255));
        btnViewMarketReqs.setText("View Market Requests");
        btnViewMarketReqs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMarketReqsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewSupReqs, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnViewMarketReqs, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnMngStock, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnMngStock)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewSupReqs)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewMarketReqs)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.previous(this.userProcessContainer);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnMngStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngStockActionPerformed
        // TODO add your handling code here:
        ManageStockJPanel manageStockJPanel = new ManageStockJPanel(this.userProcessContainer, this.enterprise);
        this.userProcessContainer.add("ManageStockJPanel",manageStockJPanel);
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        layout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnMngStockActionPerformed

    private void btnViewMarketReqsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMarketReqsActionPerformed
        // TODO add your handling code here:
        ViewMarketRequestsJPanel viewMarketRequestsJPanel = new ViewMarketRequestsJPanel(this.userProcessContainer, this.network, this.userAccount);
        this.userProcessContainer.add("ViewMarketRequestsJPanel",viewMarketRequestsJPanel);
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        layout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnViewMarketReqsActionPerformed

    private void btnViewSupReqsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSupReqsActionPerformed
        // TODO add your handling code here:
        ViewSupplierRequestsJPanel viewSupplierRequestsJPanel = new ViewSupplierRequestsJPanel(this.userProcessContainer, this.enterprise, this.userAccount);
        this.userProcessContainer.add("ViewSupplierRequestsJPanel",viewSupplierRequestsJPanel);
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        layout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnViewSupReqsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMngStock;
    private javax.swing.JButton btnViewMarketReqs;
    private javax.swing.JButton btnViewSupReqs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbltitle;
    // End of variables declaration//GEN-END:variables
}
