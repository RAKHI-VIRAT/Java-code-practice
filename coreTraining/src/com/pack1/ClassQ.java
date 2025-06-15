package com.pack1;

public class ClassQ 
{
	int x;
	static int y;
	
	void meth1()
	{
		System.out.println(x);
		System.out.println(new ClassQ().x);
		x++;
		System.out.println(x);
		
		System.out.println(ClassQ.y);
		System.out.println(y);
		System.out.println(new ClassQ().y);
		System.out.println("------");
	}
	public static void main(String[] args) 
	{
		new ClassQ().meth1();
		
	}

}
