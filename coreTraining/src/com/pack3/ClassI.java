package com.pack3;

public class ClassI 
{
	void meth2()
	{
		System.out.println("meth2() called");
	}
	void meth3()
	{
		System.out.println("meth3() called");
	}
	public static void main(String[] args)
	{
	ClassI bobj1=new ClassI();
	bobj1.meth2();
	bobj1.meth3();
	System.out.println("--------");
	new ClassI().meth2();
	new ClassI().meth3();
	}

}
