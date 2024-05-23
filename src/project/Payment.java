/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author user
 */
public abstract class Payment {
    
    protected double totalPrice;
    protected double hotelPrice;
    protected double ticketPrice;
    
    Payment(){
        
    }
    
    Payment(double totalPrice){
        this.totalPrice=totalPrice;
    }

    
    public void setHotelPrice(double hotelprice) {
        this.hotelPrice = hotelprice;
    }

    public void setTicketPrice(double ticketprice) {
        this.ticketPrice = ticketprice;
    }
    
    
    
    public abstract double totalPayment();
    public abstract void setCredit(String credit);
    
}
