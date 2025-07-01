package com.multithreading;

public class ClassD extends Thread
{
	public void run() 
	{ 
		String nam=Thread.currentThread().getName();
		System.out.println("run() called");
		for(int i=1;i<=5;i++)
		{
			System.out.println("the i value is"+i+" "+nam);
		}
		System.out.println("run() execution completed");
	}
 public static void main(String[] args) throws Exception 
 {
	ClassD dobj=new ClassD();
	Thread t1=new Thread(dobj);
	Thread t2=new Thread(dobj);
	t2.join();
	t1.start();
	
	t2.start();
	
}
}
