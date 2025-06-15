package com.pack3;

public class ClassA
{
	public void meth1()
	{
		System.out.println("I am from meth1()");
	    System.out.println("Hello");
	    System.out.println(100);
	}
    public void meth2()
    {
    	System.out.println("I am from meth2");
    	System.out.println("Hi");
    	System.out.println(200);
    }
    public static void main(String[] args) 
    {
		System.out.println("start");
		System.out.println("Java is awsome !!");
		System.out.println("-------------");
		ClassA aobj=new ClassA();
		System.out.println("-------");
		aobj.meth1();
		System.out.println("-------");
		aobj.meth2();
		System.out.println("------");
		System.out.println("End");
		
	}
    
}
