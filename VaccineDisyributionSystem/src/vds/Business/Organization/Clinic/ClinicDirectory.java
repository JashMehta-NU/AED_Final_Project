/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Organization.Clinic;

import java.util.ArrayList;

/**
 *
 * @author jigne
 */
public class ClinicDirectory {
    private static ArrayList<Clinic> clinicDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id, String name, String email, String contact,String city, String state, String country,String Admin,String AdminEmail,String location,String longitude,String latitude){
        clinicDirectory.add(new Clinic(id,name,email,contact,city,state,country,Admin,AdminEmail,location,longitude,latitude));
    }
    
    public static ArrayList<Clinic> arrayReturn(){
        return clinicDirectory;
    }
    
    public static int arrayListLength(){
        return clinicDirectory.size();
    }
}
