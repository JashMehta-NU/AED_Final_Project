/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vds.UI.Hospital;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vds.Business.UserAccount.UserAccount;
import vds.Database.DBConnection;
import vds.UI.MainFrame;
import vds.UI.Patient.PatientMainFrame;
import vds.UI.Profile.MyProfile;
import vds.UI.SignInForm;
import vds.UI.SystemAdmin.ManageHospitalForm;

/**
 *
 * @author JASH,JUBIN,AAYUSH
 */
public class HospitalMainFrame extends javax.swing.JFrame {
 
    /**
     * Creates new form HospitalMainframe
     */
    DBConnection conn;
    Connection sqlConn;
    Resultset rs = null;
    PreparedStatementWrapper pst;

    public HospitalMainFrame() {
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
                pst = sqlConn.prepareStatement("SELECT * from `distributor` ");
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    distributorNameCombo.addItem(rs.getString(2));

                }

                //.setModel(new DefaultComboBoxModel<String>(SupplierAdmins.toArray(new String[0])));
            } catch (SQLException ex) {
                Logger.getLogger(ManageHospitalForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ParentPanel = new javax.swing.JPanel();
        appointmentScreen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();
        storageScreen = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        storageTable = new javax.swing.JTable();
        orderScreen = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        myOrderTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        vaccineName = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        orderBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        distributorNameCombo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ordersBtn = new javax.swing.JButton();
        appointmentBtn = new javax.swing.JButton();
        storageBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ParentPanel.setBackground(new java.awt.Color(97, 212, 195));
        ParentPanel.setLayout(new java.awt.CardLayout());

        appointmentScreen.setBackground(new java.awt.Color(97, 212, 195));

        appointmentTable.setForeground(new java.awt.Color(36, 47, 65));
        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Age", "Vaccine Name", "Date"
            }
        ));
        jScrollPane1.setViewportView(appointmentTable);

        javax.swing.GroupLayout appointmentScreenLayout = new javax.swing.GroupLayout(appointmentScreen);
        appointmentScreen.setLayout(appointmentScreenLayout);
        appointmentScreenLayout.setHorizontalGroup(
            appointmentScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        appointmentScreenLayout.setVerticalGroup(
            appointmentScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        ParentPanel.add(appointmentScreen, "card2");

        storageScreen.setBackground(new java.awt.Color(97, 212, 195));

        storageTable.setForeground(new java.awt.Color(36, 47, 65));
        storageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(storageTable);

        javax.swing.GroupLayout storageScreenLayout = new javax.swing.GroupLayout(storageScreen);
        storageScreen.setLayout(storageScreenLayout);
        storageScreenLayout.setHorizontalGroup(
            storageScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        storageScreenLayout.setVerticalGroup(
            storageScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        ParentPanel.add(storageScreen, "card3");

        orderScreen.setBackground(new java.awt.Color(97, 212, 195));

        myOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity", "Distributor"
            }
        ));
        jScrollPane3.setViewportView(myOrderTable);

        jLabel2.setText("Vaccine Name : ");

        vaccineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantity : ");

        orderBtn.setText("Order");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Distributor :");

        distributorNameCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                distributorNameComboItemStateChanged(evt);
            }
        });
        distributorNameCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                distributorNameComboKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout orderScreenLayout = new javax.swing.GroupLayout(orderScreen);
        orderScreen.setLayout(orderScreenLayout);
        orderScreenLayout.setHorizontalGroup(
            orderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
            .addGroup(orderScreenLayout.createSequentialGroup()
                .addGroup(orderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderScreenLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(orderScreenLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderScreenLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(orderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(orderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vaccineName, 0, 154, Short.MAX_VALUE)
                            .addComponent(distributorNameCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        orderScreenLayout.setVerticalGroup(
            orderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderScreenLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(orderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(distributorNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(orderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(orderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(orderBtn)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        ParentPanel.add(orderScreen, "card4");

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        ordersBtn.setText("Orders");
        ordersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersBtnActionPerformed(evt);
            }
        });

        appointmentBtn.setText("Appointment");
        appointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentBtnActionPerformed(evt);
            }
        });

        storageBtn.setText("Storage");
        storageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storageBtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(97, 212, 195));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(97, 212, 195));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital");

        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        profileBtn.setText("Profile");
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(appointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ordersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(storageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(ordersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ordersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersBtnActionPerformed
        ParentPanel.removeAll();
        ParentPanel.add(orderScreen);
        ParentPanel.repaint();
        ParentPanel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_ordersBtnActionPerformed

    private void appointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentBtnActionPerformed
        ParentPanel.removeAll();
        ParentPanel.add(appointmentScreen);
        ParentPanel.repaint();
        ParentPanel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentBtnActionPerformed

    private void storageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storageBtnActionPerformed
      
        PreparedStatement pst;
        while(storageTable.getRowCount()>0){
            ((DefaultTableModel) storageTable.getModel()).removeRow(0);
        } 
        try {
            String aEmail = SignInForm.userEmail;
            System.out.println("Hello");
            System.out.println(aEmail);
            pst = sqlConn.prepareStatement("SELECT * from `hospital` WHERE AdminEmail = ?");
            pst.setString(1,aEmail );
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                
    //                tableStorageModel.setRowCount(-);
                String vName = rs.getString(5);
                int quan = rs.getInt(6);
                Object[] rowData = new Object[]{vName, quan};
                ((DefaultTableModel) storageTable.getModel()).addRow(rowData);
            }

            //.setModel(new DefaultComboBoxModel<String>(SupplierAdmins.toArray(new String[0])));
        } catch (SQLException ex) {
            Logger.getLogger(ManageHospitalForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ParentPanel.removeAll();
        ParentPanel.add(storageScreen);
        ParentPanel.repaint();
        ParentPanel.revalidate();

        // TODO add your handling code here:
    }//GEN-LAST:event_storageBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        UserAccount.userFullName=("");
        MainFrame mf = new MainFrame();
        HospitalMainFrame em = new HospitalMainFrame();
        mf.setVisible(true);
        em.setVisible(false);
        super.dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // TODO add your handling code here:
        MyProfile mp = new MyProfile();
        PatientMainFrame pm = new PatientMainFrame();
        mp.setVisible(true);
        pm.setVisible(false);
        super.dispose();
    }//GEN-LAST:event_profileBtnActionPerformed

    private void vaccineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccineNameActionPerformed
    private void showJtableData(ResultSet rs) throws SQLException {
        while (myOrderTable.getRowCount() > 0) {
            ((DefaultTableModel) myOrderTable.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();

        while (rs.next()) {
            Object[] row = new Object[columns + 1];
            for (int i = 1; i <= columns; i++) {
                row[i - 1] = rs.getObject(i);

            }

            ((DefaultTableModel) myOrderTable.getModel()).insertRow(rs.getRow() - 1, row);
        }
    }
    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) myOrderTable.getModel();

        String VaccineName = vaccineName.getSelectedItem().toString();
        String vaccineQuantity = quantity.getText();
        int quantity = Integer.parseInt(vaccineQuantity);
        String distributorName = distributorNameCombo.getSelectedItem().toString();

        try {
            System.out.println("Here");
            String q = "INSERT INTO `vds`.`order` (VaccineType, Quantity, DistributorName, OrderBy, OrderByName) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement ps;
            ps = sqlConn.prepareStatement(q);

            ps.setString(1, VaccineName);
            ps.setString(2, vaccineQuantity);
            
            ps.setString(3, distributorName);
            ps.setString(4, "Hospital");
            ps.setString(5, SignInForm.orgName);

            int count = ps.executeUpdate();

            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Order Placed", "Congratulations", 1);

                // fetching data from order table
                PreparedStatement pst = sqlConn.prepareStatement("SELECT VaccineType,Quantity,Status,DistributorName,OrderBy,OrderByName from `vds`.`order` WHERE OrderByName=?");
                pst.setString(1, SignInForm.orgName);

                ResultSet rs = pst.executeQuery();
                showJtableData(rs);

            } else {
                JOptionPane.showMessageDialog(this, "Server Error", "Warning", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManageHospitalForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    
    }//GEN-LAST:event_orderBtnActionPerformed

    private void distributorNameComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_distributorNameComboKeyPressed
            vaccineName.removeAllItems();
        try {
            String dName = distributorNameCombo.getSelectedItem().toString();

            PreparedStatement ps = sqlConn.prepareStatement("SELECT * from `distributor` Where Name = ?  ");
            ps.setString(1, dName);
            ResultSet rs1 = ps.executeQuery();

            while (rs1.next()) {
                vaccineName.addItem(rs1.getString(5));

            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(HospitalMainFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_distributorNameComboKeyPressed

    private void distributorNameComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_distributorNameComboItemStateChanged
        vaccineName.removeAllItems();
        try {
            String dName = distributorNameCombo.getSelectedItem().toString();

            PreparedStatement ps = sqlConn.prepareStatement("SELECT * from `distributor` Where Name = ?  ");
            ps.setString(1, dName);
            ResultSet rs1 = ps.executeQuery();

            while (rs1.next()) {
                vaccineName.addItem(rs1.getString(5));

            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(HospitalMainFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_distributorNameComboItemStateChanged

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
            java.util.logging.Logger.getLogger(HospitalMainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalMainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalMainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalMainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JButton appointmentBtn;
    private javax.swing.JPanel appointmentScreen;
    private javax.swing.JTable appointmentTable;
    private javax.swing.JComboBox<String> distributorNameCombo;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable myOrderTable;
    private javax.swing.JButton orderBtn;
    private javax.swing.JPanel orderScreen;
    private javax.swing.JButton ordersBtn;
    private javax.swing.JButton profileBtn;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton storageBtn;
    private javax.swing.JPanel storageScreen;
    private javax.swing.JTable storageTable;
    private javax.swing.JComboBox<String> vaccineName;
    // End of variables declaration//GEN-END:variables
}
