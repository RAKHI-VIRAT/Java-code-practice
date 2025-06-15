package com.pack2;

public class ClassA
{
	int meth1(int a, String S)
	{
	System.out.println(a);
	System.out.println(S);
	new ClassA().meth2(10, 5);
	return 5;
	}
	int meth2(int b, int c)
	{
		System.out.println(b);
		return new ClassA().meth3("HI", new ClassA().meth4(4,"hi"));
	}
	int meth3(String a, int b)
	{
		System.out.println(a);
		System.out.println(b);
		return b;
	}
	int meth4(int x, String a)
	{
		System.out.println(x);
		System.out.println(a);
		return x;
	}
	public static void main(String[] args)
	{
	System.out.println(new ClassA().meth1(5, "hi"));
    }	
}
