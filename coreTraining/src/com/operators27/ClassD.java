package com.operators27;

public class ClassD 
{
	int a=10;
	int meth1()
	{
		int a=10;
		a++;      
		System.out.println(a++);     
		a++;   
		System.out.println(++a);   
		System.out.println(a++);    
		System.out.println(a++);   
		a--;   
		System.out.println(--a);   
		a=a++ +3;  
		System.out.println("a vlaue===>"+a);  
		
		System.out.println(a++);    
		--a;  
		System.out.println(--a);  
		System.out.println(a--);  
		a=a-- +3;    
		System.out.println(a);  
		return a++ + ++a;  
	}
	void meth2()
	{
		int a=10;
		//System.out.println("---------");
		//System.out.println("print "+new ClassI().meth1());
		
		int x=new ClassD().meth1()+ a++;  
		System.out.println(x++ + a++);    
		System.out.println(a++);           
		System.out.println(a);      
		System.out.println(x);          
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		new ClassD().meth2();
		System.out.println("Java is awsome");
	}

}
