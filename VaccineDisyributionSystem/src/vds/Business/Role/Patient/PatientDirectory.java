/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Role.Patient;

import java.util.ArrayList;

/**
 *
 * @author jigne
 */
public class PatientDirectory {
    private static ArrayList<Patient> patientDirectory = new ArrayList<>();
    
    public static void addArrayListItem( String fname,String lname, String email, String contact, int age, String gender,String city, String state, String country,String dob,String password,String role){
        patientDirectory.add(new Patient( fname, lname, email, contact, age, gender, city, state, country, dob, password,role));
    }
    
    public static ArrayList<Patient> arrayReturn(){
        return patientDirectory;
    }
    
    public static int arrayListLength(){
        return patientDirectory.size();
    }
}
