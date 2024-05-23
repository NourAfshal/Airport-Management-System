/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author user
 */
public class CashMain extends Project {

    public CashMain(){
        JFrame frame=new JFrame();
        JLabel text=new JLabel();
        ImageIcon icon=new ImageIcon("logo.jpeg");
        
        text.setBounds(100,200, 600, 20);
        frame.add(text);
         frame.setTitle("Skyport International Airport-Payment Page");
        frame.setIconImage(icon.getImage());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800, 500);
      frame.setLocation(250, 120);
      frame.setResizable(false);
      frame.setLayout(null);
      
      frame.setVisible(true);
    }
    
    
}
