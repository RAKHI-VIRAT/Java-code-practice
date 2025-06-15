package com.practise;

public class ClassA 

{
	protected void finalize()
	{
		System.err.println("garbage collector called");
	}
	void meth1()
	{
		System.out.println("\n meth1 called");
	}
	public static void main(String[] args)
	{
		ClassA aobj1 = new ClassA();
		ClassA aobj2 = new ClassA();
		
		System.out.println("public int hashCode() "+aobj1.hashCode());
		System.out.println("public int hashCode() "+aobj2.hashCode());
		
		
		System.out.println("public boolean equals(object obj) "+aobj1.equals(aobj2));
		System.out.println("public boolean equals(object obj) "+aobj1.equals(aobj1));
		System.out.println("public boolean equals(object obj) "+aobj1.equals(new ClassA()));
		
		System.out.println("public final Class getClass()"+aobj1.getClass());
		System.out.println("public final Class getClass()"+aobj2.getClass());
		
		System.out.println("public String toString() "+aobj1.toString());
		System.out.println("public String toString() "+aobj2.toString());
		
		aobj1.meth1();
	//	aobj2=null;
		System.gc();
	}
}
