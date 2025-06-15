package com.InheritanceSuper;

public class ClassF extends ClassE
{

 ClassF()
 {
	 System.out.println("Class-F default constructor");
	 
 }
 ClassF(int x)
 {
	 this();
	 System.out.println("Class-F parameterized constructor");
 }
 public static void main(String[] args) 
 {
	new ClassF(10);
	
}
}
