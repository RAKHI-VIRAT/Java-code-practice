package com.pack4;

public class ClassA {
	int i; // instance no-static

	static int x; //static variable
	final static int h;
	int s=20;
	void method() { //non-static method
		int s='a';//local variable
		System.out.println("instance variable " +i);
		i++;
		System.out.println("instance variable " +i);
		System.out.println("instance variable " +i);
		System.out.println("instance variable " +new ClassA(111).i);
		
		
		
		System.out.println("--------");
		x++;
		System.out.println("static variable " +x);
		System.out.println("static variable " +new ClassA(1).x);
		System.out.println("static variable " +ClassA.x);
		
		System.out.println("locsal var "+s);
		
	}
	static void method1() { //static method
		int s=12; ///local variable
		System.out.println("static method called");
		//System.out.println("instance variable " +i); //c.e
		System.out.println("instance variable " +new ClassA(1).i);
		
		
		System.out.println("--------");
		System.out.println("static variable " +x);
		System.out.println("static variable " +new ClassA(1).x);
		System.out.println("static variable " +ClassA.x);
		
		System.out.println("locsal var "+s);
	}
	static //static block
	{
		System.out.println(ClassA.x);
		 x=1;
		 h=2;
	}
	public static void main(String[] args) {
		ClassA aobj=new ClassA(1);
		//aobj.method();
		//aobj.method1(); //object
		//new ClassA().method1(); //object
		//method1(); //Id name
		//ClassA.method1(); //class name****
		
	}
	static //static block
	{
		System.out.println(new ClassA().i);
		x=3;
		System.out.println(x);
	}
	ClassA()
	{
		System.out.println(new ClassA().i);
		System.out.println(i);
	}
	public ClassA(int i) 
	{
		return;
	}
	ClassA(String c, int d)
	{
		
	}

}
