package System;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class users {

	 JFrame uF,viewF,searchF,sortF;
	 Container uMenu,viewMenu,searchMenu,sortMenu;
 JPanel uMenuSelectP,uMenuViewP,viewMenuViewP,searchMenuSelectP,searchMenuSelectP2,searchMenuViewP,sortMenuViewP,searchMenuSelectP3;
 JTextArea uMTextA,viewMTextA,searchMTextAForView,searchMTextAForResult,sortMTextAForResult;
 JComboBox uMComboBox,searchMComboBox,searchMComboBQuality;
 JTextField searchMTextFName,searchMTextFPlace;
 
 //JButton mainMBtn,searchMBtn;
 
 JButton viewBackB,searchBackB,sortBackB,bbutton;
 
 JButton searchNameBtn,searchPlaceBtn,searchQualityBtn;
 
 
 
 
 
 JLabel searchNameL,searchPlaceL,searchQualityL;
 String ID, name, Place, SorN, Quality;
 String IDView, nameView, PlaceView, SorNView, IDnoView;
 String IDDelView, nameDelView, PlaceDelView, SorNDelView, IDnoDelView;
 String IDSort, nameSort, PlaceSort, SorNSort, IDnoSort;
 String IDDelete, nameDelete, PlaceDelete, SorNDelete, IDnoDelete;
 String nameSearchSel, PlaceSearchSel, SorNSearchSel;
 String newNameUpdate, newQualityUpdate, splittUpdate, newPlaceUpdate, recordUpdate1, IDUpdate1,IDUpdate2nd,recordUpdate2,choice;

 public void users()
 
 {
	 uF=new JFrame("User Menu");
	 viewF=new JFrame("View All Menu");
	 searchF=new JFrame("Search Menu");
	 
	//--Main Menu Container
	   uMenu=uF.getContentPane();
	   uMenu.setBackground(Color.yellow);
	   uMenu.setVisible(true);
	   
	 //--View Menu Container
	   viewMenu=viewF.getContentPane();
	   viewMenu.setBackground(Color.yellow);
	   viewMenu.setVisible(true);
	   //---
	   
	 //--Search Menu Container
	   searchMenu=searchF.getContentPane();
	   searchMenu.setBackground(Color.yellow);
	   searchMenu.setVisible(true);
	   //---
	   
	  
	   //---
	   //--Main Menu Panel
	   uMenuSelectP=new JPanel();
	   uMenuSelectP.setBounds(600,200,250,150);
	   uMenuSelectP.setBackground(Color.yellow);
	   
	   //uMenuViewP=new JPanel();
	   //uMenuViewP.setBounds(600,550,250,30);
	  // uMenuViewP.setBackground(Color.cyan);
	   
	   
	   
	   
	   //--View Menu Panel
	   
	   viewMenuViewP=new JPanel();
	   viewMenuViewP.setBounds(300,200,720,230);
	   viewMenuViewP.setBackground(Color.yellow);
	   
	   
	 //--Search Menu Panel
	   searchMenuSelectP=new JPanel();
	   searchMenuSelectP.setBounds(200,200,200,150);
	   searchMenuSelectP.setBackground(Color.yellow);

	   searchMenuSelectP2=new JPanel();
	   searchMenuSelectP2.setBounds(450,50,330,90);
	   searchMenuSelectP2.setBackground(Color.yellow);
	   
	   searchMenuViewP=new JPanel();
	   searchMenuViewP.setBounds(450,150,720,200);
	   searchMenuViewP.setBackground(Color.yellow);
	   
	   
	   
	   
	 
	   
	   {//--setting all frames visiblity to true
		   
		   uF.setVisible(true);
		   uF.setLayout(null);
		   
		   viewF.setVisible(false);
		   viewF.setLayout(null);
		   
		   searchF.setVisible(false);
		   searchF.setLayout(null);
		 
		   
	   }
	   //--setting frame and container size
	   //--(main)setting frame and container size
	   uMenu.add(uMenuSelectP);
	   //uMenu.add(mainMenuViewP);
	   uMenu.setSize(50,300);
	   uF.setSize(1200,600);
	   uMenu.setVisible(true);
	   //---
	   
	   //--(view)setting frame and container size
	   viewMenu.add(viewMenuViewP);
	   viewMenu.setSize(1200,600);
	   viewF.setSize(1200,600);
	   viewMenu.setVisible(true);
	   
	   //--(search)setting frame and container size
	   searchMenu.add(searchMenuSelectP);
	   searchMenu.add(searchMenuSelectP2);
	   searchMenu.add(searchMenuViewP);
	 
	   searchMenu.setSize(1200,600);
	   searchF.setSize(1200,600);
	   searchMenu.setVisible(true);
	   
	
	   
	 //main menu view
	   uMTextA=new JTextArea("      SELECT YOUR CHOICE:");
	   //\n\n1 ---> View All restaurant \n2 ---> Search restaurant \n3 ---> Sort restaurant\n4 ---> Exit");
	   uMTextA.setPreferredSize(new Dimension(200,20));
	   uMTextA.setEditable(false);
	   
	   
	  // String select[]={"1","2","3","4"};
	  /// mainMComboBox=new JComboBox(select);
	  // mainMComboBox.setPreferredSize(new Dimension(50,20));
	   
	  // mainMBtn=new JButton("SELECT");
	  // mainMBtn.setPreferredSize(new Dimension(80,20));
	   
	   uMenuSelectP.add(uMTextA,BorderLayout.CENTER);
	  // mainMenuSelectP.add(mainMComboBox,BorderLayout.SOUTH);
	   
	   //mainMenuViewP.add(mainMBtn,BorderLayout.CENTER);
 
	 //view menu view
	   //---
	   
	   viewBackB=new JButton("Back");
	   viewBackB.setPreferredSize(new Dimension(80,20));
	   
	   viewMTextA=new JTextArea(10, 60);
	   viewMTextA.setPreferredSize(new Dimension(700,450));
	   viewMTextA.setEditable(false);
	 //---
	   //----------------------------------------------------------------
	   JScrollPane scrollView = new JScrollPane(viewMTextA,
	   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	   //----------------------------------------------------------------
	   viewMenuViewP.add(viewBackB,BorderLayout.NORTH);
	   
	   viewMenuViewP.add(scrollView,BorderLayout.CENTER);
	   //viewMenuViewP.add(viewMTextA,BorderLayout.SOUTH);
	   //Search menu view
	   searchMTextAForView=new JTextArea("Select search input:");
	   //\n1 ---> Search by Name\n2 ---> Search by Place\n3 ---> Search by Quality");
	   searchMTextAForView.setPreferredSize(new Dimension(170,20));
	   searchMTextAForView.setEditable(false);
	   
	   
	   //String selectSearcg[]={"1","2","3"};
	   //searchMComboBox=new JComboBox(selectSearcg);
	   //searchMComboBox.setPreferredSize(new Dimension(50,20));
	   
	  // searchMBtn=new JButton("Select");
	  // searchMBtn.setPreferredSize(new Dimension(80,20));
	   
	   searchBackB=new JButton("Back");
	   searchBackB.setPreferredSize(new Dimension(80,20));
	   
	   //----------------------------------------------------------------
	   searchNameL=new JLabel("Name: ");
	   searchNameL.setPreferredSize(new Dimension(40,20));
	    
	   searchMTextFName=new JTextField();
	   searchMTextFName.setPreferredSize(new Dimension(110,20));
	   
	   searchNameBtn=new JButton("Name Search");
	   searchNameBtn.setPreferredSize(new Dimension(130,20));
	   //----------------------------------------------------------------
	   searchPlaceL=new JLabel("Place: ");
	   searchPlaceL.setPreferredSize(new Dimension(40,20));
	    
	   searchMTextFPlace=new JTextField();
	   searchMTextFPlace.setPreferredSize(new Dimension(110,20));
	   
	   searchPlaceBtn=new JButton("Place Search");
	   searchPlaceBtn.setPreferredSize(new Dimension(130,20));
	   //----------------------------------------------------------------
	   searchQualityL=new JLabel("Quality: ");
	   searchQualityL.setPreferredSize(new Dimension(50,20));
	    
	   String selectQuality[]={"Select Quality","Good","Medium"};
	   searchMComboBQuality=new JComboBox(selectQuality);
	   searchMComboBQuality.setPreferredSize(new Dimension(110,20));
	   
	   searchQualityBtn=new JButton("Quality Search");
	   searchQualityBtn.setPreferredSize(new Dimension(130,20));
	   //----------------------------------------------------------------
	   
	    searchMTextAForResult=new JTextArea(10, 60);
	    searchMTextAForResult.setPreferredSize(new Dimension(700,450));
	    searchMTextAForResult.setEditable(false);
	    
	    //---
	    //----------------------------------------------------------------
	    JScrollPane scrollSearch = new JScrollPane(searchMTextAForResult,
	    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	   
	   //---------------------------------- Display ------------------------------
	   
	   searchMenuSelectP.add(searchMTextAForView,BorderLayout.NORTH);
	   //searchMenuSelectP.add(searchMComboBox,BorderLayout.CENTER);
	  // searchMenuSelectP.add(searchMBtn,BorderLayout.SOUTH);
	   searchMenuSelectP.add(searchBackB,BorderLayout.SOUTH);
	   
	   //-------------
	   
	   searchMenuSelectP2.add(searchNameL,BorderLayout.NORTH);
	   searchMenuSelectP2.add(searchMTextFName,BorderLayout.NORTH);
	   searchMenuSelectP2.add(searchNameBtn,BorderLayout.NORTH);
	   
	   searchMenuSelectP2.add(searchPlaceL,BorderLayout.CENTER);
	   searchMenuSelectP2.add(searchMTextFPlace,BorderLayout.CENTER);
	   searchMenuSelectP2.add(searchPlaceBtn,BorderLayout.CENTER);
	   
	   searchMenuSelectP2.add(searchQualityL,BorderLayout.SOUTH);
	   searchMenuSelectP2.add(searchMComboBQuality,BorderLayout.SOUTH);
	   searchMenuSelectP2.add(searchQualityBtn,BorderLayout.SOUTH);
	   
	   
	   
	   searchMenuViewP.add(scrollSearch,BorderLayout.CENTER);

	   //----------------------------------------------------------------
	  
	   JButton vbutton=new JButton("View All restaurant");
	   vbutton.setPreferredSize(new Dimension(150,20));
	   uMenuSelectP.add(vbutton);
	   vbutton.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent ae)
	     {
	 
		    	
		        
		         uF.setVisible(false);
		         //----------------------------------------------------------------
		         try
		         {
		          //View details
		         
		          BufferedReader bR1 = new BufferedReader( new FileReader("MenuList.txt") ); 
		          String record;
		          
		          int i=0;
		          String DisplayView1[]=new String[1024];
		          while( ( record = bR1.readLine() ) != null )
		          {
		          StringTokenizer st = new StringTokenizer(record,",");
		          
		          IDView=st.nextToken();
		          nameView=st.nextToken();
		          PlaceView=st.nextToken();
		          SorNView=st.nextToken();
		          IDnoView=st.nextToken();
		          DisplayView1[i]="ID = "+IDView+"  ***  Name = "+nameView+"  ***  Place = "+PlaceView+"  ***  Quality = "+SorNView+"\n";
		          
		          viewMTextA.append(DisplayView1[i]);
		          i++;
		          }
		          bR1.close();
		         }
		         catch(Exception ex)
		         {
		          System.out.println("Exception msg: "+ex);
		         }
		         //----------------------------------------------------------------
		         viewF.setVisible(true);
		        }
	   });
	   JButton sbutton=new JButton("Search restaurant");
	   sbutton.setPreferredSize(new Dimension(150,20));
	   uMenuSelectP.add(sbutton);

	   sbutton.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent ae) 
		        {
		         uF.setVisible(false);
		         searchF.setVisible(true);
		        }
	   });
		    	 																									
		    
	   JButton ebutton=new JButton("Exit");
	   ebutton.setPreferredSize(new Dimension(150,20));
	   uMenuSelectP.add(ebutton);

	   ebutton.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent ae)
		     {
		      // System.exit(0);
		      showDialog();
		     }
		    
		   });
	   {//ActionListener for Back of view menu
		    viewBackB.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent ae){
		     viewF.setVisible(false);
		     uF.setVisible(true);
		     viewMTextA.setText("");
		    }
		    
		   });
		  }
	   {//ActionListener for Back of Search menu
		    searchBackB.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent ae){
		     searchF.setVisible(false);
		     uF.setVisible(true);
		     searchMTextFName.setText("");
		     searchMTextFPlace.setText("");
		     searchMTextAForResult.setText("");
		    }
		   });
		  }
	  
		  
		 
	   uF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	   uF.addWindowListener(new WindowAdapter()
	   {
	    public void windowClosing(WindowEvent we)//For Exit windowClosing event
	    {
	     int a = JOptionPane.showConfirmDialog(uF,"Are You Sure you want to exit? ");
	     if(a==JOptionPane.YES_OPTION)
	     {
	      uF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     }
	    }
	   });
	   viewF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	   viewF.addWindowListener(new WindowAdapter()
	   {
	    public void windowClosing(WindowEvent we)//For Exit windowClosing event
	    {
	     int a = JOptionPane.showConfirmDialog(viewF,"Are You Sure you want to exit? ");
	     if(a==JOptionPane.YES_OPTION)
	     {
	      viewF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     }
	    }
	   });
	   searchF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	   searchF.addWindowListener(new WindowAdapter()
	   {
	    public void windowClosing(WindowEvent we)//For Exit windowClosing event
	    {
	     int a = JOptionPane.showConfirmDialog(searchF,"Are You Sure you want to exit? ");
	     if(a==JOptionPane.YES_OPTION)
	     {
	      searchF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     }
	    }
	   });
	  
	   
	   //-------------------------------- Search start --------------------------------
	   {//Search Select Event
	       searchNameL.setVisible(false);
	       searchMTextFName.setVisible(false);
	       searchNameBtn.setVisible(false);
	       
	       searchPlaceL.setVisible(false);
	       searchMTextFPlace.setVisible(false);
	       searchPlaceBtn.setVisible(false);
	       
	       searchQualityL.setVisible(false);
	       searchMComboBQuality.setVisible(false);
	       searchQualityBtn.setVisible(false);
	    
	       JButton sn=new JButton("Search by Name");
		    sn.setPreferredSize(new Dimension(150,20));
		    searchMenuSelectP.add(sn);
		    
		    
		    sn.addActionListener(new ActionListener(){
		   	     public void actionPerformed(ActionEvent ae)
		   	    	     {
	       searchMTextFName.setText("");
	       searchMTextAForResult.setText("");
	       
	       searchNameL.setVisible(true);
	       searchMTextFName.setVisible(true);
	       searchNameBtn.setVisible(true);
	       
	       searchPlaceL.setVisible(false);
	       searchMTextFPlace.setVisible(false);
	       searchPlaceBtn.setVisible(false);
	       
	       searchQualityL.setVisible(false);
	       searchMComboBQuality.setVisible(false);
	       searchQualityBtn.setVisible(false);
	      }
		    });
	   JButton sp=new JButton("Search by place");
	    sp.setPreferredSize(new Dimension(150,20));
	    searchMenuSelectP.add(sp);
	    
	   
	      
	    sp.addActionListener(new ActionListener(){
	   	     public void actionPerformed(ActionEvent ae)
	   	     {
	       searchMTextFPlace.setText("");
	       searchMTextAForResult.setText("");
	       
	       searchNameL.setVisible(false);
	       searchMTextFName.setVisible(false);
	       searchNameBtn.setVisible(false);
	       
	       searchPlaceL.setVisible(true);
	       searchMTextFPlace.setVisible(true);
	       searchPlaceBtn.setVisible(true);
	       
	       searchQualityL.setVisible(false);
	       searchMComboBQuality.setVisible(false);
	       searchQualityBtn.setVisible(false);
	      }
	    });
	    
	      JButton sq=new JButton("Search by quality");
		    sq.setPreferredSize(new Dimension(150,20));
		    searchMenuSelectP.add(sq);
		    sq.addActionListener(new ActionListener(){
		   	     public void actionPerformed(ActionEvent ae)
	      {
	       searchMTextAForResult.setText("");
	       
	       searchNameL.setVisible(false);
	       searchMTextFName.setVisible(false);
	       searchNameBtn.setVisible(false);
	       
	       searchPlaceL.setVisible(false);
	       searchMTextFPlace.setVisible(false);
	       searchPlaceBtn.setVisible(false);
	       
	       searchQualityL.setVisible(true);
	       searchMComboBQuality.setVisible(true);
	       searchQualityBtn.setVisible(true);
	      }
	      
	     
	     
	    });
	   }
	   
	   {//Search View Event
		   
		   
		   searchNameBtn.addActionListener(new ActionListener()
		   {
		   //----------------------------------------------------------------
		    public void actionPerformed(ActionEvent ae)
		    {
		     try
		     {
		      if(searchMTextFName.getText().length()!=0)
		      {
		       BufferedReader brSearch1 = new BufferedReader( new FileReader("MenuList.txt") );
		       searchMTextAForResult.setText("");
		       
		       //----------------------------------------------------------------
		       String recordSearch1;
		       String DisplaySearch1[]=new String[1024];
		       
		       nameSearchSel =searchMTextFName.getText();
		       nameSearchSel=nameSearchSel.toLowerCase();
		       int i1=0;
		       while( ( recordSearch1 = brSearch1.readLine() ) != null )
		       {
		        StringTokenizer stSearchView1 = new StringTokenizer(recordSearch1,",");
		        if( recordSearch1.contains(nameSearchSel) )
		        {
		         DisplaySearch1[i1]="ID = "+stSearchView1.nextToken()+"  ***  Name = "+stSearchView1.nextToken()+"  ***  Place = "+stSearchView1.nextToken()+"  ***  Quality = "+stSearchView1.nextToken()+"\n";
		       
		         searchMTextAForResult.append(DisplaySearch1[i1]);
		         i1++;
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
		    }
		   });
		   //----------------------------------------------------------------
		   searchPlaceBtn.addActionListener(new ActionListener()
		   {
		    public void actionPerformed(ActionEvent ae)
		    {
		     try
		     {
		      if(searchMTextFPlace.getText().length()!=0)
		      {
		       //----------------------------------------------------------------
		       BufferedReader brSearch2 = new BufferedReader( new FileReader("MenuList.txt") );
		       searchMTextAForResult.setText("");
		       
		       //----------------------------------------------------------------
		       String recordSearch2;
		       String DisplaySearch2[]=new String[1024];
		       
		       PlaceSearchSel =searchMTextFPlace.getText();
		       
		       int i2=0;
		       while( ( recordSearch2 = brSearch2.readLine() ) != null )
		       {
		        StringTokenizer stSearchView2 = new StringTokenizer(recordSearch2,",");
		        if( recordSearch2.contains(PlaceSearchSel) )
		        {        
		         DisplaySearch2[i2]="ID = "+stSearchView2.nextToken()+"  ***  Name = "+stSearchView2.nextToken()+"  ***  Place = "+stSearchView2.nextToken()+"  ***  Quality = "+stSearchView2.nextToken()+"\n";
		        
		         searchMTextAForResult.append(DisplaySearch2[i2]);
		         i2++;
		        }
		       }
		       brSearch2.close();
		      }
		     }
		     catch(Exception ex)
		     {
		      System.out.println("Exception msg: "+ex);
		     }
		     //----------------------------------------------------------------
		    }
		   });
		   //----------------------------------------------------------------
		   searchQualityBtn.addActionListener(new ActionListener()
		   {
		    public void actionPerformed(ActionEvent ae)
		    {
		      try
		      {
		       
		       //----------------------------------------------------------------
		       BufferedReader brSearch3 = new BufferedReader( new FileReader("MenuList.txt") );
		       searchMTextAForResult.setText("");
		       //----------------------------------------------------------------
		       String recordSearch3;
		       String DisplaySearch3[]=new String[1024];
		       
		       SorNSearchSel =searchMComboBQuality.getSelectedItem().toString();
		        
		        int i3=0;
		        while( ( recordSearch3 = brSearch3.readLine() ) != null )
		        {
		         StringTokenizer stSearchView3 = new StringTokenizer(recordSearch3,",");
		         if( recordSearch3.contains(SorNSearchSel) )
		         {
		          DisplaySearch3[i3]="ID = "+stSearchView3.nextToken()+"  ***  Name = "+stSearchView3.nextToken()+"  ***  Place = "+stSearchView3.nextToken()+" ***  Quality  = "+stSearchView3.nextToken()+"\n";
		        
		          searchMTextAForResult.append(DisplaySearch3[i3]);
		          i3++;
		         }
		        }
		        brSearch3.close();
		     //----------------------------------------------------------------
		      }
		      catch(Exception ex)
		      {
		       System.out.println("Exception msg: "+ex);
		      }
		    }
		   });
		   //----------------------------------------------------------------
		 }
	   
	   
	  
	   searchMenuSelectP3=new JPanel();
	   searchMenuSelectP3.setBounds(500,450,230,30);
	   searchMenuSelectP3.setBackground(Color.yellow);
	   
	   searchMenu.add(searchMenuSelectP3);
	   JButton bbutton=new JButton("Book the Table");
	   bbutton.setPreferredSize(new Dimension(200,20));
	   searchMenu.add(bbutton);
	   
	   searchMenuSelectP3.add(bbutton,BorderLayout.NORTH);
	   bbutton.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent ae)
	     {
		    	searchF.setVisible(false);
		    	booking h=new booking();
		    	h.booking();
	     }
	   });
 } protected void showDialog() {
		   int a = JOptionPane.showConfirmDialog(uF,"Are You Sure you want to exit? ");
		   if(a==JOptionPane.YES_OPTION)
		   {
		    System.exit(0);
		   }
		      }
 
 }
 