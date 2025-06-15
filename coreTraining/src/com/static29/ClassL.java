package com.static29;

public class ClassL 
{
	static int x = m1();
	public static void main(String[] args) 
	{
		System.out.println(ClassL.x);
	}
	static
	{
		System.out.println(x);
		ClassL.x = x+20;
	}
	static int m1()
	{
		ClassL.x = 50;
		return m2();
	}
	static int m2()
	{
		System.out.println(ClassL.x);
		return 100;
	}

}
