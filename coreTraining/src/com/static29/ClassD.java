package com.static29;

public class ClassD 
{
	static int x=ClassD.meth1();
	static int meth1()
	{
		System.out.println("Static meth1() called");
		return 100;
	}
	static
	{
		System.out.println("static block called");
	}
	public static void main(String[] args)
	{
		System.out.println("main() called");
	}

}
