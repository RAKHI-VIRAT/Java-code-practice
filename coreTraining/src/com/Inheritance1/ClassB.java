package com.Inheritance1;

public class ClassB extends ClassA //single inheritance
{
	void meth2()
	{
		System.out.println("Class B method");
	
	}
	public static void main(String[] args)
	{
		ClassA aobj=new ClassA();//1st point ==> Has-A-Relation
		aobj.meth1();
		//aobj.meth2();//c.e
		
		ClassA aobj2=new ClassB(); //2nd point
		aobj2.meth1();
		//aobj2.meth2(); //C.E
		
		ClassB bobj = new ClassB();//IS-A_relation(Inheritance)
		bobj.meth1();
		bobj.meth2();
		
		//ClassB bobj2 = new ClassA();// 4th point ===>Invalid C.E
		
	}
	
	//ClassA ====> parent Class
	// ClassB ====> Child Class
}
