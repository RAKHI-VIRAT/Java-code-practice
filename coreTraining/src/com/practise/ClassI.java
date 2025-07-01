package com.practise;

public class ClassI implements Runnable
{
	@Override
 public void  run()
 {
		String Name=Thread.currentThread().getName();
	int pro	=Thread.currentThread().getPriority();
	for(int i=0;i<=5;i++) 
	{
		System.out.println("i value is :"+i +" "+Name+" "+pro);
	}
	System.out.println("Thread execution completed");
 }
	public static void main(String[] args)throws Exception
	{
		ClassI iobj=new ClassI();
		Thread t1=new Thread(iobj);
		t1.start();
		t1.setName("1st thread");
		t1.setPriority(3);
		t1.join();
		
		
		Thread t2= new Thread(iobj);
		t2.start();
		t2.setName("2nd thread");
		t2.setPriority(1);
		
		
	}
}
