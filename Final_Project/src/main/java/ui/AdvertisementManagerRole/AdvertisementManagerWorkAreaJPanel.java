/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdvertisementManagerRole;

import Business.AdvManagement.Advertisement;
import Business.Enterprise.AdvertisementEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aishwarya
 */
public class AdvertisementManagerWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    AdvertisementEnterprise enterprise;
    Organization org;
    UserAccount userAccount;

    /**
     * Creates new form AdvertisementManagerWorkAreaJPanel
     */
    public AdvertisementManagerWorkAreaJPanel(JPanel userProcessContainer, AdvertisementEnterprise enterprise, Organization org, UserAccount userAccount) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.org = org;
        this.userAccount = userAccount;
        
        lblEnterprise.setText(this.enterprise.getOrgName());
        populateAdvTable();
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
        lblAdvMngrtitle = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblEnterpriseNametitle = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdvMngr = new javax.swing.JTable();
        btnUpdateAdv = new javax.swing.JButton();
        btnAddAdv = new javax.swing.JButton();
        btnCreateAR = new javax.swing.JButton();
        btnViewReq = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 102));

        lblAdvMngrtitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAdvMngrtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvMngrtitle.setText("Advertisement Manager Work Area");

        btnLogout.setText("Logout");
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
                .addGap(272, 272, 272)
                .addComponent(lblAdvMngrtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addGap(155, 155, 155)
                .addComponent(btnLogout)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout)
                    .addComponent(lblAdvMngrtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        lblEnterpriseNametitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEnterpriseNametitle.setText("Enterprise Name:");

        lblEnterprise.setText("<enterprise>");
        lblEnterprise.setToolTipText("");

        tblAdvMngr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Advertisement Name", "Created Date", "Expiry Date", "Adv LatLong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAdvMngr);

        btnUpdateAdv.setText("Update Advertisement");
        btnUpdateAdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAdvActionPerformed(evt);
            }
        });

        btnAddAdv.setText("Add Advertisements");
        btnAddAdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdvActionPerformed(evt);
            }
        });

        btnCreateAR.setText("Create Analysis Request");
        btnCreateAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateARActionPerformed(evt);
            }
        });

        btnViewReq.setText("View Requests");
        btnViewReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(lblEnterpriseNametitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnUpdateAdv, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddAdv, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewReq, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseNametitle)
                    .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewReq)
                    .addComponent(btnCreateAR)
                    .addComponent(btnAddAdv)
                    .addComponent(btnUpdateAdv))
                .addGap(165, 165, 165))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddAdv, btnCreateAR, btnViewReq});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddAdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdvActionPerformed
        // TODO add your handling code here:
        AddAdvertisementJPanel addAdvertisementJPanel = new AddAdvertisementJPanel(this.userProcessContainer, this.enterprise);
        this.userProcessContainer.add("AddAdvertisementJPanel",addAdvertisementJPanel);
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        layout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnAddAdvActionPerformed

    private void btnViewReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReqActionPerformed
        // TODO add your handling code here:
        ViewRequestsJPanel viewRequestsJPanel = new ViewRequestsJPanel(this.userProcessContainer, this.enterprise, this.userAccount);
        this.userProcessContainer.add("ViewRequestsJPanel",viewRequestsJPanel);
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        layout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnViewReqActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.previous(this.userProcessContainer);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCreateARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateARActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblAdvMngr.getSelectedRow();
        
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select an advertisement first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // This is an advertisement from advertisement catalog
        Advertisement selectedAdv = (Advertisement) tblAdvMngr.getValueAt(selectedRowIndex, 1);
        
        
        CreateAdvAnalysisRequestJPanel createAdvAnalysisRequestJPanel = new CreateAdvAnalysisRequestJPanel(this.userProcessContainer, this.enterprise, selectedAdv, this.userAccount);
        this.userProcessContainer.add("CreateAdvAnalysisRequestJPanel",createAdvAnalysisRequestJPanel);
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        layout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnCreateARActionPerformed

    private void btnUpdateAdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAdvActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblAdvMngr.getSelectedRow();
        
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select an advertisement first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // This is an advertisement from advertisement catalog
        Advertisement selectedAdv = (Advertisement) tblAdvMngr.getValueAt(selectedRowIndex, 1);
        
        System.out.println(selectedAdv.getAdvName());
        System.out.println(selectedAdv);
        
        UpdateAdvertisementJPanel updateAdvertisementJPanel = new UpdateAdvertisementJPanel(this.userProcessContainer, selectedAdv);
        this.userProcessContainer.add("UpdateAdvertisementJPanel",updateAdvertisementJPanel);
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        layout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnUpdateAdvActionPerformed

    public void populateAdvTable() {
        DefaultTableModel model = (DefaultTableModel) tblAdvMngr.getModel();
        model.setRowCount(0);

        for (Advertisement adv : this.enterprise.getAdvertisementCatalog().getAdvertisementList()) {
            Object row[] = new Object[5];
            row[0] = adv.getAdvID();
            row[1] = adv;
            row[2] = adv.getAdvDateTime();
            row[3] = adv.getAdvExpiryDateTime();
            row[4] = adv.getAdvLatLong();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAdv;
    private javax.swing.JButton btnCreateAR;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdateAdv;
    private javax.swing.JButton btnViewReq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdvMngrtitle;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblEnterpriseNametitle;
    private javax.swing.JTable tblAdvMngr;
    // End of variables declaration//GEN-END:variables
}