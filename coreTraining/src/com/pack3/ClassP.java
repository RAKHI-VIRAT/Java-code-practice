package com.pack3;

public class ClassP 
{
	int meth1()
	{
	System.out.println("Hi");
	return 100;
	}
	void meth2()
	{
	System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		ClassP aobj=new ClassP();
		System.out.println("aobj.meth1()");
		aobj.meth1();
		System.out.println("-------");
		System.out.println(aobj.meth1());
		//System.out.println(aobj.meth2());  C.E because void meth2
		
	}

}
