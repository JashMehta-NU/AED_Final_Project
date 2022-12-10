/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Organization.Distributor;

import vds.Business.Organization.Organization;

/**
 *
 * @author jigne
 */
public class Distributor extends Organization {
    public Distributor(int id, String name, String email, String contact,String city, String state, String country,String Admin,String AdminEmail,String location,String longitude,String latitude){
        super(id,name,email,contact,city,state,country,Admin,AdminEmail,location,longitude,latitude);   
}
}
