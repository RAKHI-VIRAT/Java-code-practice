package com.thisclass44;

public class ClassB 
{
 ClassB meth1()
 {
	 System.out.println("meth1() called");
	 return new ClassB();
 }
 ClassB meth2()
 {
	 System.out.println("meth2() called");
	// return new ClassB();
	 return this;
 }
 ClassB meth3()
 {
	 System.out.println("meth2() called");
	 return this;
 }
 void meth4()
 {
	 System.out.println("meth2() called");
	 
 }
 public static void main(String[] args) 
 {
	new ClassB().meth1().meth2().meth3();// Method chaining
}
}
