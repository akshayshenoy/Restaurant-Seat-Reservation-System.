package System;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo  {
JFrame logf;
Container logm;
	JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;
public void LoginDemo()
{
	logf=new JFrame("Login Menu");
	 //--Main Menu Container
	   logm=logf.getContentPane();
	   logm.setBackground(Color.yellow);
	   logm.setVisible(true);
	   
	   panel =new JPanel();
	   panel.setBounds(600,250,250,100);
	   panel.setBackground(Color.yellow);
	   logf.setVisible(true);
	   logf.setLayout(null);

	   logm.add(panel);
	   //mainMenu.add(mainMenuViewP);
	   logm.setSize(50,300);
	   logf.setSize(1200,600);
	   logm.setVisible(true);
	// User Label
       user_label = new JLabel("User Name :");
       user_label.setPreferredSize(new Dimension(80,20));
 //user_label.setText();
       userName_text = new JTextField();
       userName_text.setPreferredSize(new Dimension(100,20));
       panel.add(user_label,BorderLayout.CENTER);
       panel.add(userName_text,BorderLayout.CENTER);
       // Password

       password_label = new JLabel("Password   :");
      
       password_label.setPreferredSize(new Dimension(80,20));
       password_text = new JPasswordField();
       password_text.setPreferredSize(new Dimension(100,20));

       panel.add(password_label,BorderLayout.CENTER);
       panel.add(password_text,BorderLayout.CENTER);
       
       
       logf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	   logf.addWindowListener(new WindowAdapter()
	   {
	    public void windowClosing(WindowEvent we)//For Exit windowClosing event
	    {
	     int a = JOptionPane.showConfirmDialog(logf,"Are You Sure you want to exit? ");
	     if(a==JOptionPane.YES_OPTION)
	     {
	      logf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     }
	    }
	   });
       
       // Adding the listeners to componen

	   JButton sub=new JButton("SUBMIT");
	     sub.setPreferredSize(new Dimension(150,20));
	     panel.add(sub);

	     sub.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent ae)
	    		 
	    	     {
	    	 
	    	 String userName = userName_text.getText();
	    	    String password = password_text.getText();
	    	    if (userName.trim().equals("DEERU") && password.trim().equals("ADDA")) {
	    	    	logf.setVisible(false);
	    	        MenuDataSwing n=new MenuDataSwing();
	    	        n.MenuDataSwing();
	    	        n.mainF.setVisible(true);
	    	        
	    	    }
	    	    else if (userName.trim().equals("AKSHAY") && password.trim().equals("ADD")) {
	    	    	logf.setVisible(false);
	    	        MenuDataSwing n=new MenuDataSwing();
	    	        n.MenuDataSwing();
	    	        n.mainF.setVisible(true);
	    	        
	    	    }else {
	    	        message.setText(" Invalid user.. ");
	    	    }
	    	     
	    	     }
	     });
   

}


}

    