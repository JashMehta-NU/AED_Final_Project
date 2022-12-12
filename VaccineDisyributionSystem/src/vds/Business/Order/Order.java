/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Order;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vds.Database.DBConnection;
import vds.UI.SignInForm;

/**
 *
 * @author jigne
 */
public class Order {
    String VaccineType;
    String quantity;
    String status;
    String orgName;
    String orderBy;
    String orderByName;
    public static int count;
    public Order(String VaccineType,String quantity,String status,String orgName,String orderBy,String orderByName){
        this.VaccineType=VaccineType;
        this.quantity=quantity;
        this.status=status;
        this.orgName=orgName;
        this.orderBy=orderBy;
        this.orderByName=orderByName;
    }
    
    public void addOrderToDB() throws SQLException{
        DBConnection conn;
        Connection sqlConn;
        sqlConn = DBConnection.connectDB();

        try {
            java.sql.PreparedStatement pst = sqlConn.prepareStatement("INSERT INTO `vds`.`order` (VaccineType, Quantity,Status, DistributorName, OrderBy, OrderByName) VALUES (?, ?, ?, ?, ?, ?)");
            pst.setString(1, this.VaccineType);
            pst.setString(2, this.quantity);
            pst.setString(3, this.status);
            pst.setString(4, this.orgName);
            pst.setString(5, this.orderBy);
            pst.setString(6,this.orderByName);
          
            count = pst.executeUpdate();

            

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    public static ResultSet fetchOrderFromDB() throws SQLException{
        DBConnection conn;
        Connection sqlConn;
        PreparedStatement pst;
        sqlConn = DBConnection.connectDB();
        pst = sqlConn.prepareStatement("SELECT VaccineType,Quantity,OrderByName,Status,OrderID from `vds`.`order` WHERE DistributorName=?");
        pst.setString(1, SignInForm.orgName);
        ResultSet rs = pst.executeQuery();
        return rs;
    }
}
