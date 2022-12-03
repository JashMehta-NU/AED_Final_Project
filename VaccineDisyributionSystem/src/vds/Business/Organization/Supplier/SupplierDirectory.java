/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Organization.Supplier;

import java.util.ArrayList;

/**
 *
 * @author jigne
 */
public class SupplierDirectory {
    private static ArrayList<Supplier> supplierDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id, String name, String email, String contact,String city, String state, String country,String Admin,String AdminEmail,String location,String longitude,String latitude){
        supplierDirectory.add(new Supplier(id,name,email,contact,city,state,country,Admin,AdminEmail,location,longitude,latitude));
    }
    
    public static ArrayList<Supplier> arrayReturn(){
        return supplierDirectory;
    }
    
    public static int arrayListLength(){
         return supplierDirectory.size();
    }
}
