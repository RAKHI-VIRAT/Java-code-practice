package com.pack3;

public class ClassF 
{
	void meth1()
	{
		ClassF aobj=new ClassF();
		System.out.println("hi");
		int x=100;
		aobj.meth2();
		System.out.println(x/2);
	}
	void meth2()
	{
		System.out.println("hello");
	}
	public static void main(String[] args)
	{
		ClassF aobj=new ClassF();
		aobj.meth1();
	}

}
