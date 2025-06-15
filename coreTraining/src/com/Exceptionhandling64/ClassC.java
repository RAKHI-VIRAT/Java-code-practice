package com.Exceptionhandling64;

import java.io.FileReader;
import java.util.Scanner;

public class ClassC 
{
 void meth1()
 {
	 System.out.println("meth1() called");
	 Scanner sc=new Scanner(System.in);
	 
	 String arr[]=new String[5];
	 arr[1]="Kishan";
	 arr[2]="Java";
	 System.out.println(10);
	 try
	 {
		 System.out.println("try block executed");
		 System.out.println("Enter a number");
		 System.out.println("1)====>"+(20/sc.nextInt()));
		 System.out.println("Enter index position of array");
		 System.out.println("2)====>"+arr[sc.nextInt()].toUpperCase());
		 System.out.println("Hello world!!!");
	 }
	/* catch(ArithmeticException e)
	 {
		 System.out.println("1st catch block");
	     e.printStackTrace();
	 }
	 catch(NullPointerException e)
	 {
		 System.out.println("2nd catch Block executed");
		 e.printStackTrace();
	 }
	
	 */
	 catch(ArithmeticException | NullPointerException e)
	 {
		 System.out.println("catch block executed(Java 1.7v)");
		 e.printStackTrace();
	 }
	 finally
	 {
		 
		 System.out.println("finally Block executed");
		 System.out.println("hi");
		 sc.close();
	 }
	 System.out.println(30);
 }
 void meth2()throws Exception
 {
	 System.out.println("meth2() called");
	 try(FileReader fr=new FileReader("E:\\CORE JAVA\\New.txt"))
	 {
		 System.out.println("Connection created");
	 }
 }
 
 public static void main(String[] args) throws Exception
 {
	ClassC cobj=new ClassC();
	//cobj.meth1();
	cobj.meth2();
}
}
