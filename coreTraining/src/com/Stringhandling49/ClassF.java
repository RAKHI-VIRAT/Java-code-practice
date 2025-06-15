package com.Stringhandling49;
import java.util.Scanner;
public class ClassF 
{
	
	void checkName(String name)
	{
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("The given name "+name+" is a palindrome");
		}
		else
		{
			System.out.println("The given name "+name+" is not a palindrome");
		}
		
	}
public static void main(String[] args) 
{
	ClassF fobj=new ClassF();
	System.out.println("Enter the name");
	Scanner sc= new Scanner(System.in);
	fobj.checkName(sc.nextLine());
	sc.close();
}
}
