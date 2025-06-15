package com.static29;

public class ClassE 
{
	static int meth1()
	{
		System.out.println("static meth1() called");
		return 100;
	}
	static
	{
		System.out.println("static block called");
	}
	static int x=ClassE.meth1();
	public static void main(String[] args)
	{
		System.out.println("main() called");
	}
}
