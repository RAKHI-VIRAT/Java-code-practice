package com.InheritanceSuper;

public class ClassC 
{
 void meth1()
 {
	 System.out.println("Class-c method1");
 }
 ClassC()
 {
	 System.out.println("Class-c default constructor");
 }
 ClassC(int x)//10
 {
	 this();
	 this.meth1();
	 System.out.println("Class-c parametrized constructor");
 }
}
