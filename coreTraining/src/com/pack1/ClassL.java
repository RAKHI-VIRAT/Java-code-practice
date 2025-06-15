package com.pack1;

public class ClassL 
{
	void meth1(int a)
	{
		if(a>=18 && a<=36) 
		{
			System.out.println("you are eligible for exam");
		}
		else
		{
			System.out.println("you are not eligible for exam");
		}
		
	}
	public static void main(String[] args) 
	{
		new ClassL().meth1(3);
	}

}
