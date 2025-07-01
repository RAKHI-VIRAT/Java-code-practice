package com.IOdataStreams77;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
public class ClassA 
{
	void file1()throws Exception
	{
		System.out.println("Implementing DATA-STREAMS");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("F:\\prac\\f23.txt"));
		System.out.println("Connection Created");
		
		dos.writeInt(1000);
		dos.writeChar('A');
		dos.writeBoolean(true);
		dos.writeInt(2000);
		System.out.println("Data Entered");
		dos.close();
		DataInputStream dis=new DataInputStream(new FileInputStream("F:\\prac\\f23.txt"));
	    System.out.println("connection created\n");
		System.out.println(dis.readInt());
	    System.out.println(dis.readChar());
	    System.out.println(dis.readBoolean());
	    System.out.println(dis.readInt());
	    
	    dis.close();
	}
	void file2() throws Exception//pending
	{
		System.out.println("copying data from one file to other");
		DataInputStream dis=new DataInputStream(new FileInputStream("F:\\prac\\f23.txt"));
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("F:\\prac\\f24.txt"));
		dos.write(dis.read());
		dis.close();
		dos.close();
	
	}
 public static void main(String[] args)throws Exception
 {
	ClassA aobj=new ClassA();
	aobj.file1();
	aobj.file2();
}
}
