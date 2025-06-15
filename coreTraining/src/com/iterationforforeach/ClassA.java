package com.iterationforforeach;

public class ClassA 
{
 void meth1()
 {
	 System.out.println("---meth1()---");
	 for(int i=2;i<=5;i++)
	 {
		 System.out.println("i value : "+i);
	 }
	 System.out.println("meth1() execution completed");
 }
 public static void main(String[] args) 
 {
	ClassA aobj = new ClassA();
	aobj.meth1();
	
 }
}
