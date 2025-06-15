package com.constructor24;

public class ClassC 
{
	// variables in a constructor
	int a;  // instance variable
	static int b;  //Static variable
	public ClassC() //non-parameterized constructor
	{
		int x; // local variable
		x=2;
		System.out.println("Instance variable a : "+a);  // by using identifier name
		//System.out.println("Instance variable a : "+new ClassC().a);  // by using class object // error stack over flow
		
		System.out.println("Static Variable b : "+b); // by using identifier name
		//System.out.println("Static Variable b : "+new ClassC().b); // by using class object  //error stack over flow
		System.out.println("Static Variable b : "+ClassC.b); // by using class name
		
		System.out.println("Local Varible x : "+x); //by using identifier name
		  
	}
	public static void main(String[] args) 
	{
		new ClassC();
		
	}

}
