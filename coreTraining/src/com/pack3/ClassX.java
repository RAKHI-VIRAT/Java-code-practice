package com.pack3;

public class ClassX 
{
	int meth1()
	{
		System.out.println("meth1() called");
		return 100;
	}
	int meth2(int x)
	{
		System.out.println("meth2() called");
		return x+10;
	}
	int meth3(int a,int b)
	{
		System.out.println("Java is awesome");
		System.out.println("===>"+(a+b));
		return 50;
	}
	public static void main(String[] args) 
	{
		System.out.println(new ClassX().meth3(new ClassX().meth1()/2, new ClassX().meth2(new ClassX().meth1())));
		
	}

}
