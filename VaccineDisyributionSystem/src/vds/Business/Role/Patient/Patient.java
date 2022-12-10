/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Role.Patient;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vds.Business.UserAccount.UserAccount;
import vds.Database.DBConnection;

/**
 *
 * @author JASH,JUBIN,AAYUSH
 */
public class Patient extends UserAccount {
    public Patient(String fname,String lname, String email, String contact, int age, String city, String state, String country,String password,String gender,String dob,String role){
        super(fname,lname,email,contact,age,city,state,country,password,gender,dob,role);    
    }
    
    public void addToDatabase(){
        super.addToDB();
    }
    
}
