package com.Inheritancehybrid;

public class ClassB extends ClassA
{
 void method2()
 {
	 System.out.println("Calling method2 of classB");
 }
 public static void main(String[] args) 
 {
	ClassB bobj=new ClassB();
	bobj.method1();
}
}
