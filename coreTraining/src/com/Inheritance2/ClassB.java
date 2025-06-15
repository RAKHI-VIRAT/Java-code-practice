package com.Inheritance2;

public class ClassB extends ClassA
{
	void display()
	{
		System.out.println("hi");
		super.meth4();
	}
	static int show(int a)//50
	{
		System.out.println(a+a);
		return a+a++;
	}
    ClassB()
    {
    	this(show(50));//100
    	for(int i=1;;i++)
    	{
    		super.meth4();
    		break;
    	}
    	System.out.println("hi");
    	System.out.println(show(50));
    }
    ClassB(int a)//100 not this() then by default super()
    {
    	System.out.println("===>"+(a+++show(50)));
    }
    public static void main(String[] args) 
    {
		new ClassB().display();
	}
}
