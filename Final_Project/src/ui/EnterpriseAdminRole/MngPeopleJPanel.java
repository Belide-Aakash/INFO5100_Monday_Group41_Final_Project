/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.EnterpriseAdminRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Person.Person;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author aakashbelide
 */
public class MngPeopleJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    /**
     * Creates new form MngPeopleJPanel
     */
    public MngPeopleJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        
        // Get the table header
        JTableHeader header = orgPeopleTable.getTableHeader();
        
        // Customize the header background and text color
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                
                JLabel label = (JLabel) super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);
                
                // Set background color
                label.setBackground(new Color(0,153,255)  );
                // Set text color
                label.setForeground(Color.WHITE);
                // Set font style and size
                label.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
                
                return label;
            }
        });
        
        populateCombobox();
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
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orgPeopleTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblOrgName = new javax.swing.JLabel();
        cBoxOrgName = new javax.swing.JComboBox();
        lblPersonName = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        btnAddPerson = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        pageTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        pageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitle.setText("Manage People");

        btnBack.setText("<< Back");
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
                .addGap(31, 31, 31)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnBack)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(pageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(35, 35, 35)))
        );

        orgPeopleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Person ID", "Person Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orgPeopleTable);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Organization Person", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        lblOrgName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblOrgName.setForeground(new java.awt.Color(255, 255, 255));
        lblOrgName.setText("Organization Name:");

        cBoxOrgName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBoxOrgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxOrgNameActionPerformed(evt);
            }
        });

        lblPersonName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblPersonName.setForeground(new java.awt.Color(255, 255, 255));
        lblPersonName.setText("Person Name:");

        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPersonName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(333, 333, 333))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPersonName)
                                .addGap(92, 92, 92)
                                .addComponent(btnAddPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(305, 305, 305))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblOrgName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(92, 92, 92))
                            .addComponent(cBoxOrgName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(507, 507, 507))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblOrgName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBoxOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPersonName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPerson)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.previous(this.userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        Organization selectedOrg = (Organization) cBoxOrgName.getSelectedItem();
        
        String newPersonName = txtPersonName.getText();

        if (selectedOrg == null) {
            JOptionPane.showMessageDialog(this, "Please select a valid Organization from drop down.", "Organization Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (newPersonName.isBlank()) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty. Please provide a valid person name.", "Person Name Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        selectedOrg.getPersonDir().createPerson(newPersonName);

        JOptionPane.showMessageDialog(this, "Person added to the organization successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        populateTable(selectedOrg);
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void cBoxOrgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxOrgNameActionPerformed
        // TODO add your handling code here:
        Organization selectedOrg = (Organization) cBoxOrgName.getSelectedItem();
        if (selectedOrg != null){
            populateTable(selectedOrg);
        }
    }//GEN-LAST:event_cBoxOrgNameActionPerformed

    public void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) orgPeopleTable.getModel();
        model.setRowCount(0);
        
        for (Person person : organization.getPersonDir().getPersonList()){
            Object[] row = new Object[2];
            row[0] = person.getPersonID();
            row[1] = person.getPersonName();
            model.addRow(row);
        }
    };
    public void populateCombobox() {
        cBoxOrgName.removeAllItems();
        for (Organization org: this.enterprise.getOrgDir().getOrgList()){
            cBoxOrgName.addItem(org);
        }
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cBoxOrgName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrgName;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JTable orgPeopleTable;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JTextField txtPersonName;
    // End of variables declaration//GEN-END:variables
}