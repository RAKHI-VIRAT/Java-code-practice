package com.class22;

public class ClassD 
{
	int i;
	byte b;
	long l;
	short s;
	
	
	float f;
	double d;
	
	char c;
	boolean flag;
	void meth1()
	{
		System.out.println("the default value of integer: "+ i);
		System.out.println("the default value of byte : "+ b);
		System.out.println("the default value of long : "+ l);
		System.out.println("the default value of short : "+ s);
		
		System.out.println("the default value of float: "+f);
		System.out.println("the default value of double: "+d);
		
		System.out.println("the default value of character: "+ c);
		System.out.println("the default vaule of boolean :"+ flag);
	}
	void method()
	{
		int a=10;
		int b=21;
		System.out.println(a+b);
		
		
		byte e=12;
		byte h=1;
		byte b1=(byte)(e+h);
		System.out.println(b1);
		
		float f1= 10.00F;
		System.out.println(f1);
		
		Long d1=2333332343434L;
		System.out.println(d1);
		
			
	}
	
	public static void main(String[] args) 
	{
		new ClassD().meth1();
		new ClassD().method();
	}


}
