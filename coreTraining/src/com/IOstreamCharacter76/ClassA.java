package com.IOstreamCharacter76;
import java.io.FileReader;
import java.io.FileWriter;
public class ClassA 
{
	void fileOperator1()throws Exception
	{
		System.out.println("Reading the data from a file");
		FileReader fr=new FileReader("F:\\prac\\f1.txt");
		System.out.println();
		
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("\nData is retrived");
		fr.close();
	}
	void fileOperator2() throws Exception
	{
		System.out.println("Writting the data in to a file");
		FileWriter fw=new FileWriter("F:\\\\prac\\\\f6.txt",true);
	    System.out.println("Connection created");
		String s= " Sambha Shiva Shankara";
	    fw.write(s);
	    System.out.println("Data Entered");
	    fw.close();
	}
	
	void fileOperator3() throws Exception
	{
		System.out.println("Copying the data from one file to other file ");
		FileReader fr=new FileReader("F:\\\\\\\\prac\\\\\\\\f6.txt");
		FileWriter fw=new FileWriter("F:\\\\\\\\prac\\\\\\\\f7.txt");
		System.out.println("Connection created");
		int i;
		while((i=fr.read())!=-1)
		{
			fw.write(i);
		}
		System.out.println("Data retrived");
		fr.close();
		fw.close();
	}
public static void main(String[] args) throws Exception
{
	ClassA aobj=new ClassA();
	//aobj.fileOperator1();
	//aobj.fileOperator2();
	aobj.fileOperator3();
}
}
