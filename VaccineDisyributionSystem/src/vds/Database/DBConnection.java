/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Database;
import java.sql.*;

/**
 *
 * @author Jash, Jubin, Aayush
 */
public class DBConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/vds";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection connectDB(){
        Connection conn = null;
        try{
            //register jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //open connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connected To Database");
            return conn;
        }catch(Exception e){
            System.out.println("Error Connecting to Database" +e);
            return null;
        }
    }

    public com.mysql.cj.xdevapi.Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
