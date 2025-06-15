package com.class20;

public class ClassA 
{
	void meth1()
	{
		System.out.println("meth1() called");
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		return;
	}
	int meth2()
	{
		System.out.println("\nmeth2() called");
		return 100;
		//System.out.println("java is awesome!!");//c.E unrechable code
	}
	int meth3(int i)
	{
		System.out.println("\nmeth3() called");
		System.out.println("i value : "+i);
		System.out.println("int & char both are compatable datatypes");
		return 'A';
	}
	String meth4(int i)
	{
		System.out.println("\nmeth4() called");
		if(i<=5)
		{
			System.out.println("if block executed");
			return "Java";
		}
		else
		{
			System.out.println("else block executed");
			return "Java is awesome";
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		ClassA aobj=new ClassA();
		aobj.meth1();
		System.out.println("meth2() is returning :"+aobj.meth2());
		System.out.println("meth3() is returning :"+aobj.meth3('a'));
		System.out.println("meth4() is returning :"+aobj.meth4(1));
		System.out.println("\nEnd");
	} 

}
