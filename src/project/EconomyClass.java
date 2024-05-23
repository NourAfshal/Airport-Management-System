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
public class EconomyClass extends Ticket{
    
    private int seatNumber;
    

    public EconomyClass() {
        super();
        
        
    }

    public EconomyClass(String classType, int nbOfPassengers) {
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
        
        return super.toString() + "\nSeat Number: " + seatNumberForPassengers() + "\nPrice per ticket: " + (double)price/getNbOfPassengers() + "$\nTotal Price :"+price +"$";
    }
    
}
