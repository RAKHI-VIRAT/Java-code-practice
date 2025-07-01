package com.multithreading;//

public class ClassK 
{
	public static void main(String[] args) //throws Exception
	{
		ClassJ jobj=new ClassJ();
		jobj.start();
		
		//jobj.join();
		Thread.yield();
		for(int i=1;i<=5;i++)
		{
			System.out.println("ClassK main() : "+i);
		}
	}

}
