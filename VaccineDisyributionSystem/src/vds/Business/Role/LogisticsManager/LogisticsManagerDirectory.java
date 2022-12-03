/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Role.LogisticsManager;

import java.util.ArrayList;

/**
 *
 * @author jigne
 */
public class LogisticsManagerDirectory {
    private static ArrayList<LogisticsManager> logisticsManagerDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id, String fname,String lname, String email, String contact, int age, String gender,String city, String state, String country,String dob,String password,String role){
        logisticsManagerDirectory.add(new LogisticsManager(id, fname, lname, email, contact, age, gender, city, state, country, dob, password,role));
    }
    
    public static ArrayList<LogisticsManager> arrayReturn(){
        return logisticsManagerDirectory;
    }
    
    public static int arrayListLength(){
        return logisticsManagerDirectory.size();
    }
}
