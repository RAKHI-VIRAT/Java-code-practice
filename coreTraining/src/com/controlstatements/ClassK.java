package com.controlstatements;

public class ClassK {  //class-36
	void meth1(int n)
	{
		if(n%2==0)
		
		if((n >= 2)&& (n<=5))
		System.out.println("not weird");
		else if((n >= 6)&& (n<=20))
			System.out.println("weird");
		
		
		else if(n>20)
			System.out.println("not weired");
		
		else 
			System.out.println("weired");	
		 
		
		
	}
	public static void main(String[] args) {
		ClassK kobj=new ClassK();
		kobj.meth1(20);
	}
}


