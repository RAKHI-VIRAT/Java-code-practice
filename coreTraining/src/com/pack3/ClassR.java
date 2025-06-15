package com.pack3;

public class ClassR 
{
	int meth1(int i)
	{
		System.out.println("hi");
		return i-1;
	}
	String meth2(int i, String s)
	{
		System.out.println("hello");
		return s;
	}
	public static void main(String[] args) 
	{
		ClassR aobj=new ClassR();
		int result1=aobj.meth1(100);
		String result2=aobj.meth2(10,"Java");
		System.out.println("result1 :"+result1);
		System.out.println("result2 :"+result2);
		
	}

}
