/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vds.Business.Organization;

/**
 *
 * @author jigne
 */
public class Organization {
    public int id;
    public String name;
    public String email;
    public String contact;
    public String city;
    public String state;
    public String country;
    public String Admin;
    public String AdminEmail;
    public String location;
    public String longitude;
    public String latitude;
    
    public Organization(int id, String name, String email, String contact,String city, String state, String country,String Admin,String AdminEmail,String location,String longitude,String latitude){
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.city=city;
        this.state=state;
        this.country=country;
        this.Admin=Admin;
        this.AdminEmail=AdminEmail;
        this.location=location;
        this.longitude=longitude;
        this.latitude=latitude;
        
    }
    
}

