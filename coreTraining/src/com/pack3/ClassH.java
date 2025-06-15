package com.pack3;

public class ClassH
{
	void meth1()
	{
		System.out.println("meth1() called");
	}
	public static void main(String[] args)
	{
		ClassH aobj1=new ClassH();       //1st way
		aobj1.meth1();
		new ClassH().meth1();           //2nd way
		
	}
}
