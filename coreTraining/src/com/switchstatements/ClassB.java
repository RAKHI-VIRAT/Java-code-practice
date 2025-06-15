package com.switchstatements;

public class ClassB 
{
	void meth1(int i)
	{
		System.out.println("Implementing switch case\n");
		switch(i)
		{
		case 10:
			System.out.println("case 10 executed");
			break;
		case 20:
			System.out.println("case 20 executed");
			break;
		case 30:
			System.out.println("case 30 executed");
			break;
		case 40:
			System.out.println("case 40 executed");
			break;
		case 50:
			System.out.println("case 50 executed");
			break;
		default:
			System.out.println("Invalid data");
		}
		System.out.println("\ncompiler came out from switch case");
	}
	public static void main(String[] args) 
	{
		ClassB aobj = new ClassB();
		aobj.meth1(17);
	}

}


