package com.Inheritancehybrid;

public class ClassD extends ClassA
{
	void method4()
	{
		System.out.println("Calling method4 of ClassD");
	}
public static void main(String[] args) 
{
	ClassD dobj=new ClassD();
	dobj.method1();
}
}
