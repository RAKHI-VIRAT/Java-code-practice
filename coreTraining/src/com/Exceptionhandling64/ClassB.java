package com.Exceptionhandling64;

public class ClassB 
{
 void meth()
 {
	 System.out.println(10);
	 System.out.println(20);
	 System.out.println(20/0);
	 System.out.println(40);
	 System.out.println(50);
 }
 public static void main(String[] args) 
 {
	ClassB bobj=new ClassB();
	bobj.meth();
}
}
