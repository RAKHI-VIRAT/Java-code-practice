package com.package1;

public class ClassB 
{
 public void meth2()
 {
	 System.out.println("meth2() called");
 }
 public static void main(String[] args) 
 {
	ClassA aobj=new ClassA();
	aobj.meth1();
}
}
