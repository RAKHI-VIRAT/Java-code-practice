package com.multithreading;

public class ClassA extends Thread
{
	@Override
 public void run()
 {
	 System.out.println("run called");
	 for(int i=1;i<=5;i++)
	 {
		 System.out.println("i value :"+i);
	 }
	 System.out.println("run() execution completed");
 }
 public static void main(String[] args) 
 {
	ClassA aobj=new ClassA();
	Thread t1=new Thread(aobj);
	t1.start();
}
}
