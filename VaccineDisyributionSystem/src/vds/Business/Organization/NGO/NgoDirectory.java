/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Organization.NGO;

import java.util.ArrayList;

/**
 *
 * @author jigne
 */
public class NgoDirectory {
    private static ArrayList<Ngo> ngoDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id, String name, String email, String contact,String city, String state, String country,String Admin,String AdminEmail,String location,String longitude,String latitude){
        ngoDirectory.add(new Ngo(id,name,email,contact,city,state,country,Admin,AdminEmail,location,longitude,latitude));
    }
    
    public static ArrayList<Ngo> arrayReturn(){
        return ngoDirectory;
    }
    
    public static int arrayListLength(){
        return ngoDirectory.size();
    }
}
