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
public class CreditCard extends Payment{
    
    private String credit;
    private double totalPayment;

    public CreditCard() {
        credit="XXXX XXXX XXXX XXXX";
        totalPayment=0;
    }

    public String getCredit() {
        return credit;
    }

    @Override
    public void setCredit(String credit) {
        this.credit = credit;
    }

    public double getTotalPayment() {
        return totalPayment=ticketPrice+hotelPrice;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
    
    @Override
    public String toString(){
        String s="\nYour total payment with taxes is "+totalPayment()+"$\nSuccessfully paid. \nEnjoy your flight!";
        if(!check()){
            s="\nSorry, you don't have enough money in your bank account.";
        }
        return s;
    }

    public boolean check(){
        double account=10000;
        
        if(account<totalPayment()){
            return false;
        }
        return true;
    }
    
    
    @Override
    public double totalPayment() {
        int taxes=(int)(Math.random()*50)+10;
        return taxes+=getTotalPayment();
    }
    
}
