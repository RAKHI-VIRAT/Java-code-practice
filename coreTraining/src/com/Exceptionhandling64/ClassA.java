package com.Exceptionhandling64;

import java.util.Scanner;

public class ClassA
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("meth1() called");
		
		System.out.println(10);
		try
		{
			System.out.println("try block executed");
			System.out.println("Enter a number");
			System.out.println("====>"+(20/sc.nextInt()));
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch Block executed");
			System.out.println(e.getMessage());//Reason of exception
		    System.out.println(e.toString());//name & reason of exception
		    e.printStackTrace();//complete info about exception
		}
		finally
		{
			System.out.println("finally Block executed");
		}
		System.out.println(30);
	}
 public static void main(String[] args) 
 {
	ClassA aobj =new ClassA();
	aobj.meth1();
}
}
