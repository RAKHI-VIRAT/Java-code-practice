package com.thisclass44;

public class ClassC 
{
	void meth1() 
	{
		System.out.println("meth1() called");
	}
	ClassC()
	{
		this(22);
		meth1();//this.meth1()
		//new ClassC().meth1();// recursion
		System.out.println("Default constructor");
		//new ClassC(22);
		//this(22);//c.e because constructor call must be first statement in method
		
	}
	ClassC(int a)
	{
		System.out.println("Parameterized constructor : "+a);
	}
	
 public static void main(String[] args) 
 {
	new ClassC();
}
}
