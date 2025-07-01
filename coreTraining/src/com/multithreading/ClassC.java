package com.multithreading;

public class ClassC implements Runnable
{
	
	@Override
public void run()

{
		String name=Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		
		System.out.println("run() called"+name);
		for(int i=1;i<=5;i++)
		{
			System.out.println("i value : "+i+" "+name+" "+priority);
		}
		System.out.println("run() execution completed"+" "+name);
}
	public static void main(String[] args) 
	{
		ClassC cobj=new ClassC();
		Thread t1=new Thread(cobj);
		t1.setPriority(9);
		
		
		t1.start();
		
		Thread t2=new Thread(cobj);
		t2.setPriority(3);
		t2.start();
		t1.setName("1st thread");
		t2.setName("2nd thread");
		
	}
}
