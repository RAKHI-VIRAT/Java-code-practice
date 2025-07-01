package com.IObufferedSteams76;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class ClassA 
{
 void fileOperation1()throws Exception
 {
	System.out.println("Implementing Buffer byte streams");
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\prac\\f1.txt"));
    System.out.println("connection created");
    int i;
    while((i=bis.read())!=-1)
    {
    	System.out.print((char)i);
    }
    System.out.println("\nData is Retrived");
    bis.close();
 }
 void fileOperation2()throws Exception
 {
    System.out.println("writing the data into a file");
	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\prac\\f2.txt"));
    System.out.println("Connection created");
	String s=" harom hara harihara vera shankara. ";
    byte arr[]=s.getBytes();
    bos.write(arr);
    System.out.println("Data Entered");
    bos.close();
 }
 void fileOperation3()throws Exception
 {
	System.out.println("Coping the data from one file to other file");
	BufferedInputStream bis= new BufferedInputStream(new FileInputStream("F:\\prac\\f1.txt"));
	BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("F:\\prac\\f11.txt"));
	System.out.println("Connection created");
	int i;
	while((i=bis.read())!=-1)
	{
		bos.write(i);
	}
	System.out.println("Data is entered");
	bis.close();
	bos.close();
 }
 public static void main(String[] args)throws Exception
 {
	ClassA aobj=new ClassA();
	//aobj.fileOperation1();
	//aobj.fileOperation2();
	aobj.fileOperation3();
	
}
}
