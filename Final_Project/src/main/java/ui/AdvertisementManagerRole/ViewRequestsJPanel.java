/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdvertisementManagerRole;

import Business.AdvManagement.Advertisement;
import Business.Enterprise.AdvertisementEnterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdvertisementWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aishwarya
 */
public class ViewRequestsJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    AdvertisementEnterprise enterprise;
    UserAccount userAccount;

    /**
     * Creates new form ViewRequestsJPanel
     */
    public ViewRequestsJPanel(JPanel userProcessContainer, AdvertisementEnterprise enterprise, UserAccount userAccount) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        
        populateAdvReqs();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewAdvAR = new javax.swing.JTable();
        btnViewAnalysis = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 102));

        lbltitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("View Advertisement Analysis Requests");

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
                .addGap(57, 57, 57)
                .addComponent(btnBack)
                .addGap(113, 113, 113)
                .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(255, 255, 255))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tblViewAdvAR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Advertisement ID", "Advertisement Name", "Status", "Receiver", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewAdvAR);

        btnViewAnalysis.setBackground(new java.awt.Color(0, 153, 255));
        btnViewAnalysis.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnViewAnalysis.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAnalysis.setText("View Analysis");
        btnViewAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAnalysisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(720, 720, 720)
                        .addComponent(btnViewAnalysis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnViewAnalysis)
                .addGap(144, 144, 144))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAnalysisActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewAdvAR.getSelectedRow();
        
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select an advertisement request first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // This is an advertisement request from advertisement workqueue catalog
        AdvertisementWorkRequest selectedAdvReq = (AdvertisementWorkRequest) tblViewAdvAR.getValueAt(selectedRowIndex, 4);
        
        if (selectedAdvReq.getWorkStatus().equalsIgnoreCase("Pending")) {
            JOptionPane.showMessageDialog(this, "You can view the request once status is completed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        ViewAdvRequestAnalysisJPanel viewAdvRequestAnalysisJPanel = new ViewAdvRequestAnalysisJPanel(this.userProcessContainer, selectedAdvReq);
        this.userProcessContainer.add("ViewAdvRequestAnalysisJPanel",viewAdvRequestAnalysisJPanel);
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        layout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnViewAnalysisActionPerformed

    private void populateAdvReqs() {
        DefaultTableModel model = (DefaultTableModel) tblViewAdvAR.getModel();
        model.setRowCount(0);

        for (WorkRequest workReq : this.userAccount.getWorkQueue().getWorkQueue()) {
            AdvertisementWorkRequest advWorkReq = (AdvertisementWorkRequest) workReq;
            Object row[] = new Object[5];
            row[0] = advWorkReq.getRequestAdver().getAdvID();
            row[1] = advWorkReq.getRequestAdver();
            row[2] = advWorkReq.getWorkStatus();
            row[3] = advWorkReq.getReceiver();
            row[4] = advWorkReq;
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewAnalysis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblViewAdvAR;
    // End of variables declaration//GEN-END:variables
}