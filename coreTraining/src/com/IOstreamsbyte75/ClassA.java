package com.IOstreamsbyte75;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ClassA 
{
 void fileOperators1()throws Exception
 {
	 System.out.println("Reading the data from a file\n");
	 FileInputStream fis=new FileInputStream("F:\\prac\\f1.txt");
	 System.out.println("connection created");
	int i;
	while((i=fis.read())!=-1)
	{
		System.out.print((char)i);
	}
	System.out.println("\nData retrived");
	fis.close();
 }
 void fileOperators2()throws Exception
 {
	 System.out.println("Writing the data into a file\n");
	 FileOutputStream fos=new FileOutputStream("F:\\prac\\f2.txt",true);
	 System.out.println("Connection created");
	 String s="Shiva Shiva Shankara";
	 byte arr[]=s.getBytes();
	 fos.write(arr);
	 fos.close();
	 System.out.println("Data is entered");
	 
 }
 void fileOperators3()throws Exception
 {
	 System.out.println("Coping the data one file to the other file");
	 FileInputStream fis=new FileInputStream("F:\\\\prac\\\\f2.txt");
	 FileOutputStream fos=new FileOutputStream("F:\\\\prac\\\\f4.txt");
	 System.out.println("connection created");
	 int i;
	 while((i=fis.read())!=-1)
	 {
		 fos.write(i);
	 }
	 System.out.println("Data coppied");
	 fis.close();
	 fos.close();
 }
 public static void main(String[] args) throws Exception
 {
	ClassA aobj=new ClassA();
	//aobj.fileOperators1();
	aobj.fileOperators2();
	//aobj.fileOperators3();
}
}
