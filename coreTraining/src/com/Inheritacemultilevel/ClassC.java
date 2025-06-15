package com.Inheritacemultilevel;

public class ClassC extends ClassB
{
	void method3()
	{
		System.out.println("Calling method3 if ClassC");
	}
	public static void main(String[] args) 
	{
	ClassC cobj = new ClassC();
	cobj.method1();
	cobj.method2();
	cobj.method3();
	}
}
