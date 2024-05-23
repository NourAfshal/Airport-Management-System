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
public class Cash extends Payment{
    
    private final String Address="The Airport Information Desks";
    
    public Cash(){
    super();
     }
    
    
    @Override
    public String toString(){
        return "Your total payment is "+totalPayment()+"$ \nshould be paid at "+Address;
    }

    @Override
    public double totalPayment() {
        totalPrice=hotelPrice+ticketPrice;
         return totalPrice;
    }

    @Override
    public void setCredit(String credit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
