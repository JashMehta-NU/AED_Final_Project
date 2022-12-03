/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.UserAccount;

/**
 *
 * @author JASH,JUBIN,AAYUSH
 */
public class UserAccount {
    public int id;
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
    
    public UserAccount(int id, String fname,String lname, String email, String contact, int age, String gender,String city, String state, String country,String dob,String password,String role){
        this.id = id;
        this.fname = fname;
        this.lname=lname;
        this.email = email;
        this.contact = contact;
        this.age = age;
        this.gender = gender;
        this.city=city;
        this.state=state;
        this.country=country;
        this.dob=dob;
        this.password=password;
        this.role=role;
    }
    
}
