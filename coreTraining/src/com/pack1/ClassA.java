package com.pack1;

public class ClassA 
{
	 protected void finalize()
	 {
	 System.out.println("\n proteced void finalize");
	 
	 System.out.println("-----------");
	 }
	 void meth1()
	 {
		 System.out.println("HI");
	 }
	public static void main(String[] args) 
	{
		ClassA aobj1=new ClassA();
		ClassA aobj2=new ClassA();
		 
		 
		 System.out.println("public int hashCode()");
		 System.out.println("hashcode value of aobj1 : "+aobj1.hashCode());
		 System.out.println("hashcode value aobj2 : "+aobj2.hashCode());
		 System.out.println("-------------");
		 
		 System.out.println("public boolean equals()");
		 System.out.println( aobj1.equals(aobj1));
		 System.out.println(aobj2.equals(aobj2));
		 System.out.println(aobj1.equals(new ClassA()));
		 System.out.println(new ClassA().equals(new ClassA()));
		 System.out.println("-------------");
		 
		 System.out.println("\npublic final class getclass");
		 System.out.println("aob1 get class: "+aobj1.getClass());
		 System.out.println("aob2 get class: "+aobj2.getClass());
		 System.out.println("-----------");
		 
		 System.out.println("\npublic String toString");
		 System.out.println("aob1 get class: "+aobj1.toString());
		 System.out.println("aob2 get class: "+aobj2.toString());
		 System.out.println("-----------");
		 
		 //aobj2=null;
		 System.gc();
		 aobj1.meth1();
		  
	}
		 
		 
		 
		 
	}
