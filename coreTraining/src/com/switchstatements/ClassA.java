package com.switchstatements;

public class ClassA 
{

	void meth1(int i)
	{
		System.out.println("Implementing switch case\n");
		switch(i)
		{
		case 10:
			System.out.println("case 10 executed");
		case 20:
			System.out.println("case 20 executed");
		case 30:
			System.out.println("case 30 executed");
		case 40:
			System.out.println("case 40 executed");
		case 50:
			System.out.println("case 50 executed");
		}
		System.out.println("\ncompiler came out from switch case");
	}
	public static void main(String[] args) 
	{
		ClassA aobj = new ClassA();
		aobj.meth1(10);
	}

}
