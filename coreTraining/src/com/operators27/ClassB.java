package com.operators27;

public class ClassB 
{
	void meth1()
	{
		int a=1;
		int b=2;
		int c;
		int d;
		c = ++b;
		d = a++;
		c++;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	}
	public static void main(String[] args) 
	{
		ClassB bobj=new ClassB();
		bobj.meth1();
		
	}

}
