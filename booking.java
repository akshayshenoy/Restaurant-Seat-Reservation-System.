package System;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class booking {
	JFrame bf,mF;
	Container bMenu,mMenu;
	JPanel bMenuSelectP,bMenuViewP,bMenuSelectP2,mMenuSelectP,mMenuViewP,mMenuSelectP1,mMenuSelectP2;
	JTextArea bMTextA,mMTextA,mMTextA1,mainMTextA1,mainMTextA,mainMText;
	JComboBox bMComboBox,mMComboBox,mainMComboBox,mainMComboBo,mainMComboB;
	JLabel tx,user_label,user_labe,user_lab,user_la,user_l;
	JTextField tf,addMTextFName,addMTextFNam,addMTextFNa,addMTextFN,addMTextF;
	int flag,flag1=0;
	String nameSearchSel;
	String ID,name,place,phn,email,date,table,o,p;
	String DisplayView1[];
	
	JButton bMBtn,mMBtn,mainMBt;
	JLabel la,mu;
	
	public void booking()
	{
		bf=new JFrame("Booking Menu");
		mF=new JFrame("table Menu");
		
		bMenu=bf.getContentPane();
		   bMenu.setBackground(Color.yellow);
		   bMenu.setVisible(true);
		   mMenu=mF.getContentPane();
		   mMenu.setBackground(Color.yellow);
		   mMenu.setVisible(true);
		   
		   bMenuSelectP=new JPanel();
		   bMenuSelectP.setBounds(150,50,200,90);
		   bMenuSelectP.setBackground(Color.yellow);
		   
		   bMenuSelectP2=new JPanel();
		   bMenuSelectP2.setBounds(600,250,250,320);
		   bMenuSelectP2.setBackground(Color.yellow);
		   
		   bMenuViewP=new JPanel();
		    bMenuViewP.setBounds(600,550,250,30);
		    bMenuViewP.setBackground(Color.yellow);
		    
		    mMenuSelectP=new JPanel();
			   mMenuSelectP.setBounds(150,100,250,150);
			   mMenuSelectP.setBackground(Color.black);
			   
			   mMenuSelectP1=new JPanel();
			   mMenuSelectP1.setBounds(450,100,250,150);
			   mMenuSelectP1.setBackground(Color.yellow);
			   mMenuSelectP2=new JPanel();
			   mMenuSelectP2.setBounds(800,100,250,30);
			   mMenuSelectP2.setBackground(Color.YELLOW);
			   mMenuViewP=new JPanel();
			    mMenuViewP.setBounds(600,550,150,40);
			    mMenuViewP.setBackground(Color.yellow);
			    
			    
		    
		    {//--setting all frames visiblity to true
			     
		    	 bf.setVisible(true);
		 	    bf.setLayout(null);
		 	   mF.setVisible(false);
		 	    mF.setLayout(null);
		    
		    }
		    
		    //--(login)setting frame and container size
		     bMenu.add(bMenuSelectP);
		     bMenu.add(bMenuSelectP2);
		     bMenu.add(bMenuViewP);
		     bMenu.setSize(50,300);
		     bf.setSize(1200,600);
		    bMenu.setVisible(true);
		    
		    mMenu.add(mMenuSelectP);
		     mMenu.add(mMenuViewP);
		     mMenu.add(mMenuSelectP1);
		     mMenu.add(mMenuSelectP2);

		     mMenu.setSize(50,300);
		     mF.setSize(1200,600);
		     mMenu.setVisible(true);
		    
		  //login menu view
		    bMTextA=new JTextArea("ENTER  RESTAURANT ID:");
		    bMTextA.setPreferredSize(new Dimension(150,20));
		     bMTextA.setEditable(false);
		     bMenuSelectP.add(bMTextA);
		     
		     mMTextA=new JTextArea("          SELECT TABLES:");
		     mMTextA.setPreferredSize(new Dimension(200,20));
		     mMTextA.setEditable(false);
		     mMenuSelectP.add(mMTextA);
		     
		     tx=new JLabel("RID:");
		     tx.setPreferredSize(new Dimension(100,20));
		     bMenuSelectP.add(tx,BorderLayout.NORTH);
		     tf=new JTextField();
		     tf.setPreferredSize(new Dimension(80,20));
		     bMenuSelectP.add(tf,BorderLayout.NORTH);
		     bMBtn=new JButton("Next");
		     bMBtn.setPreferredSize(new Dimension(80,20));
		     bMenuSelectP.add(bMBtn);
		     bMenuSelectP.add(bMBtn,BorderLayout.CENTER);
		     
		   
		     JButton ubutton=new JButton("2-TABLES");
		     ubutton.setPreferredSize(new Dimension(150,20));
		     mMenuSelectP.add(ubutton);
		     JButton tbutton=new JButton("3-TABLES");
		     tbutton.setPreferredSize(new Dimension(150,20));
		     mMenuSelectP.add(tbutton);
		     JButton fbutton=new JButton("4-TABLES");
		     fbutton.setPreferredSize(new Dimension(150,20));
		     mMenuSelectP.add(fbutton);
		     
		     
		     ubutton.addActionListener(new ActionListener(){
			     public void actionPerformed(ActionEvent ae)
			    
			    		 {
			    	 mainMTextA=new JTextArea("      SELECT YOUR TABLE:\n\n1 ---> table_1 \n2 ---> table_2 \n3 ---> table_3 \n4 ---> table_4  \n5 ---> table_5");
			    	 mainMTextA.setPreferredSize(new Dimension(200,250));
			    	 mainMTextA.setEditable(false);
			    	  
			    	 String select[]={"1","2","3","4","5"};
			    	  mainMComboBox=new JComboBox(select);
			    	  mainMComboBox.setPreferredSize(new Dimension(50,20));
			    	  
			    	  
			    	  mMenuSelectP1.add(mainMTextA,BorderLayout.CENTER);
			    	  mMenuViewP.add(mainMComboBox,BorderLayout.SOUTH);
			    		 }
			     });
		     
		     tbutton.addActionListener(new ActionListener(){
			     public void actionPerformed(ActionEvent ae)
			    
			    		 {
			    	 mainMTextA=new JTextArea("      SELECT YOUR TABLE:\n\n6 ---> table_6 \n7 ---> table_7 \n8 ---> table_8 \n9 ---> table_9  \n10 ---> table_10");
			    	 mainMTextA.setPreferredSize(new Dimension(200,250));
			    	 mainMTextA.setEditable(false);
			    	  
			    	 String select[]={"6","7","8","9","10"};
			    	  mainMComboBox=new JComboBox(select);
			    	  mainMComboBox.setPreferredSize(new Dimension(50,20));
			    	 
			    	  
			    	  mMenuSelectP1.add(mainMTextA,BorderLayout.CENTER);
			    	  mMenuViewP.add(mainMComboBox,BorderLayout.SOUTH);
			    	 }
			     });
		     fbutton.addActionListener(new ActionListener(){
			     public void actionPerformed(ActionEvent ae)
			    
			    		 {
			    	 mainMTextA=new JTextArea("      SELECT YOUR TABLE:\n\n11 ---> table_11 \n12 ---> table_12 \n13 ---> table_13 \n14 ---> table_14  \n15 ---> table_15");
			    	 mainMTextA.setPreferredSize(new Dimension(200,250));
			    	 mainMTextA.setEditable(false);
			    	  
			    	 String select[]={"11","12","13","14","15"};
			    	  mainMComboBox=new JComboBox(select);
			    	  mainMComboBox.setPreferredSize(new Dimension(50,20));
			    	  
			    	  mMenuSelectP1.add(mainMTextA,BorderLayout.CENTER);
			    	  mMenuViewP.add(mainMComboBox,BorderLayout.SOUTH);
			    	  
			    		 }
			     });
		     
		     mainMBt=new JButton("SUBMIT");
	    	  mainMBt.setPreferredSize(new Dimension(80,20));
	    	  mMenuViewP.add(mainMBt,BorderLayout.CENTER);
        	  
	    	  
		     mainMBt.addActionListener(new ActionListener(){
				    public void actionPerformed(ActionEvent ae)
			     {
				    	try
		    		     {

		    		    	 if(tf.getText().length()!=0&&addMTextFName.getText().length()!=0&&addMTextFNam.getText().length()!=0&&addMTextFNa.getText().length()!=0&&addMTextFN.getText().length()!=0&&addMTextF.getText().length()!=0)
		    		    	 {
		    		    		 JLabel l=new JLabel("Table Booked.. Thank you!!");
		    		    		   l.setPreferredSize(new Dimension(200,20));
		    		    		   mMenuSelectP2.add(l);
		    		    		 BufferedWriter bW1=new BufferedWriter(new FileWriter("pdata.txt",true));
		    		    		 ID = " "+tf.getText()+" ";
				    		       name = addMTextFName.getText();
				    		       place = addMTextFNam.getText();
				    		       phn = addMTextFNa.getText();
				    		       email=addMTextFN.getText();
				    		       date= addMTextF.getText();
				    		       table=mainMComboBox.getSelectedItem().toString();
		   		    	       
				    		       String splitt=ID;
				    		       
				    		       String IDno=splitt.substring(1, splitt.length() -1);
				    		       bW1.write(ID+","+name+","+place+","+phn+","+email+","+date+","+table+","+IDno);
				    		       bW1.flush();
				    		       bW1.newLine();
				    		       bW1.close();
				    		       
				    		       String DetailsAdd="ID: "+ID+"\nName: "+name+"\nPlace: "+place+"\nPhone no: "+phn+"\nEmail: "+email+"\nDate: "+date+"\nTable no: "+table;
				    		       tf.setText("");
				    		       addMTextFName.setText("");
				    		      addMTextFNam.setText("");
				    		       addMTextFNa.setText("");
				    		       addMTextFN.setText("");
				    		       addMTextF.setText(""); 
		   
		    		        }
		    		    	 else
		    		    	 {
		    		    	 mu=new JLabel("Enter the details correctly") ;
		    		    		mMenuSelectP2.add(mu);
		    		    	 
		    		        //----------------------------------------------------------------
		    		    	 }
		    		     }
				    	 catch(Exception ex)
	    		        {
	    		         System.out.println("Exception msg: "+ex);
	    		        }
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
		    
		     
		     bMBtn.addActionListener(new ActionListener()
		     {

		    	   //----------------------------------------------------------------
		    	    public void actionPerformed(ActionEvent ae)
		    	    {		    	    	

		    
		    	     try
		    	     {
			    	    	

		    	      if(tf.getText().length()!=0)
		    	      {
		    	       BufferedReader brSearch1 = new BufferedReader( new FileReader("MenuList.txt") );
		    	       
		    	       //----------------------------------------------------------------
		    	       String recordSearch1;
		    	       String DisplaySearch1[]=new String[1024];
		    	       
		    	       nameSearchSel =tf.getText();
		    	       
		    	       int i=0;
		    	       while( ( recordSearch1 = brSearch1.readLine() ) != null )
		    	       {
		    	        StringTokenizer stSearchView1 = new StringTokenizer(recordSearch1,",");
		    	        if( recordSearch1.contains(nameSearchSel) )
		    	        {
		    	         DisplaySearch1[i]="ID = "+stSearchView1.nextToken()+" ***  Name = "+stSearchView1.nextToken()+" ***  Place = "+stSearchView1.nextToken()+" ***  Quality = "+stSearchView1.nextToken()+"\n";
		    	       if(DisplaySearch1[i].contains(nameSearchSel));
		    	       {
		    	    	  flag=1;
		    	       }
		    	         i++;
		    	        }
		    	       }
		    	       brSearch1.close();
		    	      
		    	      }
		    	     }
		    	     catch(Exception ex)
		    	     {
		    	      System.out.println("Exception msg: "+ex);
		    	     }
		    	     //----------------------------------------------------------------
		    	   if(flag==1)
		    		   { mMTextA=new JTextArea("          Enter the Details");
		  			     mMTextA.setPreferredSize(new Dimension(200,20));
		  			     mMTextA.setEditable(false);
		  			   bMenuSelectP2.add(mMTextA);
		  			     user_label = new JLabel("User Name :");
		  			       user_label.setPreferredSize(new Dimension(80,20));
		  			       
		  			       addMTextFName=new JTextField();
		  			       addMTextFName.setPreferredSize(new Dimension(200,20));
		  			       
		  			       user_labe = new JLabel("Place :");
		  			       user_labe.setPreferredSize(new Dimension(80,20));
		  			       
		  			       addMTextFNam=new JTextField();
		  			       addMTextFNam.setPreferredSize(new Dimension(200,20));
		  			       
		  			       user_lab = new JLabel("Phone no :");
		  			       user_lab.setPreferredSize(new Dimension(80,20));
		  			       
		  			       addMTextFNa=new JTextField();
		  			       addMTextFNa.setPreferredSize(new Dimension(200,20));
		  			       
		  			       user_la = new JLabel("email :");
		  			       user_la.setPreferredSize(new Dimension(80,20));
		  			       
		  			       addMTextFN=new JTextField();
		  			       addMTextFN.setPreferredSize(new Dimension(200,20));
		  			     user_l= new JLabel("Date :");
		  			       user_l.setPreferredSize(new Dimension(80,20));
		  			       
		  			     addMTextF=new JTextField();
		  			       addMTextF.setPreferredSize(new Dimension(200,20));
		  			       
		  			     bMenuSelectP2.add(user_label,BorderLayout.NORTH);
		  			   bMenuSelectP2.add(addMTextFName,BorderLayout.NORTH);
		  			       
		  			       
		  			 bMenuSelectP2.add(user_labe,BorderLayout.NORTH);
		  			bMenuSelectP2.add(addMTextFNam,BorderLayout.NORTH);
		  			       
		  			bMenuSelectP2.add(user_lab,BorderLayout.NORTH);
		  			     bMenuSelectP2.add(addMTextFNa,BorderLayout.NORTH);
		  			       
		  			   bMenuSelectP2.add(user_la,BorderLayout.NORTH);
		  			 bMenuSelectP2.add(addMTextFN,BorderLayout.NORTH);
		  			 
		  			bMenuSelectP2.add(user_l,BorderLayout.NORTH);
		  			 bMenuSelectP2.add(addMTextF,BorderLayout.NORTH);
		  			       
		  			       JButton ebutton=new JButton("SUBMIT");
		  				     ebutton.setPreferredSize(new Dimension(150,20));
		  				   bMenuSelectP2.add(ebutton);
		  			       
		  				 bMenuSelectP2.add(ebutton,BorderLayout.NORTH);
		  					   ebutton.addActionListener(new ActionListener(){
		  						    public void actionPerformed(ActionEvent ae)
		  					     {
		  			    		    	 if(tf.getText().length()!=0&&addMTextFName.getText().length()!=0&&addMTextFNam.getText().length()!=0&&addMTextFNa.getText().length()!=0&&addMTextFN.getText().length()!=0&&addMTextF.getText().length()!=0)
		  			    		    	 {  	
		  						    	bf.setVisible(false);
		  						    	mF.setVisible(true);
		  						 	    mF.setLayout(null);
		  			    		    	 }
		  			    		    	 else
		  			    		    	 {
		  			    		    		 
		  			    		    	 }
		  					     }
		  					   });
		    		   }
		    		   }
		    	   });
		     
		     
		     bf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		     bf.addWindowListener(new WindowAdapter()
		     {
		      public void windowClosing(WindowEvent we)//For Exit windowClosing event
		      {
		       int a = JOptionPane.showConfirmDialog(bf,"Are You Sure you want to exit? ");
		       if(a==JOptionPane.YES_OPTION)
		       {
		    	   bf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		       }
		      }
		     });  
		    

	}

	

	
	
}
