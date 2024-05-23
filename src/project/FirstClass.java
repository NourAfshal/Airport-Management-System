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
public class FirstClass extends Ticket{
    
    private int seatNumber;
    

    public FirstClass() {
        super(); 
    }

    public FirstClass(String classType, int nbOfPassengers) {
        super(classType, nbOfPassengers);
    }

    public int getSeatNumber() {
        seatNumber = (int) ((Math.random() * 100) + 1);
        return seatNumber;
    }
    
    @Override
     public void setprice(int price){
         this.price=price*getNbOfPassengers();
        paymentCash.setTicketPrice(price*getNbOfPassengers());
        paymentCredit.setTicketPrice(price*getNbOfPassengers());
        
    }
    
    @Override
    public void setPaymentCash(Payment paymentCash) {
        this.paymentCash = paymentCash;
    }
    @Override
    public void setNbOfPassengers(int nbOfPassengers) {
        this.nbOfPassengers = nbOfPassengers;
    }
    @Override
    public void setClassType(String classType) {
        this.classType = classType;
    }

   public int calculatePrice() {
        int price1 =  getNbOfPassengers()*(int)((Math.random() * 10) + 500);
        
        if (getNbOfPassengers() > 1) {
             return (int) (price1 - ( price1 * 0.05));
            
        }
        
       return price1; 
    }
    public String seatNumberForPassengers() {
        
        int nbOfPassengerss = getNbOfPassengers();
        int currentSeat=getSeatNumber();
        String seatNb = currentSeat + "";
        
        while (nbOfPassengerss > 1) {
            seatNb += ", " + (currentSeat+1);
            ++currentSeat;
            nbOfPassengerss--;
        }
        
        return seatNb;
    }

    @Override
    public String toString() {
        
        
        return super.toString() + "\nSeat Number: " + seatNumberForPassengers() + "\nPrice per ticket: "+ (double)price/getNbOfPassengers() + "$\nTotal Price :"+price+"$";
    }
    
}
