package com.abstractionclass59abstraction;

public class ClassB extends ClassA
{
	@Override
 public void meth1()
 {
	 System.out.println("Abstract method1 overridden");
 }
	@Override
	public void meth5()
	{
		System.out.println("Abstract meth5 overridden");
	}
	void meth2()
	{
		System.out.println("20");
	}
	//@Override//c.e because of static method
	 static void meth3()//method hiding
	 {
		 System.out.println("30");
	 }
	 public static void main(String[] args) 
	 {
	ClassA aobj =new ClassB();//2nd point
	aobj.meth1();
	aobj.meth5();
	aobj.meth2();
	aobj.meth3();
}
}

