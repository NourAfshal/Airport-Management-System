package project;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.ScrollBarUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Project implements ActionListener {
    
        JFrame login = new JFrame();
        JButton loginButton = new JButton("Login");
        JLabel user = new JLabel("<html><h2>Username:</h2><html>");
        JTextField username = new JTextField();
        JLabel loginLabel = new JLabel("<html><h1>Admin Login</h1></html>");
        JLabel password = new JLabel("<html><h2>Password:</h2></html>");
        JPasswordField pass = new JPasswordField();
    
    
        JFrame home=new JFrame();
        JLabel title=new JLabel();
        JFrame frameflight=new JFrame();
        
        JFrame Main = new JFrame();
        Airport a1 = new Airport();
        Destination d1=new Destination();
       
        //buttons
        JButton backdetail=new JButton("Back");
        JButton backadmin=new JButton("Back");
        JButton admin=new JButton("Admin");
        JButton book=new JButton("Book Flight");
        JButton button=new JButton("View Details");
        JButton button2=new JButton("Reset");
        JButton exit=new JButton("Exit");
        JButton viewf=new JButton("View Available Flights");
        JButton backf=new JButton("Back");
        
        
        JFrame detailpage=new JFrame();
        JTextPane output=new JTextPane();
        
        JFrame PaymentPageCash=new JFrame();
        JLabel text3=new JLabel();
        JButton cash=new JButton("Pay with cash");
        JButton backcash=new JButton("Back");
        
        JFrame PaymentPageCredit=new JFrame();
        JButton CreditCard=new JButton("Pay with credit");
        JButton backcredit=new JButton("Back");
        
        JFrame viewFlights=new JFrame();
        JPanel viewFlightsPanel=new JPanel();
        
        JPanel loginPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int width = getWidth() - 1 * 2;
            int height = getHeight() - 1 * 2;
            g2d.setColor(Color.BLACK);
            g2d.setColor(new Color(0, 0, 0, 128)); 
            g2d.fillRoundRect(10, 10, width, height, 10, 10);
            g2d.setColor(getBackground());
            g2d.fillRoundRect(0, 0, width, height, 10, 10);
            
        }
    };
        
    Project(){
        ImageIcon icon=new ImageIcon("logo.jpeg");
        ImageIcon back=new ImageIcon("background.jpg");
          JPanel contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                g.drawImage(back.getImage(), 0, 0, 800, 500, null);
            }
        };
        
        ImageIcon backhome=new ImageIcon("back.jpeg");
        contentPane.setOpaque(false);
        admin.setBounds(670, 5, 110, 20);
        admin.setFocusable(false);
        admin.addActionListener(this);
        
        viewf.setBounds(320, 300, 170, 20);
        viewf.setFocusable(false);
        viewf.addActionListener(this);
        
        contentPane.add(admin);
        contentPane.add(viewf);
        home. setContentPane(contentPane);
        home.setTitle("Skyport International Airport-Home Page");
        home.setIconImage(icon.getImage());
        title.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h1>Welcome to Skyport International Airport<h1></html>");
        title.setFont(new Font("Serif", Font.ROMAN_BASELINE, 20));
        title.setBounds(200, 100, 500, 120);
        home.add(title);
        book.setBounds(350, 230, 110, 40);
        book.setFocusable(false);
        book.addActionListener(this);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(800, 500);
        home.setLayout(null);
        home.setResizable(false);
        home.add(book);
        home.setLocation(250, 120);
        home.setVisible(true);
        
        backadmin.setBounds(670, 7, 120, 20);
        backadmin.setFocusable(false);
        backadmin.addActionListener(this);
        
        JPanel fpanel=new JPanel();
        fpanel.setLayout(null);
        fpanel.add(backadmin);
        a1.addflightInfo(fpanel);
        frameflight.setTitle("Skyport International Airport-Admin Page");
        frameflight.setIconImage(icon.getImage());
        frameflight.setContentPane(fpanel);
        frameflight.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameflight.setSize(800, 500);
        frameflight.setLocation(250, 120);
        frameflight.setResizable(false);
        frameflight.setVisible(false);
        
        JPanel mainPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                g.drawImage(backhome.getImage(), 0, 0, 800, 500, null);
            }
        };
        
        button.setBackground(new Color(169,169,169));
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        button.setFocusable(false);
        button.setBounds(670, 440, 120, 20);
        button.addActionListener(this);
        
        button2.setBackground(new Color(169,169,169));
        button2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        button2.setFocusable(false);
        button2.setBounds(7, 440, 120, 20);
       
      
        exit.setBackground(new Color(169,169,169));
        exit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        exit.setFocusable(false);
        exit.setBounds(338, 440, 120, 20);
        exit.addActionListener(this);
        
        backcash.setBackground(new Color(169,169,169));
        backcash.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        backcash.setFocusable(false);
        backcash.setBounds(7, 440, 120, 20);
        backcash.addActionListener(this);
        
        backcredit.setBackground(new Color(169,169,169));
        backcredit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        backcredit.setFocusable(false);
        backcredit.setBounds(7, 440, 120, 20);
        backcredit.addActionListener(this);
        
        backdetail.setBackground(new Color(169,169,169));
        backdetail.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        backdetail.setFocusable(false);
        backdetail.setBounds(670, 440, 120, 20);
        backdetail.addActionListener(this);
        
      mainPanel.setLayout(null);
      mainPanel.setSize(500, 1000); 
       
       
      a1.insertTicketGUI(mainPanel,button2);
      a1.insertDestinationGUI(mainPanel,button2, d1);
      
      mainPanel.add(button);
      mainPanel.add(button2);
      mainPanel.add(exit);
      
      Main.setTitle("Skyport International Airport-Main Page");
      Main.setIconImage(icon.getImage());
      Main.setContentPane(mainPanel);
      Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Main.setSize(800, 500);
      Main.setLocation(250, 120);
      Main.setResizable(false);
      Main.setVisible(false);
      
      
  
      output.setEditable(false);
      output.setForeground(Color.white);
      output.setOpaque(false);
      
      
      
      JScrollPane scroll=new JScrollPane(output,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      scroll.setBounds(0, 0, 200, 500);  
      scroll.setOpaque(false);
      scroll.setBorder(null);
      scroll.getViewport().setOpaque(false);
      scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
     
      
      
      
      ImageIcon details=new ImageIcon("details.jpeg");
      
       
      JPanel detail=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                g.drawImage(details.getImage(), 0, 0, 800, 500, null);
            }
        };
     
      JLabel payment=new JLabel("<html><h1>Select Payment Method</h1></html>");
      payment.setBounds(300, 150, 300, 50);
      payment.setForeground(Color.white);
      
        cash.setBackground(new Color(169,169,169));
        cash.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        cash.setFocusable(false);
        cash.setBounds(300, 210, 120, 20);
        cash.addActionListener(this);
        
        CreditCard.setBackground(new Color(169,169,169));
        CreditCard.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        CreditCard.setFocusable(false);
        CreditCard.setBounds(460, 210, 120, 20);
        CreditCard.addActionListener(this);
        
        detailpage.setTitle("Skyport International Airport-Details Page");
        detailpage.setIconImage(icon.getImage());
        detailpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        detailpage.setSize(800, 510);
        detailpage.setLayout(null);
        detailpage.setResizable(false);
        
        detail.add(backdetail);
        detail.add(scroll);
        detail.add(payment);
        detail.add(cash);
        detail.add(CreditCard);
        detail.setLayout(null);
        
        detailpage.setContentPane(detail);
        detailpage.setLocation(250, 120);
        detailpage.setVisible(false);
        
        ImageIcon cashback=new ImageIcon("cash.jpeg");
        JPanel panel3=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                g.drawImage(cashback.getImage(), 0, 0, 800, 500, null);
            }
        };
       
        text3.setBounds(100,100, 600, 20);
        text3.setForeground(Color.WHITE);
        text3.setFont(text3.getFont().deriveFont(16f));
        panel3.setLayout(null);
        panel3.add(text3);
        panel3.add(backcash);
        PaymentPageCash.setContentPane(panel3);
        PaymentPageCash.setTitle("Skyport International Airport-Payment Page");
        PaymentPageCash.setIconImage(icon.getImage());
        PaymentPageCash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PaymentPageCash.setSize(800, 500);
        PaymentPageCash.setLocation(250, 120);
        PaymentPageCash.setResizable(false);
        PaymentPageCash.setLayout(null);
      
        PaymentPageCash.setVisible(false);
        
        
        PaymentPageCredit.setTitle("Skyport International Airport-Payment Page");
        PaymentPageCredit.setIconImage(icon.getImage());
        PaymentPageCredit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PaymentPageCredit.setSize(800, 500);
        PaymentPageCredit.setLocation(250, 120);
        PaymentPageCredit.setResizable(false);
        PaymentPageCredit.setLayout(null);
        a1.insertCreditCard(PaymentPageCredit,backcredit,button2);
        PaymentPageCredit.setVisible(false);
        
        backf.setBounds(338, 440, 120, 20);
        backf.setFocusable(false);
        backf.addActionListener(this);
       
        viewFlightsPanel.add(backf);
       viewFlights.setTitle("Skyport International Airport-Flights Page");
      viewFlights.setIconImage(icon.getImage());
      viewFlights.setContentPane(viewFlightsPanel);
      viewFlights.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      viewFlights.setSize(800, 500);
      viewFlights.setLocation(250, 120);
      viewFlights.setResizable(false);
      a1.ViewAvailableFlights(viewFlightsPanel);
      viewFlights.setVisible(false);
      
      
      
      loginPanel.setLayout(null);
        loginPanel.setBounds(250, 80, 300, 300);
        loginPanel.setForeground(Color.BLACK);
        loginPanel.setBackground(Color.white);

        username.setBounds(40, 100, 150, 20);
        username.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        username.setFont(new Font("Arial", Font.PLAIN, 16));
        loginPanel.add(username);
        user.setBounds(40, 70, 150, 20);
        loginPanel.add(user);

        pass.setBounds(40, 170, 150, 20);
        pass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        pass.setFont(new Font("Arial", Font.PLAIN, 16));
        loginPanel.add(pass);
        password.setBounds(40, 140, 150, 20);
        loginPanel.add(password);

        loginButton.setBackground(new Color(169, 169, 169));
        loginButton.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        loginButton.setFocusable(false);
        loginButton.setBounds(40, 210, 120, 20);
        loginButton.addActionListener(this);
        loginPanel.add(loginButton);

        login.setTitle("Skyport International Airport-Login Page");
        login.setLayout(null);
        login.setIconImage(icon.getImage());
        login.add(loginPanel);
        login.add(loginLabel);

        loginLabel.setBounds(310, 0, 300, 80);

        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(800, 500);
        login.setLocation(250, 120);
        login.setResizable(false);
        login.setVisible(false);
      
    }
     

   

   
    

    public static void main(String[] args) {
        
        new Project();
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==backadmin){
            home.setVisible(true);
            frameflight.setVisible(false);
        }
        if(e.getSource()==admin){
            home.setVisible(false);
            login.setVisible(true);
        }
    
        if(e.getSource()==button){
            output.setText(a1.toString());
            Main.setVisible(false);
            detailpage.setVisible(true);
        }
      
        if(e.getSource()==exit){
            Main.setVisible(false);
            home.setVisible(true);
        }
        if(e.getSource()==cash){
            detailpage.setVisible(false);
            text3.setText(a1.getCashDetails());
            PaymentPageCash.setVisible(true);
        }
        if(e.getSource()==CreditCard){
            detailpage.setVisible(false);
            PaymentPageCredit.setVisible(true);
        }
        if(e.getSource()==backcash){
            PaymentPageCash.setVisible(false);
            detailpage.setVisible(true);
        }
        if(e.getSource()==backcredit){
            PaymentPageCredit.setVisible(false);
            detailpage.setVisible(true);
        }
        if(e.getSource()==book){
            home.setVisible(false);
            Main.setVisible(true);
        }
        if(e.getSource()==backdetail){
            Main.setVisible(true);
            detailpage.setVisible(false);
        }
        if(e.getSource()==viewf){
            home.setVisible(false);
            viewFlights.setVisible(true);
        }
        if(e.getSource()==backf){
            home.setVisible(true);
            viewFlights.setVisible(false);
        }
        
        
         if(e.getSource()==loginButton){
            
            String enteredUsername = username.getText();
            String enteredPass = new String(pass.getPassword());
            
            JLabel errorLabel = new JLabel();
            errorLabel.setBounds(40, 240, 150, 50);
            loginPanel.add(errorLabel);
            
            if (enteredUsername.equals("admin") && enteredPass.equals("password")) {
                login.setVisible(false);
                username.setText("");
                pass.setText("");
                frameflight.setVisible(true);
            } 
            
            else {
                
                errorLabel.setText("<html><font color='red'>Incorrect username or password</font></html>");
                
                
            }
        }
    }}
    

