/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Role.HospitalAdmin;

import java.sql.SQLException;
import vds.Business.UserAccount.UserAccount;

/**
 *
 * @author JASH,JUBIN,AAYUSH
 */
public class HospitalAdmin extends UserAccount {
    public HospitalAdmin(String fname,String lname, String email, String contact, int age, String city, String state, String country,String password,String gender,String dob,String role){
        super(fname,lname,email,contact,age,city,state,country,password,gender,dob,role);
    }
    public void addToDatabase(){
        super.addToDB();
    }
     public HospitalAdmin (String email, String password,String role){
       super(email,password,role);
   }
    public void checkValidUser() throws SQLException{
        super.authenticateUser(email,password,role);
    }
}
