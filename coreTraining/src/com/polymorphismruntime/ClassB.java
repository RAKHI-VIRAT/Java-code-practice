package com.polymorphismruntime;

public class ClassB extends ClassA
{
	void meth1()
	{
		System.out.println(10);
	}
   public static void main(String[] args) 
   {
	ClassA aobj = new ClassB();
	aobj.meth1();
   }
}
