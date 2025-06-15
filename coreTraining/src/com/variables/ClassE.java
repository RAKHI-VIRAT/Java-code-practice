package com.variables;
public class ClassE 
{
	int x; // instance variable
	static int y;  //static variable
	
	void meth1()
	{
	
		System.out.println("instance variable");
		System.out.println(x); // calling by identifier name
		System.out.println(new ClassE().x); //calling with respective class object
		System.out.println("---------");
		
		System.out.println("\nstatic varible");
		System.out.println(y);      //calling by identifier name
		//int y=3;
		System.out.println(new ClassE().y);  //calling with respective class object
		System.out.println(ClassE.y);  // calling  with class name
		System.out.println("-------");
		
		System.out.println("\ninstance variable");
		 
	}
	
	public static void main(String[] args) 
	{
		ClassE eobj1=new ClassE();
		eobj1.meth1();
		
	}

}
