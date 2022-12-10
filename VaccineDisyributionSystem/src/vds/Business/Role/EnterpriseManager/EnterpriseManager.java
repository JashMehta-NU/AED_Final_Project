/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Role.EnterpriseManager;

import vds.Business.UserAccount.UserAccount;

/**
 *
 * @author JASH,JUBIN,AAYUSH
 */
public class EnterpriseManager extends UserAccount {
    public EnterpriseManager(String fname,String lname, String email, String contact, int age, String gender,String city, String state, String country,String dob,String password,String role){
        super(fname,lname,email,contact,age,gender,city,state,country,dob,password,role);
    }
    public void addToDatabase(){
        super.addToDB();
    }
}
