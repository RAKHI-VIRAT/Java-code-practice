package com.Inheriatncehierarchial;

public class ClassC extends ClassA
{
 void method3()
 {
	 System.out.println("Calling method3 of classC");
 }
 public static void main(String[] args) 
 {
	ClassC cobj =new ClassC();
	cobj.method1();
	cobj.method3();
}
}
