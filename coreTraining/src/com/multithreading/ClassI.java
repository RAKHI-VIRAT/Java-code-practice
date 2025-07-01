package com.multithreading;

public class ClassI extends Thread
{
	@Override
	public void run()
	{
		System.out.println("I am ready for Interviews\n");
		for(int x=0;x<=3;x++)
		{
			System.out.println("This is my "+x+" "+"interview");
		}
		System.out.println("I got place Now I can relax");
		try
		{
			Thread.sleep(50000);
		}
		catch(Exception e)
		{
			System.out.println("My sleep got distrubed");
		}
		System.out.println("\nTime to go to office");
	}
	public static void main(String[] args) 
	{
		ClassI iobj=new ClassI();
		Thread t1=new Thread(iobj);
		t1.start();
		t1.interrupt();
	}
}