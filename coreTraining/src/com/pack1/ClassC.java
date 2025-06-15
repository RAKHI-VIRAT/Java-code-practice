package com.pack1;

public class ClassC 
{
	void meth1()
	{
		int x;
		int y=222;
		x=1;
		System.out.println(x);
		
		}
	public static void main(String [] args)
	{
		new ClassC().meth1();
		new ClassB().meth1();		
	}
}
