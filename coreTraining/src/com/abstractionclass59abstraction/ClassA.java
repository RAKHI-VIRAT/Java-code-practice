package com.abstractionclass59abstraction;

public abstract  class ClassA //ABSTRACT CLASS
{
 public abstract void meth1();
 abstract  void meth5();
 
 void meth2()
 {
	 System.out.println("Abstract classA meth2");
 }
 public ClassA() 
 {
	System.out.println("Abstract ClassA construcor"); 
 }
  static void meth3()
 {
	  System.out.println("Abstract ClassA meth3");

 }
 public static void main(String[] args) 
 {
	 //new ClassA();//c.e because abstract class does not have object
	 System.out.println("main method");
	 
	meth3();
}
 
}
