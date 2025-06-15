package com.thisclass44;

public class ClassA 
{
 int x=10;
 static int y=20;
 void meth1()
 {
	 System.out.println("meth1() called");
	 int x=111;
	 System.out.println("local variable : "+x);
	 
	 System.out.println("Instance variable : "+new ClassA().x);
	 System.out.println("Instance variable : "+this.x);
	 
	 System.out.println("Static variable : "+ClassA.y);
	 meth2();// the internal implementation will be this.meth2()
 }
 void meth2()
 {
	 System.out.println("meth2() called");
	 this.meth3();//because best way to call static method is by class name
 }
 static void meth3()
 
 {
	 System.out.println("meth3() called");
 }

 public static void main(String[] args) 
 {
	ClassA aobj= new ClassA();
	aobj.meth1();
	//this.meth1();//c.e because we can not use in static area but we can call static method
	
}
}
