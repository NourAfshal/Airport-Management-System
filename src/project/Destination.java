package project;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Destination {
    
    private String countryName;
    private int days;
    private Hotel hotels;
    
    public Destination() {
        countryName=null;
        days=0;
        hotels=new Hotel();
    }
    public Destination(String countryName, int days) {
        this.countryName = countryName;
        this.days = days;
        hotels=new Hotel();
    }

    public void setNbOfTravellers(int nbOfTravellers) {
        hotels.setNbOfTravellers(nbOfTravellers);
    }
    
    public void setcashpayment(Payment paymentCash){
        hotels.setPaymentCash(paymentCash);
    }
    public void setcreditpayment(Payment paymentCredit){
        hotels.setPaymentCredit(paymentCredit);
    }
    public void insertHotel(JPanel panel,JButton reset){
        JLabel Name=new JLabel();
        Name.setText("<html><p style=\"color:white;\" >Enter the name of the hotel:</p></html> ");
        Name.setBounds(5, 340, 200, 20);
        panel.add(Name);
        JTextField Nameh=new JTextField();
        Nameh.setBounds(5, 360, 150, 20);
        Nameh.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Nameh.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(Nameh);
        Nameh.addKeyListener(new KeyAdapter(){
            
              @Override
              public void keyPressed(KeyEvent e){
               if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                   
                   hotels.setName(Nameh.getText());
                   Nameh.setEnabled(false);
               }
            }  
          });
        JLabel stars=new JLabel();
        stars.setText("<html><p style=\"color:white;\" >Enter the number of stars for the hotel:</p></html> ");
        stars.setBounds(5, 380, 250, 20);
        panel.add(stars);
        JTextField starsh=new JTextField();
        starsh.setBounds(5, 400, 150, 20);
        starsh.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        starsh.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(starsh);
        starsh.addKeyListener(new KeyAdapter(){
            
              @Override
              public void keyPressed(KeyEvent e){
               if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                   int s=Integer.parseInt(starsh.getText());
                   hotels.setQuality(s);
                   hotels.calculatePrice();
                   hotels.setPrice();
                   starsh.setEnabled(false);
                  
               }
            }  
          });
        //reset
        reset.addActionListener((ActionEvent e) -> {
            if(e.getSource()==reset){
                starsh.setEnabled(true);
                starsh.setText("");
                 Nameh.setEnabled(true);
                 Nameh.setText("");
            }
        });
        
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    
    
    
    public String getCountryName() {
        return countryName;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    
    @Override
    public String toString(){
        
        String s="====================\nDESTINATION DETAILS\n====================\nDestination: "
                +getCountryName()+"\nYou have "+getDays()+" days to enjoy your vacation!\n\n"+hotels.toString();
       return s;
    }

    
}
