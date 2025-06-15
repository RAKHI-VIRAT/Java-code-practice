package com.pack3;

public class ClassU
{
	int meth1()
	{
		System.out.println("Hi");
		return new ClassU().meth2()/2;
	}
	int meth2()
	{
		System.out.println("Hello");
		return 100;
	}
	public static void main(String[] args)
	{
		System.out.println(new ClassU().meth1()+new ClassU().meth2());
		
	}

}
