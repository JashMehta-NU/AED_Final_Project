/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Organization.Hospital;

import java.util.ArrayList;

/**
 *
 * @author jigne
 */
public class HospitalDirectory {
    private static ArrayList<Hospital> hospitalDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id, String name, String email, String contact,String city, String state, String country,String Admin,String AdminEmail,String location,String longitude,String latitude){
        hospitalDirectory.add(new Hospital(id,name,email,contact,city,state,country,Admin,AdminEmail,location,longitude,latitude));
    }
    
    public static ArrayList<Hospital> arrayReturn(){
        return hospitalDirectory;
    }
    
    public static int arrayListLength(){
        return hospitalDirectory.size();
    }
}
