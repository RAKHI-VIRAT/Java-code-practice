package com.pack1;

public class ClassO 
{
	int x= 10;  //Instance / non-static / Global variable
	static int y=20; //static /class variable
	
	void meth1() // Instance / normal / concrete / non-static
	{
		int a; // local variable
		a=2;
		System.out.println("the varibles in non-static method");
		System.out.println("meth1() called\n");
		System.out.println("instance variable x : "+x ); // by using identifier name
		System.out.println("instance variable x : "+new ClassO().x ); // by using class object
		
		System.out.println("Static variable y : "+y); //by using identifier name
		System.out.println("Static variable y : "+new ClassO().y); //by using class object
		System.out.println("Stativ variable y : "+ClassO.y);// by using class name *****
		
		System.out.println("local variable a : "+a);// using identifier name
	}
	 static void meth2() // static method
	{
		int a; // local variable
		a=2;
		System.out.println("the varibles in static method");
		System.out.println("meth2() called\n");
		//System.out.println("instance variable x : "+x ); // by using identifier name C.E because of static method
		System.out.println("instance variable x : "+new ClassO().x ); // by using class object***
		
		System.out.println("Static variable y : "+y); //by using identifier name
		System.out.println("Static variable y : "+new ClassO().y); //by using class object 
		System.out.println("Stativ variable y : "+ClassO.y);// by using class name
		
		System.out.println("local variable a : "+a);// using identifier name
	}
	
	public static void main(String[] args) 
	{
		ClassO aobj=new ClassO();
		aobj.meth1(); // calling by class object
		//meth1(); //error because of not static method (identifier name)
		//ClassO.meth1(); //error because of not static method (class name)
		
		System.out.println("-----------------------------\n");
		System.out.println("\nstatic method calling by class object");
		System.out.println("--------\n");
		
		aobj.meth2(); // calling by class object
		System.out.println("\nstatic method calling by identifier name");
		System.out.println("--------\n");
		meth2(); //calling by (identifier name)
		
		System.out.println("\nstatic method calling by class name");
		System.out.println("--------\n");
		ClassO.meth2(); //calling by (class name)******
		System.out.println("--------\n");
	}
	

}
