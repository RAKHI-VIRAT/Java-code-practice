package com.pack1;

public class ClassK
{
	void meth1(int x, int y, int z)
	{
		System.out.println("Addition:"+(x+y+z));
		new ClassK().meth2(4, 5);
		
	}
	void meth2(int a, int b)
	{
		System.out.println("substraction:"+(a-b));
	}
	ClassK()
	{
		int a=1;
		int b=2;
		System.out.println("division:"+(a/b));
	}
	
	ClassK(int i)
	{
		int a=2;
		System.out.println("Multiplication: "+(a*i));
	
	}
	public static void main(String[] args) 
	{
	 new ClassK(2).meth1(1, 2, 3);
	}

}
