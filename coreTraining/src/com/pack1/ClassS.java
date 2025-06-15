package com.pack1;

public class ClassS 

{ 
	static int i = new ClassS().meth1();
	 final static int a;
	
	public static void main(String[] args) 
	{ 
		//a=2;  c.e because of final static variable
		System.out.println("main method");
		System.out.println(a);
	}
	static
	{ 
	    a=3;
		System.out.println("static block");
		System.out.println(a);
	}
	int meth1()

	{
		int i=2;
		System.out.println("method 1 executed");
		return  i;
	}
}
