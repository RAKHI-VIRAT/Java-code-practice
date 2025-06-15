package com.abstractioninterface60;

public class ClassA extends ClassB implements InterfaceA,InterfaceB
{
 @Override
 // void meth1()// c.e because access modifier by default public abstract in parent class
public void meth1()
{
	 System.out.println("interfaceA meth1() overridden");
}
 @Override
 public int greeting(String data)
 {
	 System.out.println("data : "+data);
	 return 100;
 }
 @Override
 public void display()
 {
	 System.out.println("InterfaceB display() overridden");
 }
 public static void main(String[] args)
 {
	InterfaceA aobj = new ClassA();
	aobj.meth1();
	System.out.println("===> "+aobj.greeting("Java is awesome"));
	aobj.meth2();
	//aobj.meth4();//c.e because private access modifier
	
	
	InterfaceB bobj = new ClassA();
	bobj.display();
	new ClassA().show();
	
}
}
