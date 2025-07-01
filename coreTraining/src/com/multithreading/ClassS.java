package com.multithreading;

public class ClassS extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) 
	{
		ClassS sobj=new ClassS();
		ThreadGroup tg=new ThreadGroup("Parent ThreadGroup");
		//tg.setMaxPriority(10);
		
		//Thread t1=new Thread(sobj);
		//t1.setName("First");
		Thread t1=new Thread(tg,sobj,"First");
		t1.start();
		
		Thread t2=new Thread(tg,sobj,"Second");
		t2.start();
		
		Thread t3=new Thread(tg,sobj,"Third");
		t3.start();
		
		System.out.println("Active Threads : "+tg.activeCount());
		System.out.println("Thread Group Name: "+tg.getName());
	}

}
