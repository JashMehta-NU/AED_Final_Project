/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vds.UI.Distributor;

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
import vds.UI.MainFrame;
import vds.UI.Patient.PatientMainFrame;
import vds.UI.Profile.MyProfile;
import vds.UI.SignInForm;
import vds.UI.SystemAdmin.ManageHospitalForm;

/**
 *
 * @author JUBIN,JASH,AAYUSH
 */
public class DistributorMainFrame extends javax.swing.JFrame {

    DBConnection conn;
    Connection sqlConn;
    Resultset rs = null;
    PreparedStatementWrapper pst;
    String orderID;
    /**
     * Creates new form DistributorMainFrame
     */
    public static String VaccineType;

    public DistributorMainFrame() {
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
                System.out.println(SignInForm.orgName);
                pst = sqlConn.prepareStatement("SELECT VaccineType,Quantity,OrderByName,Status,OrderID from `vds`.`order` WHERE DistributorName=?");
                pst.setString(1, SignInForm.orgName);
                ResultSet rs = pst.executeQuery();

                showJtableData(rs);

            } catch (SQLException ex) {
                Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, ex);
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
        orderTable = new javax.swing.JTable();
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
        vaccineNameComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        enterpriseNameComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        quantityTextfield = new javax.swing.JTextField();
        OrderVaccineButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(97, 212, 195));

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Distributor");

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
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
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

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine", "Quantity", "Ordered By", "Status", "Dispatch Order", "Order lD"
            }
        ));
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderTable);

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
                .addContainerGap(183, Short.MAX_VALUE))
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
        Purchase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PurchaseFocusLost(evt);
            }
        });

        myOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Vaccine Name", "Enterprise", "Quantity"
            }
        ));
        jScrollPane3.setViewportView(myOrderTable);

        jLabel4.setBackground(new java.awt.Color(97, 212, 195));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(97, 212, 195));
        jLabel4.setText("ORDER VACCINE");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(97, 212, 195));
        jLabel5.setText("Vaccine:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(97, 212, 195));
        jLabel6.setText("Enterprise:");

        enterpriseNameComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                enterpriseNameComboBoxItemStateChanged(evt);
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PurchaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(291, 291, 291))
            .addGroup(PurchaseLayout.createSequentialGroup()
                .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PurchaseLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(OrderVaccineButton))
                    .addGroup(PurchaseLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(quantityTextfield)
                            .addComponent(vaccineNameComboBox, 0, 130, Short.MAX_VALUE)
                            .addComponent(enterpriseNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PurchaseLayout.setVerticalGroup(
            PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PurchaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(enterpriseNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(OrderVaccineButton)
                .addGap(32, 32, 32))
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

    private void showJtableData(ResultSet rs) throws SQLException {

        PreparedStatement pst;

        while (orderTable.getRowCount() > 0) {
            ((DefaultTableModel) orderTable.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();
        System.out.println("cols" + columns);
        while (rs.next()) {
            orderID = rs.getString("OrderID");
            Object[] row = new Object[columns + 1];
            for (int i = 1; i <= columns; i++) {

                row[i - 1] = rs.getObject(i);

            }
            row[4] = "Send Order";
            row[5] = rs.getString("OrderID");
            //row[5] =rs.getString("OrderID");

            ((DefaultTableModel) orderTable.getModel()).insertRow(rs.getRow() - 1, row);
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        System.out.println("here");
        try {
            PreparedStatement Epst = sqlConn.prepareStatement("SELECT * from `vds`.`enterprise`");

            ResultSet Ers = Epst.executeQuery();
            while (Ers.next()) {
                enterpriseNameComboBox.addItem(Ers.getString("Name"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        ParentPanel.removeAll();
        ParentPanel.add(Purchase);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PreparedStatement pst;
        try {
            pst = sqlConn.prepareStatement("SELECT VaccineType,Quantity,OrderByName,Status from `vds`.`order` WHERE DistributorName=?");
            pst.setString(1, SignInForm.orgName);
            ResultSet rs = pst.executeQuery();

            showJtableData(rs);

        } catch (SQLException ex) {
            Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            String aEmail = UserAccount.userEmail;
            System.out.println("Hello");
            System.out.println(aEmail);
            pst = sqlConn.prepareStatement("SELECT * from `distributor` WHERE AdminEmail = ?");
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
        }

        // TODO add your handling code here:
        ParentPanel.removeAll();
        ParentPanel.add(Storage);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void OrderVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderVaccineButtonActionPerformed
        try {
            System.out.println("Here");
            String q = "INSERT INTO `vds`.`order` (VaccineType, Quantity, DistributorName, OrderBy, OrderByName) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement ps;
            ps = sqlConn.prepareStatement(q);

            ps.setString(1, vaccineNameComboBox.getSelectedItem().toString());
            ps.setString(2, quantityTextfield.getText());
            ps.setString(3, enterpriseNameComboBox.getSelectedItem().toString());
            ps.setString(4, "Distributor");
            ps.setString(5, SignInForm.orgName);

            int count = ps.executeUpdate();

            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Order Placed", "Congratulations", 1);

                // fetching data from order table
                PreparedStatement pst = sqlConn.prepareStatement("SELECT VaccineType,Quantity,Status,DistributorName,OrderBy,OrderByName from `vds`.`order` WHERE OrderByName=?");
                pst.setString(1, SignInForm.orgName);

                ResultSet rs = pst.executeQuery();

//                while (orderTable.getRowCount() > 0) {
//                    ((DefaultTableModel) myOrderTable.getModel()).removeRow(0);
//                }
//                int columns = rs.getMetaData().getColumnCount();
//
//                while (rs.next()) {
//                    Object[] row = new Object[columns + 1];
//                    for (int i = 1; i <= columns; i++) {
//                        row[i - 1] = rs.getObject(i);
//
//                    }
//                    row[4] = "Send Order";
//
//                    ((DefaultTableModel) orderTable.getModel()).insertRow(rs.getRow() - 1, row);
//                }
            } else {
                JOptionPane.showMessageDialog(this, "Server Error", "Warning", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManageHospitalForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_OrderVaccineButtonActionPerformed

    private void enterpriseNameComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_enterpriseNameComboBoxItemStateChanged
        vaccineNameComboBox.removeAllItems();
        try {
            String dName = enterpriseNameComboBox.getSelectedItem().toString();

            PreparedStatement ps = sqlConn.prepareStatement("SELECT * from `Enterprise` Where Name = ?  ");
            ps.setString(1, dName);
            ResultSet rs1 = ps.executeQuery();

            while (rs1.next()) {
                vaccineNameComboBox.addItem(rs1.getString(5));
            }

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(DistributorMainFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }              // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNameComboBoxItemStateChanged

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        // TODO add your handling code here: 
        int row = orderTable.getSelectedRow();
        int column = orderTable.getColumnCount();
        String CurrentQuantity = orderTable.getValueAt(row, 1).toString();
        String VaccineName = orderTable.getValueAt(row, 0).toString();

        System.out.println("Curr QTY:- " + CurrentQuantity + "VaccineName:- " + VaccineName);

        String aEmail = UserAccount.userEmail;

        try {
            PreparedStatement ps = sqlConn.prepareStatement("SELECT VaccineInStock from `vds`.`distributor` WHERE AdminEmail = ? AND VaccineType=?");
            ps.setString(1, aEmail);
            ps.setString(2, VaccineName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(rs.getString("VaccineInStock"));
                if (Integer.parseInt(CurrentQuantity) < Integer.parseInt(rs.getString("VaccineInStock"))) {
                    System.out.println("In here");
                    String distributorName = SignInForm.orgName;
                    PreparedStatement Lpst = sqlConn.prepareStatement("INSERT INTO `vds`.`logistics` (DistributorName, DistributorEmail, VaccineType, VaccineQuantity, OrderID) VALUES (?, ?, ?, ?,?);");
                    Lpst.setString(1, distributorName);
                    Lpst.setString(2, aEmail);
                    Lpst.setString(3, VaccineName);
                    Lpst.setString(4, CurrentQuantity);
                    Lpst.setString(5, orderID);

                    Lpst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Order Dispatched", "Congratualations", 1);

                } else {
                    JOptionPane.showMessageDialog(this, "Not Enough Quantity", "Warning", 2);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(DistributorMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_orderTableMouseClicked

    private void PurchaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PurchaseFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_PurchaseFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserAccount.userFullName = ("");
        MainFrame mf = new MainFrame();
        DistributorMainFrame dm = new DistributorMainFrame();
        mf.setVisible(true);
        dm.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        MyProfile mp = new MyProfile();
        PatientMainFrame pm = new PatientMainFrame();
        mp.setVisible(true);
        pm.setVisible(false);
        super.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(DistributorMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DistributorMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DistributorMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DistributorMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DistributorMainFrame().setVisible(true);
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
    private javax.swing.JComboBox<String> enterpriseNameComboBox;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable myOrderTable;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField quantityTextfield;
    private javax.swing.JTable storageTable;
    private javax.swing.JComboBox<String> vaccineNameComboBox;
    // End of variables declaration//GEN-END:variables
}
