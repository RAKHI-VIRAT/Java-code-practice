package com.IObufferedSteams76;//Bufferer Character Stream
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ClassB 
{
	void operator1()throws Exception
	{
		System.out.println("Reading the data\n");
		BufferedReader br = new BufferedReader(new FileReader("F:\\prac\\f1.txt"));
		System.out.println("Connection Created");
		int i;
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("\ndata retrived");
		br.close();
	}
	void operator2()throws Exception
	{
		System.out.println("Writing the data into a file\n");
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\prac\\f1.txt",true));
		System.out.println("Connection Created");
		String s="OM NAMO SHIVAYA";
		bw.write(s);
		System.out.println("Data entered");
		bw.close();
	}
	void operator3()throws Exception
	{
		System.out.println("Coping the data from one file to another\n");
		BufferedReader br = new BufferedReader(new FileReader("F:\\prac\\f1.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\prac\\f22.txt"));
		System.out.println("Connection created");
		int i;
		while((i=br.read())!=-1)
		{
			bw.write(i);
		}
		System.out.println("DATA coppied");
		br.close();
		bw.close();
	}
public static void main(String[] args) throws Exception
{
	ClassB bobj=new ClassB();
	//bobj.operator1();
	//bobj.operator2();
	bobj.operator3();
}
}
