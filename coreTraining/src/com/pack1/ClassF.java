package com.pack1;

public class ClassF 
{
	int i;
	public ClassF()
	{
		System.out.println("default construcor");
	}
	public ClassF(int i)
	{
		System.out.println("parameterized constructor");
		System.out.println(i);
		System.out.println(new ClassF().i);
		//System.out.println(new ClassF(99).i);

	}
	void meth1(char c)
	{
		System.out.println("meth1 called");
	    System.out.println(c);
	   int a =new ClassF().meth2("hi");
	   System.out.println(a);
	}
	int meth2(String s)
	{
		System.out.println(s);
		int i= new ClassF(9).meth4(4,8);
		 
		return i;
		
	}
	int meth4 (int i,int j)
	{
		System.out.println(i);
		System.out.println(j);
		return i=3;
	}
	public static void main(String[] args) 
	{
		new ClassF(3);
		new ClassF(2).meth1('1');
		
	}

}
