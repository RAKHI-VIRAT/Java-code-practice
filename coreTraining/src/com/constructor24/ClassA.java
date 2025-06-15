package com.constructor24;

public class ClassA 
{
 void meth1()
 {
	 System.out.println("meth1() called");
 }
 ClassA()
 {
	System.out.println("Non-perameterized Constructor called"); 
	System.out.println("hi");
	new ClassA(100);
	new ClassA(100).meth1();
	
 }
 ClassA(int x)
 {
	 System.out.println("Parameterized Constructor called");
	 System.out.println("x : "+x);
	 System.out.println("Hello");
 }
 public static void main(String[] args) 
 {
	new ClassA().meth1();
}
}
