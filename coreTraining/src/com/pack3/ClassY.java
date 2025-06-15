package com.pack3;

public class ClassY 
{
	int meth1(int a,int b)   //a=200, b=199
	{
		System.out.println(a);
		System.out.println(a-b);
		return new ClassY().meth4(a-1,"Hi");
	}
	String meth2(int x)
	{
		System.out.println(x-new ClassY().meth1(200, 199));
		System.out.println(x);
		return "Java";
	}
	String meth3(int a,int b,String s)
	{
		System.out.println(a);
		System.out.println(a+a);
		System.out.println(a+b);
		return s;
	}
	int meth4(int a,String s)
	{
		System.out.println(a);
		System.out.println(s);
		return a+a;
	}
	String meth5(String s)
	{
		return s;
	}
	public static void main(String[] args) 
	{
		System.out.println(new ClassY().meth5(new ClassY().meth3(15,25,new ClassY().meth2(500))));
		
	}

}
