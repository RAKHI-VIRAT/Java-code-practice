package com.switchstatements;

public class ClassF 
{
	void meth1(int x, int y, char c)
	{
		char operator=c;
		switch(operator)
		{
		case '+':
			System.out.println("Addition of x+y is "+(x+y));
			break;
		case '-':
			System.out.println("subtraction of x-y is "+(x-y));
			break;
		case '*':
			System.out.println("multiplication of x*y is "+(x*y));
			break;
		case '%':
			System.out.println("Division of x%y is "+(x%y));
			break;
			default:
				System.out.println("please give correct input");
		}
		
	}
	public static void main(String[] args) 
	{
		ClassF fobj=new ClassF();
		fobj.meth1(3, 3, '+');
		
	}
	
}
