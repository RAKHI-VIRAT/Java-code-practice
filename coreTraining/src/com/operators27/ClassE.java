package com.operators27;

public class ClassE 
{
	
	void meth1()
	{
		int a = 34;    
		int b = 21;
		int c = a++ + ++b;   
		System.out.println(c);  
		int d = --a + --b + c--;  
		System.out.println(d);
		int e = a + +b + +c + d--; 
		System.out.println(e);
		System.out.println("---");
		
		int f = -a + b-- + -c - d++; 
		System.out.println(f);
		int sum = a + b + c + d + e + f;  
		System.out.println("sum = " + sum);
	}
	public static void main(String[] args) 
	{
		new ClassE().meth1();
	}

}
