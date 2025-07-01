package com.multithreading;

public class ClassN extends Thread
{
 @Override
 public void run()
 {
	 meth1();//this.meth1(); internally
 }
 synchronized void meth1()//method
 {
	 String name = Thread.currentThread().getName();
	 System.out.println(name+" has entered run()");
	 for(int i=1;i<=3;i++)
	 {
		 System.out.println(name+" : "+i);
	 }
	 System.out.println(name+" Completed executing run()");
 }
 public static void main(String[] args) 
 {
	ClassN nobj=new ClassN();
	
	Thread t1= new Thread(nobj);
	Thread t2= new Thread(nobj);
	
	t1.setName("Tom-Thread");
	t2.setName("Jerry-Thread");
	
	t1.start();
	t2.start();
}
}
