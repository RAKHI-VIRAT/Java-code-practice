package com.scannerClass41;

import java.util.Scanner;
public class ClassA 
{
	void meth1()
	{
		System.out.println("meth1() called\n");
		Scanner sca =new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int x=sca.nextInt();
		System.out.println("x "+x);
		
		System.out.println("\nEnter 2nd number");
		int y= sca.nextInt();
		System.out.println("y : "+y);
		int z=x+y;
		System.out.println("\nz value : "+z);
		
		sca.close();
	}
  public static void main(String[] args) 
  {
	new ClassA().meth1();
}
}
