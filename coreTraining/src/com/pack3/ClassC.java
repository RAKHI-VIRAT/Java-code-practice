package com.pack3;

public class ClassC 
{
	void meth1() // main()
	{
		System.out.println("hi");
		ClassC aobj = new ClassC();  //creation an object
		aobj.meth2();
		System.out.println(10);
	}
	void meth2()  //meth1()
	{
		System.out.println("hello");
		System.out.println(20);
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		ClassC aobj = new ClassC(); //creation object
		System.out.println("Java is awesome");
		aobj.meth1();   // calling a method
		System.out.println("End");
	}

}
