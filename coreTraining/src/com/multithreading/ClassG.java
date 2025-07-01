package com.multithreading;

public class ClassG 
{
	public static void main(String[] args) throws Exception 
	{
		ClassF fobj = new ClassF();
		fobj.start();
		fobj.join();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("ClassB main() : "+i);
		}
	}

}
