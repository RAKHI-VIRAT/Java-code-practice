package com.multithreading;

public class ClassB implements Runnable
{
	@Override
public void run()
{
	System.out.println("run method called");
	for(int i=1;i<=5;i++)
	{
		System.out.println("i value is : "+i);
	}
	System.out.println("run() execution completed");
}
	public static void main(String[] args) 
	{
		ClassB bobj=new ClassB();
		Thread t=new Thread(bobj);
		t.start();
		Runnable r=new ClassB();
		r.run();
	}
}
