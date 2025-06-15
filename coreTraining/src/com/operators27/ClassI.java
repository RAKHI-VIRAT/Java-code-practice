package com.operators27;

public class ClassI 
{
	void meth1()
	{
		System.out.println("meth1() called");
		int x = 7, y = 3;
		boolean isEqual = x ==y;
		boolean isGreaterThan = x > y;
		boolean isLessThan = x < y;
		boolean isNotEqual = x != y;
		
		System.out.println("Is Equal: " + isEqual);
		System.out.println("Is Greater Than: " + isGreaterThan);
		System.out.println("Is Less Than: " + isLessThan);
		System.out.println("Is Not Equal: " + isNotEqual );
	}
	void meth2()
	{
		System.out.println("meth2() called");
		boolean p = true, q= false;
		boolean logicalAnd = p && q;
		boolean logicalOr = p || q;
		boolean logicalNotP = !p;
		boolean logicalNotQ = !q;
		
		System.out.println("Logical AND: " + logicalAnd);
		System.out.println("Logical OR: " + logicalOr);
		System.out.println("Logical NOT of P: " + logicalNotP);
		System.out.println("Logical NOT of q: " + logicalNotQ);
	}
	void meth3()
	{
		System.out.println("meth3() called");
		int a = 10;
		int b = 5;
		
		//Assignment Operators
		int equalAssignment = a;
		int additionAssignment = a += b; // Equivalent to: a = a + b; //10+5=15=a
		int subtractionAssignment = a -=b; //Equivalent to: a = a - b; //15-5=10=a
		int multiplicationAssignment = a *= b; // Equivalent to: a = a * b; //10*5=50=a
		//System.out.println(a);
		int divisionAssignment = a /= b; //Equivalent to: a = a / b;  //50/5=10=a
		
		System.out.println("Equal Assignment: " + equalAssignment);
		System.out.println("Addition Assignment: " + additionAssignment);
		System.out.println("Substraction Assignment: " + subtractionAssignment);
		System.out.println("Multiplication Assignment: " + multiplicationAssignment);
		System.out.println("Division Assignment: " + divisionAssignment);
	}
	void meth4()
	{
		System.out.println("meth4() called");
		
		boolean a = true, b = false, c = true, d = false;
		
		boolean flag1 = (a && b) && (c || d);
		boolean flag2 = (a || b) && (c || d);
		boolean flag3 = !(a && b) || (c && d);
		
		boolean flag4 = a && (b || (c && d));
		boolean flag5 = (a && b) || (c && d);
		
		System.out.println("flag1: " + flag1);
		System.out.println("flag2: " + flag2);
		System.out.println("flag3: " + flag3);
		System.out.println("flag4: " + flag4);
		System.out.println("flag5: " + flag5);
	}
	public static void main(String[] args)
	{
		ClassI nobj = new ClassI();
		nobj.meth1();
		System.out.println("---------");
		nobj.meth2();
		System.out.println("----------");
		nobj.meth3();
		System.out.println("----------");
		nobj.meth4();
		System.out.println("--------");
	}

}
