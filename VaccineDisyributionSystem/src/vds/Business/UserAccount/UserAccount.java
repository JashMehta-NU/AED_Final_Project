/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.UserAccount;

import com.mysql.cj.jdbc.PreparedStatement;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import vds.Database.DBConnection;

/**
 *
 * @author JASH,JUBIN,AAYUSH
 */
public class UserAccount {

    public String fname;
    public String lname;
    public String email;
    public String contact;
    public int age;
    public String gender;
    public String city;
    public String state;
    public String country;
    public String dob;
    public String password;
    public String role;
    public static String userFullName;
    public static String userEmail;
    public static String userContact;
    public static String userCity;
    public static String userRole;
    

    public UserAccount(String fname, String lname, String email, String contact, int age, String city, String state, String country, String password, String gender, String dob, String role) {

        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.contact = contact;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.state = state;
        this.country = country;
        this.dob = dob;
        this.password = password;
        this.role = role;
    }

    public UserAccount(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public void addToDB() {
        DBConnection conn;
        Connection sqlConn;
        sqlConn = DBConnection.connectDB();

        try {
            java.sql.PreparedStatement pst = sqlConn.prepareStatement("INSERT INTO `vds`.`user` (Fname, Lname, Email, Contact, Age, City, State, Country, Password, Gender, DOB, Role) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, email);
            pst.setString(4, contact);
            pst.setInt(5, age);
            pst.setString(6, city);
            pst.setString(7, state);
            pst.setString(8, country);
            pst.setString(9, password);
            pst.setString(10, gender);
            pst.setString(11, dob);
            pst.setString(12, role);

            pst.executeUpdate();

            this.sendEmail(email, fname);

        } catch (SQLException ex) {
            Logger.getLogger(UserAccount.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void authenticateUser(String email, String password, String role) throws SQLException {
        DBConnection conn;
        Connection sqlConn;
        sqlConn = DBConnection.connectDB();
        
        java.sql.PreparedStatement pst = sqlConn.prepareStatement("SELECT * from `vds`.`user` WHERE email=? and password=? and role=?");
        pst.setString(1, email);
        pst.setString(2, password);
        pst.setString(3, role);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {    
            userFullName = rs.getString("Fname") + rs.getString("Lname");
            userEmail = rs.getString("Email");
            userContact = rs.getString("Contact");
            userCity = rs.getString("City");
            userRole = rs.getString("Role");
        }
       
        

    }

    public static void sendEmail(String toEmail, String fName) {
        String userName = "vaccinematrixx@gmail.com";
        String password = "etvhbqcdmkkqyqfe";

        Properties properties = System.getProperties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.user", userName);
        properties.put("mail.smtp.password", password);
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        });
        //Start our mail message
        Message msg = new MimeMessage(session);
        try {

            msg.setFrom(new InternetAddress(userName));
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            msg.setSubject("Welcome to Vaccine Matrix");
            msg.setText("Hii\t" + fName + "\n Welcome to Vaccine Matrix \n We are looking forward to help you in this journey");

            Transport.send(msg);
            System.out.println("Sent message");
        } catch (Exception e) {
            System.out.println(e);;
        }
        // TODO Auto-generated catch block
    }

}
