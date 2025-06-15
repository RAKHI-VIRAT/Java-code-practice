package com.InheritanceSuper;

public class ClassD extends ClassC
{
 void meth2()
 {
	 System.out.println("Class-D method2");
	 super.meth1();
	 new ClassD();
 }
 ClassD()
 {
	 System.out.println("class-D default constructor");
 }
 ClassD(int x)//5
 {
	 super(10);
	 this.meth2();
	 System.out.println("Class-D parameterized constructor");
 }
 public static void main(String[] args) 
 {
	ClassD dobj =new ClassD(5);
	dobj.meth2();
}
}
