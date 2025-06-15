package com.iterationforforeach;

public class ClassB 
{
	void meth2()
	{
		System.out.println("----meth2()---");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=0;j--)
			{
				System.out.println("i : "+i+" j :"+j);
			}
			System.out.println("--------");
		}
		System.out.println("meth2() execution completed");
	}
	public static void main(String[] args) 
	{
		new ClassB().meth2();
	}

}
