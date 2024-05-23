/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Admin
 */
public class flight {
    
    private String DestinationName;
    private int FlightNumber;
    private int  EPrice,FPrice,BPrice;
    
    public flight(){
       DestinationName="";
       FlightNumber=0;
       EPrice=0;
       FPrice=0;
       BPrice=0;
    }
    
    public String getDestinationName() {
        return DestinationName;
    }

    public void setDestinationName(String DestinationName) {
        this.DestinationName = DestinationName;
    }

    public int getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(int FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    public int getEPrice() {
        return EPrice;
    }

    public int getFPrice() {
        return FPrice;
    }

    public int getBPrice() {
        return BPrice;
    }

    public void setEPrice(int EPrice) {
        this.EPrice = EPrice;
    }

    public void setFPrice(int FPrice) {
        this.FPrice = FPrice;
    }

    public void setBPrice(int BPrice) {
        this.BPrice = BPrice;
    }
    

    @Override
    public String toString() {
        return "flight{" + "DestinationName: " + DestinationName + ", FlightNumber=" + FlightNumber + ", EPrice: " + EPrice + ", FPrice: " + FPrice + ", BPrice: " + BPrice + '}';
    }

    

   
    
    
    
    
}
