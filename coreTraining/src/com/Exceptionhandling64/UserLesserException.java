package com.Exceptionhandling64;

import java.util.Scanner;

public class UserLesserException 

{
	
	public static void main(String[] args) 
	{
		System.out.println("hi");
		Scanner sc=new Scanner(System.in);
		int num=10;
		System.out.println("enter number");
		int s=sc.nextInt();
		try
		{
			if(num>s)
			{
				throw new lesserException("the number you enter is lesser number") ;
			}
			else
			{
				System.out.println("The number you entered is bigger");
			}
		}
		catch(lesserException e)
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
