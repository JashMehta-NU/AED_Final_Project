/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vds.UI.Logistics;

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
import vds.Business.UserAccount.UserAccount;
import vds.Database.DBConnection;
import vds.UI.Distributor.DistributorMainFrame;
import vds.UI.MainFrame;
import vds.UI.Patient.PatientMainFrame;
import vds.UI.Profile.MyProfile;
import vds.UI.SignInForm;
import vds.UI.SystemAdmin.ManageHospitalForm;

/**
 *
 * @author Jubin, Jash, Aayush
 */
public class LogisticsMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form LogisticsMainFrame
     */
    DBConnection conn;
    Connection sqlConn;
    Resultset rs = null;
    PreparedStatementWrapper pst;

    public LogisticsMainFrame() {
        initComponents();
        conn = new DBConnection();
        sqlConn = DBConnection.connectDB();
        if (conn == null) {
            JOptionPane.showMessageDialog(this,
                    "Database Error", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {

            PreparedStatement pst;
            try {
                pst = sqlConn.prepareStatement("SELECT LogisticsID,DistributorName,DistributorEmail,VaccineType,VaccineQuantity,DeliveryStatus from `vds`.`logistics`");
                ResultSet rs = pst.executeQuery();

                showJtableData(rs);

            } catch (SQLException ex) {
                Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private void showJtableData(ResultSet rs) throws SQLException {

        PreparedStatement pst;

        while (logisticsTable.getRowCount() > 0) {
            ((DefaultTableModel) logisticsTable.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();

        while (rs.next()) {
            Object[] row = new Object[columns + 1];
            for (int i = 1; i <= columns; i++) {
                row[i - 1] = rs.getObject(i);

            }
            row[4] = "Send Order";

            ((DefaultTableModel) logisticsTable.getModel()).insertRow(rs.getRow() - 1, row);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        UpdateStatusButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        logisticsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGISTICS ORDERS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("UPDATE ORDER STATUS");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Order ID:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("STATUS:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending ", "FullFilled" }));

        UpdateStatusButton.setText("UPDATE");
        UpdateStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStatusButtonActionPerformed(evt);
            }
        });

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("PROFILE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateStatusButton)
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(229, 229, 229)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jButton3))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateStatusButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        logisticsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Logistics ID", "Distributor", "Email", "Vaccine", "Quantity", "Delivery Status"
            }
        ));
        logisticsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logisticsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(logisticsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MyProfile mp = new MyProfile();
        PatientMainFrame pm = new PatientMainFrame();
        mp.setVisible(true);
        pm.setVisible(false);
        super.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void logisticsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logisticsTableMouseClicked
        // TODO add your handling code here:
        int row = logisticsTable.getSelectedRow();
        int column = logisticsTable.getColumnCount();
        String logEmail = logisticsTable.getValueAt(row, 1).toString();
        String logID = logisticsTable.getValueAt(row, 0).toString();

        try {
            if (column == 6) {
                PreparedStatement ps = sqlConn.prepareStatement("UPDATE logistics SET DeliveryStatus=? WHERE LogisticsID=?");
                ps.setString(1, "Delivered");
                ps.setString(2, logID);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this,
                        "Vaccine Delivered Successfully", "SucCess", JOptionPane.INFORMATION_MESSAGE);
                PreparedStatement pst;
                try {
                    pst = sqlConn.prepareStatement("SELECT LogisticsID,DistributorName,DistributorEmail,VaccineType,VaccineQuantity,DeliveryStatus,OrderID from `vds`.`logistics`");
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {

                        String vaccineQuantity = rs.getString(5);
                        String vaccine = rs.getString(4);
                        String orderID = rs.getString(7);
                        System.out.println("here" + vaccineQuantity);
                        checkAndUpdate(vaccineQuantity, vaccine);
                        update(vaccineQuantity, vaccine);
                        ordersUpdate(orderID);
                        showJtableData(rs);

                    }

                } catch (SQLException ex) {
                    Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_logisticsTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        UserAccount.userFullName = ("");
        MainFrame mf = new MainFrame();
        LogisticsMainFrame lm = new LogisticsMainFrame();
        lm.setVisible(false);
        mf.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    public void checkAndUpdate(String vaccineQuantity, String vaccine) {
        System.out.println("Valed checkup" + vaccineQuantity);
        try {
            PreparedStatement pst = sqlConn.prepareStatement("SELECT * from `vds`.`hospital`");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String vaccineName = rs.getString(5);
                System.out.println("hhere" + vaccineName);

                try {
                    PreparedStatement pS = sqlConn.prepareStatement("UPDATE hospital SET VaccineInStock = VaccineInStock + ?  WHERE  VaccineType = ?");
                    pS.setString(1, vaccineQuantity);
                    pS.setString(2, vaccine);
                    pS.executeUpdate();
                } catch (SQLException e) {
                    Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, e);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ordersUpdate(String orderID) {
        try {
            System.out.println("kk"+orderID);
            PreparedStatement pd = sqlConn.prepareStatement("UPDATE `vds`.`order` SET `Status` = ? WHERE `OrderID` = ?");

            pd.setString(1, "Delivered");
            pd.setString(2, orderID);
            System.out.println("update");
            pd.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void update(String vaccineQuantity, String vaccine) {

        try {
            PreparedStatement pst = sqlConn.prepareStatement("SELECT * from `vds`.`distributor`");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String vaccineName = rs.getString(5);
                System.out.println("hhere" + vaccineName);

                try {
                    PreparedStatement pS = sqlConn.prepareStatement("UPDATE distributor SET VaccineInStock = VaccineInStock - ?  WHERE  VaccineType = ?");
                    pS.setString(1, vaccineQuantity);
                    pS.setString(2, vaccine);
                    pS.executeUpdate();
                } catch (SQLException e) {
                    Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, e);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private void UpdateStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStatusButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateStatusButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LogisticsMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogisticsMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogisticsMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogisticsMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogisticsMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateStatusButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable logisticsTable;
    // End of variables declaration//GEN-END:variables
}
