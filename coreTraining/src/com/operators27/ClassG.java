package com.operators27;

public class ClassG 
{
	void meth1(int x, int y, int z)
	{
		System.out.println("Addition x+y+z= "+(x+y+z));
		new ClassG().meth2(2, 3);
		
	}
	void meth2(int a, int b)
	{
		System.out.println("Substraction a-b= "+(a-b));
	}
	ClassG()
	{
		int r=10;
		int s=2;
		System.out.println("Division 10/2= "+(r/s));
	}
	ClassG(int a, int b)
	{
		System.out.println("Multiplication a*b= "+(a*b));
	}
	public static void main(String[] args) 
	{
		new ClassG(2,3).meth1(1,1,1);
	}

}
