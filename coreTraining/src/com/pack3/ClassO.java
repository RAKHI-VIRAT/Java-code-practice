package com.pack3;

public class ClassO 
{
	int meth1()   //main()
	{
		System.out.println("Hi");
		return 50;
	}
	public static void main(String[] args) 
	{
		int x=100;
		System.out.println("Java is awesome");
		ClassO aobj=new ClassO();   //creating object
		int y=aobj.meth1();         //Calling a method
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		System.out.println(x/y);
	}

}
