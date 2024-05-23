/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;



/**
 *
 * @author User
 */
public class Traveller {
    private String Name;
    private String Lastname;
    private String ID;
    public Traveller(){
        Name="no-name";
        Lastname="no-lastname";
        ID="none";
    }

    public Traveller(String Name, String Lastname, String ID) {
        this.Name = Name;
        this.Lastname = Lastname;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getID() {
        return ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
       
    @Override
    public String toString() {
        return  "Name: " + Name + "\nLastname: " + Lastname + "\nID: " + ID ;
    }
    
}
