/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Role.Patient;

import vds.Business.UserAccount.UserAccount;

/**
 *
 * @author JASH,JUBIN,AAYUSH
 */
public class Patient extends UserAccount {
    public Patient(int id, String fname,String lname, String email, String contact, int age, String gender,String city, String state, String country,String dob,String password,String role){
        super(id,fname,lname,email,contact,age,gender,city,state,country,dob,password,role);
    }
}
