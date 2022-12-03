/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Role.NgoAdmin;

import java.util.ArrayList;

/**
 *
 * @author jigne
 */
public class NgoAdminDirectory {
    private static ArrayList<NgoAdmin> ngoAdminDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id, String fname,String lname, String email, String contact, int age, String gender,String city, String state, String country,String dob,String password,String role){
        ngoAdminDirectory.add(new NgoAdmin(id, fname, lname, email, contact, age, gender, city, state, country, dob, password,role));
    }
    
    public static ArrayList<NgoAdmin> arrayReturn(){
        return ngoAdminDirectory;
    }
    
    public static int arrayListLength(){
        return ngoAdminDirectory.size();
    }
}
