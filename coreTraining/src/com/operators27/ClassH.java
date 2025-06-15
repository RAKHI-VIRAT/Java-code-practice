package com.operators27;

public class ClassH 
{
	void meth1(int i)
	{
		System.out.println("meth1() called");
		if(i>=10)
		{
			System.out.println("if block executed");
		}
		else
		{
			System.out.println("else block executed");
		}
	}
	void checkEligibility(String name, int age)
	{
		System.out.println("Checking the eligibility for vote");
		if(age>=18)
		{
			System.out.println(name+" you are eligible for vote");
		}
		else
		{
			System.out.println(name+" you are eligible for vote after "+(18-age)+" years");
		}
	}
	void checkExamEligibility(String name, int age)
	{
		System.out.println("Checking the eligibility for Hallticket");
		if(!(age>=21|| age<=35))
		{
			System.out.println(name+" you can download hallticket");
		}
		else
		{
			System.out.println(name+" you are not eligible for exam");
		}
	}
	void meth2(int i)
	{
		System.out.println("meth2() called");
		if(!(i<=10 && !(i>=5)))
		{
			System.out.println("Hi");
		}
		else
		{
			System.out.println("Hello");
		}
	}
	public static void main(String []args)
	{
		ClassH hobj = new ClassH();
		//hobj.meth1(5);
		//hobj.checkEligibility("Raki",17);
		//hobj.checkExamEligibility("Alex",2);
		hobj.meth2(2);
	}
	

}
