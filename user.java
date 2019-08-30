package System;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class user {
	JFrame mF;
	Container mMenu;
	JPanel mMenuSelectP,mMenuViewP;
	JTextArea mMTextA;
	JComboBox mMComboBox;
	
	JButton mMBtn;

	public void	user()
	{
	mF=new JFrame("Main Menu");
	
	//--Main Menu Container
	   //--Main Menu Container
	   mMenu=mF.getContentPane();
	   mMenu.setBackground(Color.yellow);
	   mMenu.setVisible(true);
	   //-- menu panel
	   mMenuSelectP=new JPanel();
	   mMenuSelectP.setBounds(600,250,250,150);
	   mMenuSelectP.setBackground(Color.black);
	    
	   mMenuViewP=new JPanel();
	    mMenuViewP.setBounds(600,550,250,30);
	    mMenuViewP.setBackground(Color.yellow);
	   
	    
	    {//--setting all frames visiblity to true
		     
	    	 mF.setVisible(true);
	 	    mF.setLayout(null);
	    }

	    //--(login)setting frame and container size
	     mMenu.add(mMenuSelectP);
	     mMenu.add(mMenuViewP);
	     mMenu.setSize(50,300);
	     mF.setSize(1200,600);
	     mMenu.setVisible(true);
	     //---
	     
	   //login menu view
	     
		    mMTextA=new JTextArea("      SELECT YOUR CHOICE");
		    mMTextA.setPreferredSize(new Dimension(200,20));
		    Font f=new Font("Arial", Font.BOLD, 14);
		    mMTextA.setFont(f);
		    mMTextA.setForeground(Color.BLACK);
		     mMTextA.setEditable(false);
		     mMenuSelectP.add(mMTextA);
	     
	   //  String select[]={"1","2","3"};
		    
		     
		     
		     
	    // logMComboBox=new JComboBox(select);
	   //  logMComboBox.setPreferredSize(new Dimension(50,20));
	     
	     //logMBtn=new JButton("SELECT");
	     //logMBtn.setPreferredSize(new Dimension(80,20));
	     
	    // logMenuSelectP.add(logMTextA,BorderLayout.CENTER);
	    // logMenuSelectP.add(logMComboBox,BorderLayout.SOUTH);
	    // 
	   //  logMenuViewP.add(logMBtn,BorderLayout.CENTER);
	     JButton ubutton=new JButton("USER");
	     ubutton.setPreferredSize(new Dimension(150,20));
	     mMenuSelectP.add(ubutton);

	     ubutton.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent ae)
	    
	    		 {
	    	 		mF.setVisible(false);
	    			 users m=new users();
	    			 m.users();
	    			 m.uF.setVisible(true);
	    		 }
	     });
	     JButton abutton=new JButton("ADMIN");
	     abutton.setPreferredSize(new Dimension(150,20));
	     mMenuSelectP.add(abutton);

	     abutton.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent ae)
	    	     {
	    			 mF.setVisible(false);
	    	     LoginDemo mm=new LoginDemo();
	    	     mm.LoginDemo();
	    	     mm.logf.setVisible(true);
	    	 }
	     });
	     JButton ebutton=new JButton("EXIT");
	     ebutton.setPreferredSize(new Dimension(150,20));
	     mMenuSelectP.add(ebutton);

	     ebutton.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent ae)
	    		 
	    	     {
	    			
	    	      showDialog();
	    	     }
	     });
	     mF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	     mF.addWindowListener(new WindowAdapter()
	     {
	      public void windowClosing(WindowEvent we)//For Exit windowClosing event
	      {
	       int a = JOptionPane.showConfirmDialog(mF,"Are You Sure you want to exit? ");
	       if(a==JOptionPane.YES_OPTION)
	       {
	    	   mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       }
	      }
	     });  
	     
	}
	protected void showDialog() {
		   int a = JOptionPane.showConfirmDialog(mF,"Are You Sure you want to exit? ");
		   if(a==JOptionPane.YES_OPTION)
		   {
		    System.exit(0);
		   }
		      }

}

	
 
