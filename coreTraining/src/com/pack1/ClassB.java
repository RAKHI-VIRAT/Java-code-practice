package com.pack1;

public class ClassB 
{
	void meth1()
	{
		System.out.println("Object class methods");
    }
	protected void finalize()
	{
	 System.out.println("garbage collector called");
	
	}
	public static void main(String[] args) 
	{
		ClassB bobj1 =new ClassB();
		bobj1.meth1();
		
		System.out.println("\npublic int hashCode()");
		System.out.println("The unique identification nubmer of bobj1: "+bobj1.hashCode());
		
		System.out.println("\npublic boolean Equal(aobj)");
		System.out.println("The difference between location adresses: "+bobj1. equals(bobj1));
		
		System.out.println("\npublis finalClass getClass()");
		System.out.println("fully qualified class name of bobj1: "+bobj1.getClass());
		
		System.out.println("\npublic String toString()");
		System.out.println("The unique identification nubmer of bobj1: "+bobj1.toString());
		
		System.out.println("\nprotected void finalize()");
		//bobj2=null;
		//bobj1=null;
		System.gc();
		
	}
	
	}
