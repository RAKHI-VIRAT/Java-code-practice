package com.practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassJ 
{
 void file()throws Exception
 {
	System.out.println("Reading the data from a file");
	FileInputStream fis=new FileInputStream("F:\\prac\\f1.txt");
	System.out.println("Connection Created");
	int i;
	while((i=fis.read())!=-1)
	{
		System.out.print((char)i);
	}
	System.out.println("\nData Reterived");
	fis.close();
 }
 void file2()throws Exception
 {
	 System.out.println("Writing the data int a file");
     FileOutputStream fos=new FileOutputStream("F:\\\\prac\\\\f2.txt",true);
     System.out.println("Connection Ctreated");
     String s="I love";
    byte arr[]= s.getBytes();
     fos.write(arr);
     System.out.println("Data Entered");
     fos.close();
 }
 void file3()throws Exception
 {
	 System.out.println("copy the data from a file");
	FileInputStream fis= new FileInputStream("F:\\\\prac\\\\f2.txt");
	FileOutputStream fos= new FileOutputStream("F:\\\\prac\\\\f3.txt");
  int i;
  while((i=fis.read())!=-1)
  {
	  fos.write(i);
  }
  System.out.println("Data copied");
  
  fis.close();
  fos.close();
 }
 public static void main(String[] args) throws Exception
 {
	ClassJ jobj=new ClassJ();
	//jobj.file();
	jobj.file2();
	jobj.file3();
}
}
