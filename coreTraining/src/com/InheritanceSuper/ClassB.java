package com.InheritanceSuper;

public class ClassB extends ClassA
{
	void method2()
	{
		System.out.println("ClassB-method2");
		super.method1();
	}
	ClassB()
	{
		//super();//by default in every child constructor first statement is super()
		System.out.println("classB-default constructor");
		this.method2();
		
	}
	
 public static void main(String[] args) 
 {
	ClassB bobj = new ClassB();
	//bobj.method1();
}
}
