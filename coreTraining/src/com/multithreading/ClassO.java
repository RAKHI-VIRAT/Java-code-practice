package com.multithreading;//inner classes

public class ClassO 
{
	void meth1()
	{
		System.out.println("meth1() called");
	}
	public static void main(String[] args) 
	{
		ClassO obj = new ClassO()//Anononmyous InnerClass
		{
			@Override
			void meth1()
			{
				System.out.println("Java is awesome");
				super.meth1();
			}
		}
		;
		obj.meth1();
	}
  
}

