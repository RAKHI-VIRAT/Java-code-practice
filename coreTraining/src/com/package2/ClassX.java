package com.package2;

import com.package1.ClassA;
//import com.package1.ClassB;
public class ClassX 
{
	 
		public static void main(String[] args) 
		{
			ClassA aobj=new ClassA();
			aobj.meth1();
			
			com.package1.ClassB bobj=new com.package1.ClassB();//3rd way to import package
			bobj.meth2();
		}
	
}
