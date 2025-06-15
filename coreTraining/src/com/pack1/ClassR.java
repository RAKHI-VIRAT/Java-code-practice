package com.pack1;

public class ClassR 
{
	int a=1;
	static int b=10;
	 
public ClassR()
 {
	a++;
	b++;
	System.out.println("constructor");
	System.out.println("instance variable: "+a); //identifier name
	//System.out.println("instance variable: "+new ClassR().a); //class object
	System.out.println("----------\n");
	
	System.out.println("static variable: "+b); // identifier name
	System.out.println("static variable: "+ ClassR.b);  // by class name
	//System.out.println("static variable: "+ new ClassR().b); //by class object
	 
 }
void display()
{
	System.out.println("non-static method");
	System.out.println("constructor");
	System.out.println("instance variable: "+a); //identifier name
	System.out.println("instance variable: "+new ClassR().a); //class object
	System.out.println("----------\n");
	
	System.out.println("static variable: "+b); // identifier name
	System.out.println("static variable: "+ ClassR.b);  // by class name
	System.out.println("static variable: "+ new ClassR().b); //by class object 
} 
public static void main(String[] args) 
{
	new ClassR();
	System.out.println("################################");
	new ClassR().display();
}
}
