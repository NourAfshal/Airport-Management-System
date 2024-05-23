/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class Ticket {
    
    protected String classType;
    protected int nbOfPassengers;
    protected int price;
    protected Payment paymentCash;
    protected Payment paymentCredit;
    
    public Ticket( String classType,int nbOfPassengers) {
        setClassType(classType);
        setNbOfPassengers(nbOfPassengers);
        
    }

    public Ticket() {
        classType=null;
        nbOfPassengers=0;
        paymentCash=new Cash();
        paymentCredit=new CreditCard();
    }
    public void setprice(int price){
        paymentCash.setTicketPrice(0);
        paymentCredit.setTicketPrice(0);
    }

    public void setPaymentCash(Payment paymentCash) {
        this.paymentCash = paymentCash;
    }

    public void setPaymentCredit(Payment paymentCredit) {
        this.paymentCredit = paymentCredit;
    }

    public Payment getPaymentCash() {
        return paymentCash;
    }

    public Payment getPaymentCredit() {
        return paymentCredit;
    }
    
    

    public int getNbOfPassengers() {
        return nbOfPassengers;
    }

    public void setNbOfPassengers(int nbOfPassengers) {
        this.nbOfPassengers = nbOfPassengers;
    }
    
    
    
    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    

    public void chooseClassGUI(JPanel panel){
        
        JLabel label=new JLabel("<html><h2 style=\"color:white;\">Welcome to our reservation system.</h2><p style=\"color:white;\" >Please select your desired ticket class from the options below:</p></html>");
        
        String options[]={"Select Class","Economy Class","Business Class","First Class"};
        JComboBox TicketClass=new JComboBox(options);
       label.setBounds(5, 0, 359, 70);
       TicketClass.setBounds(5, 80, 100, 20);
        panel.add(label);
        panel.add(TicketClass);
        
        ActionListener a=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==TicketClass){
                    String str="";
                if(TicketClass.getSelectedItem().equals("Economy Class")){
                    str="Economy Class";
                }
                else if(TicketClass.getSelectedItem().equals("Business Class")){
                    str="Business Class";
                }
                else{
                    str="First Class";
                }
                    classType=str;}
                }
            };
                TicketClass.addActionListener(a);
        }

    @Override
    public String toString(){
        return "\n=========================\n"
                + "      TICKET DETAILS     "
                + "\n========================="+
               
               "\nTicket Class: " + classType + "\nNumber of passengers: "+getNbOfPassengers();
    }
    
}
