package com.pack1;

public class ClassJ 
{
	void meth1()
	{
		int x=1;
		System.out.println(x);
	     x=x++; //post increment no change in x value
		System.out.println(x);
		int y=x++;
		System.out.println(y);
		System.out.println(x);
		
		x= x++ +3; //x=3 //
		System.out.println(x); //x=5
		x= x++ +x+3; //5+6+3 //x=6
		System.out.println(x);
		x= x--; //post decrement no change in x value
		System.out.println(x);
		x= ++x;
		System.out.println(x);
		x= x--; //post decrement
		System.out.println(x);
		x= --x;
		System.out.println(x);
				
		
	}
	public static void main(String[] args)
	{
		new ClassJ().meth1();
		
		
	}

}
