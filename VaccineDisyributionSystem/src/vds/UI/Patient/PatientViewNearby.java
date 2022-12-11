/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vds.UI.Patient;

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
import vds.UI.SignInForm;

/**
 *
 * @author Jubin Kamdar
 */
public class PatientViewNearby extends javax.swing.JFrame {

    /**
     * Creates new form PatientViewNearby
     */
    DBConnection conn;
    Connection sqlConn;
    Resultset rs;
    PreparedStatementWrapper pst = null;
    public static String viewNearBy = "Hospital";

    public static String orgName;
    public static String orgEmail;
    public static String orgContact;
    public static String orgLocation;
    
    public PatientViewNearby() {
        initComponents();
        conn = new DBConnection();
        sqlConn = DBConnection.connectDB();

        if (conn == null) {
            JOptionPane.showMessageDialog(this,
                    "Database Error", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {
            String cityLocation = UserAccount.userCity;
            fetchAndFillJTableWithNearByValues(viewNearBy, cityLocation);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        nearByDataTable = new javax.swing.JTable();
        viewNearbyComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nearByDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Contact", "City", "State", "Vaccine Availablity", "Vaccine Type", "Book Appointment", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nearByDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nearByDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(nearByDataTable);

        viewNearbyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hospital", "NGO", "Clinic" }));
        viewNearbyComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                viewNearbyComboBoxItemStateChanged(evt);
            }
        });

        jLabel1.setText("View Nearby");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewNearbyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewNearbyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showJtableData(ResultSet rs) throws SQLException {
        while (nearByDataTable.getRowCount() > 0) {
            ((DefaultTableModel) nearByDataTable.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();
        
        while (rs.next()) {
            Object[] row = new Object[columns + 1];
            for (int i = 1; i <= columns; i++) {
                row[i - 1] = rs.getObject(i);
                
                if (Integer.valueOf(rs.getString(6)) > 0) {
                    row[7] = "Click Here";
                } else {
                    row[7] = "Not Slots";
                }
            }
            
            row[8] = "Show Location";
            orgName = rs.getString("Name");
            orgEmail = rs.getString("Email");
            orgContact = "+1 " + rs.getString("Contact");
            orgLocation = rs.getString("Location");
            
            ((DefaultTableModel) nearByDataTable.getModel()).insertRow(rs.getRow() - 1, row);
        }
    }

    private void fetchAndFillJTableWithNearByValues(String viewNearBy, String cityLocation) {
        ResultSet rs;
        try {
            if (viewNearBy.equals("Hospital")) {
                PreparedStatement pst = sqlConn.prepareStatement("SELECT Name,Email,Contact,City,State,VaccineInStock,VaccineType,Location from `vds`.`hospital` WHERE city=?");
                pst.setString(1, cityLocation);
                rs = pst.executeQuery();

                showJtableData(rs);

            } else if (viewNearBy.equals("NGO")) {
                PreparedStatement pst = sqlConn.prepareStatement("SELECT Name,Email,Contact,City,State,VaccineInStock,VaccineType,Location from `vds`.`ngo` WHERE city=?");
                pst.setString(1, cityLocation);
                rs = pst.executeQuery();
                showJtableData(rs);
            } else {
                PreparedStatement pst = sqlConn.prepareStatement("SELECT Name,Email,Contact,City,State,VaccineInStock,VaccineType,Location from `vds`.`clinic` WHERE city=?");
                pst.setString(1, cityLocation);
                rs = pst.executeQuery();
                showJtableData(rs);
            }
        } catch (Exception ex) {
            Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void viewNearbyComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_viewNearbyComboBoxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 1) {
            viewNearBy = String.valueOf(viewNearbyComboBox.getSelectedItem());
            String cityLocation = "Boston";
            fetchAndFillJTableWithNearByValues(viewNearBy, cityLocation);
        }
    }//GEN-LAST:event_viewNearbyComboBoxItemStateChanged

    private void nearByDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nearByDataTableMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {     // to detect doble click events
            int row = nearByDataTable.getSelectedRow(); // select a row
            int column = nearByDataTable.getSelectedColumn(); // select a column
            if (column == 7) {
                PatientBookingFrame pbf = new PatientBookingFrame();
                PatientViewNearby nl = new PatientViewNearby();
                nl.setVisible(false);
                pbf.setVisible(true);
                super.dispose();
            }
            if(column == 8){
                MainMap mm = new MainMap();
                PatientViewNearby nl = new PatientViewNearby();
                nl.setVisible(false);
                mm.setVisible(true);
                super.dispose();
                
            }

        }
    }//GEN-LAST:event_nearByDataTableMouseClicked

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
            java.util.logging.Logger.getLogger(PatientViewNearby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientViewNearby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientViewNearby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientViewNearby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientViewNearby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable nearByDataTable;
    private javax.swing.JComboBox<String> viewNearbyComboBox;
    // End of variables declaration//GEN-END:variables
}
