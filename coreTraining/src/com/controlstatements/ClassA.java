package com.controlstatements;

public class ClassA {
	void meth1(int i)
	{
		System.out.println("----meth1()-----");
		if(!(i<=10))
		{
			System.out.println("if block executed");
		}
		System.out.println("meth1() execution completed");
	}
	void meth2(int i)
	{
		System.out.println("----meth2()-----");
		if(i<=10)
			//int x=22; //c.E should not write declarative code in this line
			System.out.println("if block executed");
		System.out.println("meth2() execution completed");
	}
	void meth3(int i)
	{
		System.out.println("----meth3()-----");
		if(i<=10)
			 if(i%2==0)
				 if(i<=5)
				 System.out.println("The given number is either 2 0r 4");
			 else
				 System.out.println("The given number is either 6 or 10");		 
		System.out.println("meth3() execution completed");
	}
	void meth4(int i, int j)
	{
		System.out.println("----meth4()-----");
		if(i<=10)
		{
			System.out.println("if block executed");
			 if(j%2!=0)
				 
				 System.out.println(j+"is odd number");
			 else
				 System.out.println( j+"is even number");
		}
		else
		{
			System.out.println("else block execute");
		}
		System.out.println("meth4() execution completed");
	}
	void checkEligibility(String name, int age)
	{
		System.out.println("Checking the age for marriage");
		if(age>=29)
		{
			System.out.println(name+" you are eligible for marriage");
		}
		else
		{
			System.out.println(name+" it is recommended to wait for "+(29-age)+"years");
		}
	}
	void meth6(int i)
	{
		System.out.println("----meth6()-----");
		if(!(i<=new ClassA().meth7()-60))
		{
			System.out.println("if block executed");
			System.out.println("hi");
		}
		else
		{
			System.out.println("if else executed");
			System.out.println("hello");
		}
		System.out.println("meth6() execution completed");
	}
	int meth7()
	{
		System.out.println("meth7() called");
		return 'A';
	}
	boolean meth8(int i)
	{
		System.out.println("meth8() called");
		return i==10;
	}
	void meth9(int i)
	{
		System.out.println("----meth9()----");
		if(new ClassA().meth8(10))
		{
			System.out.println("meth8() is returning true");
			System.out.println("if block executed");
		}
			else
			{
				System.out.println("meth8() is returning false");
				System.out.println(" else executed");
				
				if(i>0)
					System.out.println(i+"is positive number");
				else if(i<0)
					System.out.println(i+"is negative number");
				else
					System.out.println(i+"is equal to 0");	
		}
	}
	/* in(if-else-if case) 
	 (in if block)compiler will goes to if block if condition is true it going to print values
	 if if-block condition is false compiler moves to else-if block not else block
	 
	 (else if block)compiler will goes to else-if block if condition is true it going to print values
	 if else-if block condition is false compiler moves to else block
	 
	(else) if both the above conditions are false only else block executes
	 */
	void meth10()
	{
		System.out.println("---meth10()----");
		if(true)
		{
			System.out.println("hi");
		}
		else
		{
			System.out.println("hello");//it is dead code
		}
		System.out.println("meth10() execution completed");
	}
	public static void main(String[] args) 
	{
		ClassA aobj = new ClassA();
		//aobj.meth1('A');
		//aobj.meth2(50);
		//aobj.meth3(8);
		//aobj.meth4(1,10);
		//aobj.checkEligibility("raki",10);
		//aobj.meth6(100);
		//aobj.meth9(-5);
		//aobj.meth10();
		
		
	}

}
