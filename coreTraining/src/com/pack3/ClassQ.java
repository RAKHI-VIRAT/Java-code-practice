package com.pack3;

public class ClassQ 
{
	int meth1(String s)
	{
		System.out.println("hi");
		return 100;
	}
	int meth2(char c)
	{
		System.out.println("Hello");
		return 50;
	}
	public static void main(String[] args) 
	{
		ClassQ aobj=new ClassQ();
		System.out.println((aobj.meth1("Java")+aobj.meth2('A'))/2);
		
	}

}
