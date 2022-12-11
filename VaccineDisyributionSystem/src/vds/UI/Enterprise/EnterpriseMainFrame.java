/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vds.UI.Enterprise;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vds.Database.DBConnection;
import vds.UI.Distributor.*;
import vds.UI.SignInForm;

/**
 *
 * @author JUBIN,JASH,AAYUSH
 */
public class EnterpriseMainFrame extends javax.swing.JFrame {
    DBConnection conn;
    Connection sqlConn;
    Resultset rs = null;
    PreparedStatementWrapper pst;
    /**
     * Creates new form DistributorMainFrame
     */
    public EnterpriseMainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        conn = new DBConnection();
        sqlConn = DBConnection.connectDB();
        if (conn == null) {
            JOptionPane.showMessageDialog(this,
                    "Database Error", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {
            PreparedStatement pst;
            try {
                pst = sqlConn.prepareStatement("SELECT * from `Supplier` ");
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    supplierName.addItem(rs.getString(2));

                }

                //.setModel(new DefaultComboBoxModel<String>(SupplierAdmins.toArray(new String[0])));
            } catch (SQLException ex) {
                Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ParentPanel = new javax.swing.JPanel();
        Orders = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        FindOrderButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Storage = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        storageTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        FindVaccineButton = new javax.swing.JButton();
        Purchase = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        myOrderTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rawMaterial = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        supplierName = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        OrderVaccineButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(97, 212, 195));

        jButton1.setText("<-");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Enterprise");

        jButton2.setText("ORDERS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("STORAGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("PURCHASE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("PROFILE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addGap(45, 45, 45)
                .addComponent(jButton3)
                .addGap(48, 48, 48)
                .addComponent(jButton4)
                .addGap(43, 43, 43)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ParentPanel.setLayout(new java.awt.CardLayout());

        Orders.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setBackground(new java.awt.Color(97, 212, 195));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(97, 212, 195));
        jLabel2.setText("FIND ORDERS-");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Order ID", "Pending", "Fullfilled", " " }));

        FindOrderButton.setText("FIND");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Vaccine", "Amount", "Ordered By", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout OrdersLayout = new javax.swing.GroupLayout(Orders);
        Orders.setLayout(OrdersLayout);
        OrdersLayout.setHorizontalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrdersLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FindOrderButton)
                .addGap(97, 97, 97))
            .addComponent(jScrollPane1)
        );
        OrdersLayout.setVerticalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrdersLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindOrderButton)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
        );

        ParentPanel.add(Orders, "card2");

        Storage.setBackground(new java.awt.Color(0, 0, 153));

        storageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Vaccine ID", "Vaccine Name"
            }
        ));
        jScrollPane2.setViewportView(storageTable);

        jLabel3.setBackground(new java.awt.Color(97, 212, 195));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(97, 212, 195));
        jLabel3.setText("FIND VACCINE");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAME", "ID" }));

        FindVaccineButton.setText("FIND");

        javax.swing.GroupLayout StorageLayout = new javax.swing.GroupLayout(Storage);
        Storage.setLayout(StorageLayout);
        StorageLayout.setHorizontalGroup(
            StorageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(StorageLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FindVaccineButton)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        StorageLayout.setVerticalGroup(
            StorageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StorageLayout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(StorageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindVaccineButton)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ParentPanel.add(Storage, "card3");

        Purchase.setBackground(new java.awt.Color(0, 0, 204));

        myOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Raw Material", "Supplier", "Quantity", "Price"
            }
        ));
        jScrollPane3.setViewportView(myOrderTable);

        jLabel4.setBackground(new java.awt.Color(97, 212, 195));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(97, 212, 195));
        jLabel4.setText("ORDER VACCINE");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(97, 212, 195));
        jLabel5.setText("Raw Material");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(97, 212, 195));
        jLabel6.setText("Supplier");

        supplierName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                supplierNameItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(97, 212, 195));
        jLabel7.setText("Quantity:");

        OrderVaccineButton.setText("ORDER");
        OrderVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderVaccineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PurchaseLayout = new javax.swing.GroupLayout(Purchase);
        Purchase.setLayout(PurchaseLayout);
        PurchaseLayout.setHorizontalGroup(
            PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PurchaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PurchaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(291, 291, 291))
            .addGroup(PurchaseLayout.createSequentialGroup()
                .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PurchaseLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(OrderVaccineButton))
                    .addGroup(PurchaseLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PurchaseLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(PurchaseLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(8, 8, 8)))
                            .addGroup(PurchaseLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(44, 44, 44)))
                        .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(quantity)
                            .addComponent(rawMaterial, 0, 130, Short.MAX_VALUE)
                            .addComponent(supplierName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PurchaseLayout.setVerticalGroup(
            PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PurchaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(supplierName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PurchaseLayout.createSequentialGroup()
                        .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rawMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PurchaseLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)))
                .addComponent(OrderVaccineButton)
                .addGap(42, 42, 42))
        );

        ParentPanel.add(Purchase, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         ParentPanel.removeAll();
        ParentPanel.add(Purchase);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ParentPanel.removeAll();
        ParentPanel.add(Orders);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 PreparedStatement pst;
        while (storageTable.getRowCount() > 0) {
            ((DefaultTableModel) storageTable.getModel()).removeRow(0);
        }
        try {
            String aEmail = SignInForm.name;
            System.out.println("Hello");
            System.out.println(aEmail);
            pst = sqlConn.prepareStatement("SELECT * from `Enterprise` WHERE AdminEmail = ?");
            pst.setString(1, aEmail);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String vName = rs.getString(5);
                int quan = rs.getInt(6);
                Object[] rowData = new Object[]{vName, quan};
                ((DefaultTableModel) storageTable.getModel()).addRow(rowData);
            }

            //.setModel(new DefaultComboBoxModel<String>(SupplierAdmins.toArray(new String[0])));
        } catch (SQLException ex) {
            Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
         ParentPanel.removeAll();
        ParentPanel.add(Storage);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void supplierNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_supplierNameItemStateChanged
              
 rawMaterial.removeAllItems();
        try {
            String dName = supplierName.getSelectedItem().toString();

            PreparedStatement ps = sqlConn.prepareStatement("SELECT * from `Supplier` Where Name = ?  ");
            ps.setString(1, dName);
            ResultSet rs1 = ps.executeQuery();

            while (rs1.next()) {
                supplierName.addItem(rs1.getString(5));

            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(DistributorMainFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }    


        // TODO add your handling code here:
    }//GEN-LAST:event_supplierNameItemStateChanged

    private void OrderVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderVaccineButtonActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) myOrderTable.getModel();

        String VaccineName = rawMaterial.getSelectedItem().toString();
        String Quantity = quantity.getText();
        int quantity = Integer.parseInt(Quantity);
        String disName = supplierName.getSelectedItem().toString();

        Object[] rowData = new Object[]{VaccineName, quantity, disName};

        tableModel.addRow(rowData);           // TODO add your handling code here:
    }//GEN-LAST:event_OrderVaccineButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnterpriseMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterpriseMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterpriseMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterpriseMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterpriseMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FindOrderButton;
    private javax.swing.JButton FindVaccineButton;
    private javax.swing.JButton OrderVaccineButton;
    private javax.swing.JPanel Orders;
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JPanel Purchase;
    private javax.swing.JPanel Storage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable myOrderTable;
    private javax.swing.JTextField quantity;
    private javax.swing.JComboBox<String> rawMaterial;
    private javax.swing.JTable storageTable;
    private javax.swing.JComboBox<String> supplierName;
    // End of variables declaration//GEN-END:variables
}
