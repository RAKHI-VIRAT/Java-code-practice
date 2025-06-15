package com.static29;

public class ClassA //variables in static block
{
	int x;   // instance variable
	static int y;  // static variable
	final static int z;  // final static variable
	
	static //static block
	{
		int a=5;  // local variable
		z=1;    //initialize final static variable
		y=2;  //initialize static variable
		//x=3; // initialize instance variable //c.e 
		
		System.out.println("calling instance variable");
	   // System.out.println("instance variable x "+x);//by identifier name //c.e because instance variable in static block only by class object
	   System.out.println("Instance variable x "+new ClassA().x); //by using class object
	   
	   System.out.println("---------\n");
	   System.out.println("Calling static variable");
	   System.out.println("Static variable y "+y);  // by identifier name
	   System.out.println("Static variable y "+new ClassA().y); //by using class object
	   System.out.println("Static variable y "+ClassA.y);  // by using class name
	   System.out.println("--------\n");
	   
	   System.out.println("Calling final static varible");
	   System.out.println("Final Static variable z "+z);// by identifier name
	   System.out.println("Final Static variable z "+new ClassA().z); //by using class object
	   System.out.println("Final Static variable z "+ClassA.z);// by using class name
	   
	   System.out.println("------\n");
	   System.out.println("callin local variable");
	   System.out.println("Local variable a "+a);
	   
	}
	public static void main(String[] args) 
	{
		//System.out.println("hi");
	}
	

}
