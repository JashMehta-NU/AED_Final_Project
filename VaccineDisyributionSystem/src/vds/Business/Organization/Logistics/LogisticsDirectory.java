/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Organization.Logistics;

import java.util.ArrayList;

/**
 *
 * @author jigne
 */
public class LogisticsDirectory {
    private static ArrayList<Logistics> logisticsDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id, String name, String email, String contact,String city, String state, String country,String Admin,String AdminEmail,String location,String longitude,String latitude){
        logisticsDirectory.add(new Logistics(id,name,email,contact,city,state,country,Admin,AdminEmail,location,longitude,latitude));
    }
    
    public static ArrayList<Logistics> arrayReturn(){
        return logisticsDirectory;
    }
    
    public static int arrayListLength(){
        return logisticsDirectory.size();
    }
}
