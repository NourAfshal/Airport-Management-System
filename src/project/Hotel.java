package project;


public class Hotel {
    
    private String name;
    private int quality;
    private int price;
    private int []hotel={1,2,3,4,5};
    private Payment paymentCash;
    private Payment paymentCredit;
    private int nbOfTravellers;
    
    public Hotel() {
        name="not-Booked";
        price=0;
        quality=0;
        
    }

    
    public Hotel(String name, int quality) {
        this.name = name;
        this.quality = quality;
       
       
    }
    
    public void setPrice(){
        paymentCash.setHotelPrice(price);
        paymentCredit.setHotelPrice(price);
    }

    public void setNbOfTravellers(int nbOfTravellers) {
        this.nbOfTravellers = nbOfTravellers;
    }
   

    public void setPaymentCash(Payment paymentCash) {
        this.paymentCash = paymentCash;
    }

    

    public void setPaymentCredit(Payment paymentCredit) {
        this.paymentCredit = paymentCredit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price*nbOfTravellers;
    }
    
    public String getName() {
        return name;
    }

    public int getQuality() {
        return quality;
    }
    public void calculatePrice() {
        price = (int)(Math.random() * 50) +10;
        price=quality * price;
    }

    
   @Override
    public String toString() {
        String s;
    
    
    if(quality==0){
        s="=============\nHOTEL DETAILS\n=============\nHotel not booked";
                  
    }
    
    else{
        s="=============\n"
         + "HOTEL DETAILS\n"
         + "=============\n"+
         "The hotel you have chosen is "+name +"\nWhich has a rating of "+getQuality()+ "\nStars and costs "+price/nbOfTravellers+"$ per night.\nTotal price :"+price+"$\n";
    }

    return s;
}

    
}
