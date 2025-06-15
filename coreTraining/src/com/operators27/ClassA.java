package com.operators27;

public class ClassA 
{
	void meth1()
	{
		System.out.println("Implementing Increment & Decrement Operators\n");
		
		int i=10;
		System.out.println(i);
		i++;
		System.out.println(i);
		i--;
		System.out.println(i+"\n");
		
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		
		System.out.println("-----------");
		
		System.out.println(i--);
		System.out.println(i);
		System.out.println(--i);
		System.out.println(i);
	}
	void meth2()
	{
		System.out.println("meth2() called");
		int x=100;
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		++x;
		System.out.println(x--);
		System.out.println(--x);
		x--;
		System.out.println(x++);
		System.out.println(++x);
		--x;
		System.out.println(x--);
		x++;
		System.out.println(x--);
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		ClassA aobj=new ClassA();
		//aobj.meth1();
		aobj.meth2();
	}
}
