package com.pack3;

public class ClassW 
{
	int meth1()
	{
		System.out.println("hi");
		return 100;
	}
	void meth2(String s,int i)
	{
	   System.out.println("hello");
	   System.out.println(s);
	   System.out.println(i);
	}
	public static void main(String[] args) 
	{
	ClassW aobj=new ClassW();
	aobj.meth2("Java", aobj.meth1());
	}
}
