/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author User
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class Airport {
    
    private Traveller traveller;
    private Destination destination;
    private ArrayList <flight> flight;
    private flight arrfl[];
   
    private final Ticket ticket;
    private final Ticket ticketE;
    private final Ticket ticketB;
    private final Ticket ticketF;
    private Payment paymentCash;
    private Payment paymentCredit;
    private static int nbofflights=0;
    public Airport(){
        traveller=new Traveller();
        
        
        flight=new ArrayList();
        arrfl=new flight[100];
        
        
        
        ticket=new Ticket();
        ticketE=new EconomyClass();
        ticketB=new BusinessClass();
        ticketF=new FirstClass();
        paymentCash= new Cash();
        paymentCredit=new CreditCard();
        
    }
    
    
     private DefaultTableModel model = new DefaultTableModel();
     
    public void addflightInfo(JPanel panel){
        
        
        JLabel dest=new JLabel("Destination Name: ");
        panel.add(dest);
        dest.setBounds(10, 20, 150, 20);
        JTextField destinationN=new JTextField();
        panel.add(destinationN);
        destinationN.setBounds(130, 20, 100, 20);
        
        JLabel flightnum=new JLabel("Flight ID: ");
        panel.add(flightnum);
        flightnum.setBounds(250, 20, 150, 20);
        JTextField flightnumm=new JTextField();
        panel.add(flightnumm);
        flightnumm.setBounds(320, 20, 100, 20);
        
        JLabel Eprice=new JLabel("Economie Price: ");
        panel.add(Eprice);
        Eprice.setBounds(10, 70, 150, 20);
        JTextField eprice=new JTextField();
        panel.add(eprice);
        eprice.setBounds(130, 70, 100, 20);
        
        JLabel Bprice=new JLabel("<html>Business<br>Price:</html> ");
        panel.add(Bprice);
        Bprice.setBounds(250, 70, 150, 30);
        JTextField bprice=new JTextField();
        panel.add(bprice);
        bprice.setBounds(320, 70, 100,20);
        
        JLabel Fprice=new JLabel("<html>FirstClass<br>Price:</html>");
        panel.add(Fprice);
        Fprice.setBounds(440, 70, 150, 30);
        JTextField fprice=new JTextField();
        panel.add(fprice);
        fprice.setBounds(520, 70, 100, 20);
        
        //table
        
        model.addColumn("Destination");
        model.addColumn("Flight ID");
        model.addColumn("Economy Price");
        model.addColumn("Business Price");
        model.addColumn("First Class Price");
        
       
        JTable table = new JTable(model);
        table.setEnabled(false);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 150, 750, 500);
       
        panel.add(scrollPane);

        JButton save=new JButton("SAVE");
        panel.add(save);
        save.setBounds(320, 120, 100, 20);
        
        JButton delete=new JButton("DELETE");
        panel.add(delete);
        delete.setBounds(420, 120, 100, 20);
        
        ActionListener l=new ActionListener(){
        @Override
         public void actionPerformed(ActionEvent e) {
                if(e.getSource()==save){
                    arrfl[nbofflights]=new flight();
                    arrfl[nbofflights].setDestinationName(destinationN.getText());
                    arrfl[nbofflights].setFlightNumber(Integer.parseInt(flightnumm.getText()));
                    arrfl[nbofflights].setEPrice(Integer.parseInt(eprice.getText()));
                    arrfl[nbofflights].setBPrice(Integer.parseInt(bprice.getText()));
                    arrfl[nbofflights].setFPrice(Integer.parseInt(fprice.getText()));
                    
                    Object[] rowData = {
                        destinationN.getText(),
                        Integer.valueOf(flightnumm.getText()),
                        Integer.valueOf(eprice.getText()),
                        Integer.valueOf(bprice.getText()),
                        Integer.valueOf(fprice.getText())
                    };
                    model.addRow(rowData);
                    destinationN.setText("");
                    flightnumm.setText("");
                    eprice.setText("");
                    bprice.setText("");
                    fprice.setText("");
                    flight.add(arrfl[nbofflights]);
                    nbofflights++;
                     
                }
                if(e.getSource()==delete){
                    for (int i = 0; i < nbofflights; i++) {
                        if(flight.get(i).getDestinationName().equals(destinationN.getText())){
                            flight.remove(i);
                            model.removeRow(i);
                            nbofflights--;
                        }
                    }
                    
                }
                
            }};
        save.addActionListener(l);
        delete.addActionListener(l);
        
    }
    public void ViewAvailableFlights(JPanel panel){

        JScrollPane scrollPane = new JScrollPane(new JTable(model));
        panel.add(scrollPane);
       
        
    }
        
    

    public String getCashDetails(){
        if("Economy Class".equals(ticket.getClassType())){
            ticketE.setPaymentCash(ticket.getPaymentCash());
            for (int i = 0; i < nbofflights; i++) {
                if(flight.get(i).getDestinationName().equals(destination.getCountryName())){
                    ticketE.setprice(flight.get(i).getEPrice());
                }}
        return paymentCash.toString();
        }
        if("Business Class".equals(ticket.getClassType())){ 
            ticketB.setPaymentCash(ticket.getPaymentCash());
        for (int i = 0; i < nbofflights; i++) {
                if(flight.get(i).getDestinationName().equals(destination.getCountryName())){
                    ticketB.setprice(flight.get(i).getBPrice());
                    return paymentCash.toString();
                }}}
        if("First Class".equals(ticket.getClassType())){
            ticketF.setPaymentCash(ticket.getPaymentCash());
            for (int i = 0; i < nbofflights; i++) {
                if(flight.get(i).getDestinationName().equals(destination.getCountryName())){
                    
                    ticketF.setprice(flight.get(i).getFPrice());
                }}
            return paymentCash.toString();
        }
            
            
            return paymentCash.toString();
        
    }
    
    public String getCreditDetails(){
            if("Economy Class".equals(ticket.getClassType())){
            ticketE.setPaymentCredit(ticket.getPaymentCredit());
            for (int i = 0; i < nbofflights; i++) {
                if(flight.get(i).getDestinationName().equals(destination.getCountryName())){
                    ticketE.setprice(flight.get(i).getEPrice());
                }}
            return paymentCredit.toString();
        }
        if("Business Class".equals(ticket.getClassType())){ 
            ticketB.setPaymentCredit(ticket.getPaymentCredit());
            for (int i = 0; i < nbofflights; i++) {
                if(flight.get(i).getDestinationName().equals(destination.getCountryName())){
                    ticketB.setprice(flight.get(i).getBPrice());
                    return paymentCash.toString();
                }}
            return paymentCredit.toString();
        }
        if("First Class".equals(ticket.getClassType())){
            ticketF.setPaymentCredit(ticket.getPaymentCredit());
            for (int i = 0; i < nbofflights; i++) {
                if(flight.get(i).getDestinationName().equals(destination.getCountryName())){
                    
                    ticketF.setprice(flight.get(i).getFPrice());
                }}
            return paymentCredit.toString();
        }
        return "";
    }
    
    public void insertCreditCard(JFrame frame,JButton back,JButton reset){
        ImageIcon credit=new ImageIcon("CreditCard.jpeg");
        
        JPanel panel=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                g.drawImage(credit.getImage(), 0, 0, 800, 500, null);
            }
        };
        
        panel.add(back);
        panel.setLayout(null);
        JLabel number=new JLabel("<html><h2 style=\"color:white;\">Enter your credit card number:</h2></html>");
        number.setBounds(100,200, 300, 20);
        panel.add(number);
        
        JTextField creditnum=new JTextField();
        creditnum.setBounds(100,250, 200, 20);
        panel.add(creditnum);
        JButton pay=new JButton("Pay Now");
        pay.setBounds(100,300, 100, 20);
        panel.add(pay);
        JLabel text=new JLabel();
        frame.setContentPane(panel);
        JLabel errorLabel = new JLabel();
                errorLabel.setBounds(100, 260, 200, 50);
                panel.add(errorLabel);
        
        pay.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                if(e.getSource()==pay){
                    
                    if(creditnum.getText().length()==16){
                        errorLabel.setText("");
                        text.setText(getCreditDetails());
                        paymentCredit.setCredit(creditnum.getText());
                        JOptionPane.showMessageDialog(null, text.getText(),"Payment",JOptionPane.INFORMATION_MESSAGE);
                        pay.setEnabled(false);
                        creditnum.setText("");
                    }
                    else{
                        errorLabel.setText("<html><font color='red'>Incorrect credit card number</font></html>");
                    }
                    
                }
                
            }
            
        });
        reset.addActionListener(new ActionListener(){
             @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==reset){
                    pay.setEnabled(true);
                }
            }
        });
        
    }
    
    public void insertTicketGUI(JPanel panel,JButton reset){
        ticket.chooseClassGUI(panel);
        addTravellerToFlight(panel,reset);
        //number of seats
        JLabel label=new JLabel("<html><p style=\"color:white;\" >How many seats do you want?</p></html>");
        label.setBounds(5, 100, 200, 20);
        panel.add(label);
        JTextField seats=new JTextField(20);
        seats.setBounds(5, 120, 150, 20);
        seats.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        seats.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(seats);
        
        
       seats.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            
            int nbseats=Integer.parseInt(seats.getText());
            ticket.setNbOfPassengers(nbseats);
            ticketE.setNbOfPassengers(ticket.getNbOfPassengers());
            ticketF.setNbOfPassengers(ticket.getNbOfPassengers());
            ticketB.setNbOfPassengers(ticket.getNbOfPassengers());
            ticket.setPaymentCash(paymentCash);
            ticket.setPaymentCredit(paymentCredit);
            
            seats.setEnabled(false);
            
           }}});
        //reset
               reset.addActionListener((ActionEvent e) -> {
            if(e.getSource()==reset){
               seats.setEnabled(true);
               seats.setText("");
            }
        });
    }
    public int getNumberofSeats(){
        return ticket.getNbOfPassengers();
    }
    
    public String TicketInfo(){
        String s="";
        if("Economy Class".equals(ticket.getClassType())){
            ticketE.setClassType(ticket.getClassType());
            s=ticketE.toString();
        }
        if("Business Class".equals(ticket.getClassType())){
            ticketB.setClassType(ticket.getClassType());
            
            s=ticketB.toString();
        }
        if("First Class".equals(ticket.getClassType())){
            ticketF.setClassType(ticket.getClassType());
            
            s=ticketF.toString();
        }
        return s;
    }
    
    public void insertDestinationGUI(JPanel panel,JButton reset,Destination d){
       //error
        JLabel error=new JLabel();
        error.setForeground(Color.red);
        error.setBounds(155, 280, 200, 20);
        panel.add(error);
        
        //destination name
        JLabel des=new JLabel("<html><p style=\"color:white;\" >Enter your destination:</p></html>");
        des.setBounds(5, 260, 150, 20);
        panel.add(des);
        
        JTextField dest=new JTextField(20);
        dest.setBounds(5, 280, 150, 20);
        
        dest.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        dest.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(dest);
        
      
    
        
        JLabel day=new JLabel("<html><p style=\"color:white;\" >How many days are you staying?</p></html>");
        day.setBounds(5, 300, 200, 20);
        panel.add(day);
        
        JTextField days=new JTextField();
        days.setBounds(5, 320, 150, 20);
        days.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        days.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(days);
       
        
        
        //reset
        reset.addActionListener((ActionEvent e) -> {
        if(e.getSource()==reset){
            dest.setEnabled(true);
            dest.setText("");
            days.setEnabled(true);
            days.setText("");
        }
    });
        //setting elements
      KeyAdapter k=new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if(e.getSource()==dest){
            boolean flag=false;
            for (int i = 0; i < nbofflights; i++) {
                if(flight.get(i).getDestinationName().equals(dest.getText())){
                   
                    d.setCountryName(dest.getText());
                    dest.setEnabled(false);
                    ticketE.setprice(flight.get(i).getEPrice());
                    ticketB.setprice(flight.get(i).getBPrice());
                    ticketF.setprice(flight.get(i).getFPrice());
                    d.setNbOfTravellers(ticket.getNbOfPassengers());
                    error.setText("");
                    flag=true;
                }
               }
           if(!flag){
              error.setText("flight not available");
           }
           
           }
            if(e.getSource()==days){
                 int da=Integer.parseInt(days.getText());
                    d.setDays(da);
                    days.setEnabled(false);
            }
        }}}; 
        days.addKeyListener(k);
        dest.addKeyListener(k);
        d.insertHotel(panel,reset);
        d.setcashpayment(paymentCash);
        d.setcreditpayment(paymentCredit);
        d.setNbOfTravellers(ticket.getNbOfPassengers());
        
        destination=d;
    }
    
    public void addTravellerToFlight(JPanel panel,JButton reset){
        
        //first name
           JLabel fName=new JLabel();
          fName.setText("<html><p style=\"color:white;\" >Enter your First Name:</p></html>");
          fName.setBounds(5, 140, 150, 20);
          panel.add(fName);
          JTextField Namef=new JTextField(20);
          Namef.setBounds(5, 160, 150, 20);
          Namef.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
          Namef.setFont(new Font("Arial", Font.PLAIN, 16));
          panel.add(Namef);
          
          //last name
          JLabel lName=new JLabel();
          lName.setText("<html><p style=\"color:white;\">Enter your Last Name:</p></html>");
          lName.setBounds(5, 180, 150, 20);
          panel.add(lName);
          JTextField Namel=new JTextField(20);
          Namel.setBounds(5, 200, 150, 20);
          Namel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
          Namel.setFont(new Font("Arial", Font.PLAIN, 16));
          panel.add(Namel);
          
          
          //id
          JLabel id=new JLabel();
          id.setText("<html><p style=\"color:white;\" >Enter Id code:</p></html>");
          id.setBounds(5, 220, 150, 20);
          panel.add(id);
          JTextField id2=new JTextField(20);
          id2.setBounds(5, 240, 150, 20);
          panel.add(id2);
          id2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
          id2.setFont(new Font("Arial", Font.PLAIN, 16));
          
           //reset
        reset.addActionListener((ActionEvent e) -> {
            if(e.getSource()==reset){
                Namef.setEnabled(true);
                Namef.setText("");
                Namel.setEnabled(true);
                Namel.setText("");
                id2.setEnabled(true);
                id2.setText("");
            }
        });
        
          KeyAdapter k=new KeyAdapter(){
            
              @Override
              public void keyPressed(KeyEvent e){
               if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                   if(e.getSource()==Namef){
                   traveller.setName(Namef.getText());
                   Namef.setEnabled(false);}
                   
                   if(e.getSource()==Namel){
                   traveller.setLastname(Namel.getText());
                   Namel.setEnabled(false);}
                   
                   if(e.getSource()==id2){
                   traveller.setID(id2.getText());
                   id2.setEnabled(false);}
                   
               }
            }  
          };
          Namef.addKeyListener(k);
          Namel.addKeyListener(k);
          id2.addKeyListener(k);
          
        
            
            
            
        }
   
    
   
    @Override
    public String toString() {
        return   destination.toString() + "\n\n================\n"
                + "PASSENGER DETAILS\n"
                + "================ \n"
                + "Number Of Passengers:" + getNumberofSeats() + "\n"+traveller.toString()+"\n"+TicketInfo();
    }
    
}
        
    

