package com.Exceptionhandling64;

import java.util.Scanner;

public class UserDefinedException 
{
 static double current_balance=100;
 
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter amount to withdraw");
	 int n=sc.nextInt();
	 try
	 {
		 if(current_balance<n)
		 {
			 throw new MinimumAccountBalanceException("Have sufficient balance first!!!");
		 }
		 else
		 {
			 System.out.println("Please Take The Money : "+n);
		 }
	 }
	 catch(MinimumAccountBalanceException e)
	 {
		 System.out.println("hi");
		 e.printStackTrace();
	 }
	 finally
	 {
		 System.out.println("hello");
		 sc.close();
		 
	 }
 }
}
