/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Role.SupplyManager;

import java.util.ArrayList;

/**
 *
 * @author jigne
 */
public class SupplyManagerDirectory {
    private static ArrayList<SupplyManager> supplyManagerDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id, String fname,String lname, String email, String contact, int age, String gender,String city, String state, String country,String dob,String password,String role){
        supplyManagerDirectory.add(new SupplyManager(fname, lname, email, contact, age, gender, city, state, country, dob, password,role));
    }
    
    public static ArrayList<SupplyManager> arrayReturn(){
        return supplyManagerDirectory;
    }
    
    public static int arrayListLength(){
        return supplyManagerDirectory.size();
    }
}
