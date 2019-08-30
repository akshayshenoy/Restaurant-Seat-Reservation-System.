package System;

import java.io.*;
import java.util.*;



class DishData
{
 String ID,dishName,Place,quality;
 
 int IDno;

 public DishData(String ID,String dishName,String Place,String quality, int IDno) 
 {
  this.ID = ID;
  this.dishName=dishName;
  this.Place=Place;
  this.quality=quality;
  
  this.IDno = IDno;
 }
}

//idCompare Class to compare the names

class idCompare implements Comparator<DishData>
{
 @Override
 public int compare(DishData s1, DishData s2)
 {
  return s2.ID.compareTo(s1.ID);
  //System.out.println(ID);
 }
}
//Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
//dishNameCompare Class to compare the names

class dishNameCompare implements Comparator<DishData>
{
 @Override
 public int compare(DishData s1, DishData s2)
 {
  return s2.dishName.compareTo(s1.dishName);
 }
}
//PlaceCompare Class to compare the names
//Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
class PlaceCompare implements Comparator<DishData>
{
 @Override
 public int compare(DishData s1, DishData s2)
 {
  return s2.Place.compareTo(s1.Place);
 }
}
//qualityCompare Class to compare the names

class qualityCompare implements Comparator<DishData>
{
 @Override
 public int compare(DishData s1, DishData s2)
 {
  return s2.quality.compareTo(s1.quality);
 }
}
//idNoCompare Class to compare the marks
class idNoCompare implements Comparator<DishData>
{
 @Override
 public int compare(DishData s1, DishData s2)
 {
  return s1.IDno - s2.IDno;
 }
}

public class SortTextFile
{
 public boolean sort()
 {
  File file;
  boolean check = false;
  try{
   file=new File("MenuList.txt");
  
  //Creating BufferedReader object to read the input text file
  
  BufferedReader reader = new BufferedReader(new FileReader(file));
  
  //Creating ArrayList to hold DishData objects
  
  ArrayList<DishData> dishRecords = new ArrayList<DishData>();
  
  //Reading DishData records one by one
  
  String currentLine = reader.readLine();

  while (currentLine != null)
  {
   String[] dishDetail = currentLine.split(",");
   
   String ID = dishDetail[0];
   String dishName = dishDetail[1];
   String Place = dishDetail[2];
   String quality = dishDetail[3];
   
   int IDno = Integer.valueOf(dishDetail[4]);
   
   //Creating DishData object for every DishData record and adding it to ArrayList
   
   dishRecords.add(new DishData(ID,dishName,Place,quality,IDno));
   
   currentLine = reader.readLine();
  }
 
  //Sorting ArrayList dishRecords based on marks
  
  Collections.sort(dishRecords, new idNoCompare());
  
  //Creating BufferedWriter object to write into output text file

  BufferedWriter writer = new BufferedWriter(new FileWriter(file));

  //Writing every dishRecords into output text file
  
  for (DishData dishData : dishRecords)
  {
   writer.write(dishData.ID);
   writer.write(","+dishData.dishName);
   writer.write(","+dishData.Place);
   writer.write(","+dishData.quality);
   
   writer.write(","+dishData.IDno);
   
   writer.newLine(); 
  }

  //Closing the resources

  reader.close();
  writer.close();
  
  }
  catch(Exception ex)
  {
   System.out.println("Exception msg: "+ex);
  }
  return true;
  
  
 }
 
}