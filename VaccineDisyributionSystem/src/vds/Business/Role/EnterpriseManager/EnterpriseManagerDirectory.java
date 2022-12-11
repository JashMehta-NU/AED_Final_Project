/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Role.EnterpriseManager;

import java.util.ArrayList;

/**
 *
 * @author jigne
 */
public class EnterpriseManagerDirectory {
    private static ArrayList<EnterpriseManager> enterpriseManagerDirectory = new ArrayList<>();
    
    public static void addArrayListItem(String fname,String lname, String email, String contact, int age, String gender,String city, String state, String country,String dob,String password,String role){
        enterpriseManagerDirectory.add(new EnterpriseManager(fname, lname, email, contact, age, gender, city, state, country, dob, password,role));
    }
    
    public static ArrayList<EnterpriseManager> arrayReturn(){
        return enterpriseManagerDirectory;
    }
    
    public static int arrayListLength(){
        return enterpriseManagerDirectory.size();
    }
}
