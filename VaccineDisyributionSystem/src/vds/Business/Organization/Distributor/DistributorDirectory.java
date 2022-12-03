/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Organization.Distributor;

import java.util.ArrayList;

/**
 *
 * @author jigne
 */
public class DistributorDirectory {
    private static ArrayList<Distributor> distributorDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id, String name, String email, String contact,String city, String state, String country,String Admin,String AdminEmail,String location,String longitude,String latitude){
        distributorDirectory.add(new Distributor(id,name,email,contact,city,state,country,Admin,AdminEmail,location,longitude,latitude));
    }
    
    public static ArrayList<Distributor> arrayReturn(){
        return distributorDirectory;
    }
    
    public static int arrayListLength(){
        return distributorDirectory.size();
    }
}
