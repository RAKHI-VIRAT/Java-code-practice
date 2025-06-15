package com.pack3;

public class ClassL
{
	void meth1(int i)
	{
		System.out.println(i+i);
		System.out.println('i');
	}
	void meth2(int i,String s,char c)
	{
		System.out.println(i);
		System.out.println(s);
		new ClassL().meth1(50);
		System.out.println('c');
		System.out.println(c);
	}
	public static void main(String[] args)
	{
	System.out.println("start");
	new ClassL().meth2(20,"Java",'x');
	}
		
}

	