package com.pack3;

public class ClassJ 
{
	public void meth1()
	{
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println("addition a+b="+c);
	}
	void meth2()
	{
		int a=10;
		int b=10;
		int c=a-b;
		System.out.println("substraction a-b="+c);
	}
	public static void main(String[] args)
	{
		ClassJ aobj=new ClassJ();
		aobj.meth1();
		aobj.meth2();
		int a=10;
		int b=10;
		int c=a*b;
		System.out.println("multiplication a*b="+c);
		
	}

}
