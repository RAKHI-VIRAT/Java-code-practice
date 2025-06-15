package com.polymorphismruntime;

public class ClassE extends ClassD
{
	void meth1()// Overriding method
	{
	System.out.println(10);
	}
	@Override
	void meth2(int num)
	{
		System.out.println(20);
	}
	@Override
	void meth3(int i, String msg)
	{
		System.out.println("30");
	}
	//@Override// c.e because static method
	static void meth4()
	{
		System.out.println(40);
	}
	public static void main(String[] args) 
	{
		System.out.println("1st point");
		ClassD dobj = new ClassD();// 1st point
	    dobj.meth1();
	    
	    System.out.println("\n2nd point");    
	ClassD eobj = new ClassE();// 2nd-point
	eobj.meth1();
	eobj.meth2(100);
	eobj.meth3(100, "Java");
	eobj.meth4();
	
	System.out.println("\n3rd point");
	ClassE eobj1 = new ClassE();// 3rd-point
	eobj1.meth1();
	eobj1.meth2(100);
	eobj1.meth3(100, "Java");
	eobj1.meth4();
	
	
	}
	
}
