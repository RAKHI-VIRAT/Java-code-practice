package com.Inheritancehybrid;

public class ClassC extends ClassB
{
	void method3()
	{
		System.out.println("Calling method3 of Classc");
	}
public static void main(String[] args) 
{
	ClassC cobj =new ClassC();
	cobj.method2();
	cobj.method1();
}
}
