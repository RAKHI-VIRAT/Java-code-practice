package com.pack3;

public class ClassE 
{
	void meth1()
	{
		int a=10;
		System.out.println("a");
		System.out.println(a);
		System.out.println("a+a");
		System.out.println(a+a);
		System.out.println("a value:"+a);
	}
	public static void main(String[] args) 
	{
		ClassE aobj=new ClassE();
		aobj.meth1();
	}

}
