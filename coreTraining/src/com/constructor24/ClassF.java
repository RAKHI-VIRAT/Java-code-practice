package com.constructor24;

public class ClassF 
{
	int a=1;
	static int b=10;
	 
public ClassF()  //constructor
 {
	a++;
	b++;
	System.out.println("\nconstructor");
	System.out.println("instance variable: "+a); //identifier name
	//System.out.println("instance variable: "+new ClassF().a); //class object
	System.out.println("----------\n");
	
	System.out.println("static variable: "+b); // identifier name
	System.out.println("static variable: "+ ClassF.b);  // by class name
	//System.out.println("static variable: "+ new ClassF().b); //by class object
	 
 }
void display()  //non-static method
{
	System.out.println("non-static method");
	System.out.println("constructor");
	System.out.println("instance variable: "+a); //identifier name
	System.out.println("instance variable: "+new ClassF().a); //class object
	System.out.println("----------\n");
	
	System.out.println("static variable: "+b); // identifier name
	System.out.println("static variable: "+ ClassF.b);  // by class name
	System.out.println("static variable: "+ new ClassF().b); //by class object 
} 
public static void main(String[] args) 
{
	new ClassF();
	System.out.println("################################");
	new ClassF().display();
}
}
