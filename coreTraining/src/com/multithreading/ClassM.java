package com.multithreading;

public class ClassM extends Thread
{
  @Override
  public void run()
  {
	  String name=Thread.currentThread().getName();
	  System.out.println(name+" has entered run()");
	  synchronized(this)//block
	  {
	  for(int i=1;i<=3;i++)
	  {
		  System.out.println(name+" : "+i);
	  }
	  }
	  System.out.println(name+"Completed execution run()");
  }
  public static void main(String[] args) 
  {
	ClassM mobj=new ClassM();
	
	Thread t1= new Thread(mobj);
	Thread t2= new Thread(mobj);
	
	t1.setName("1st-Thread");
	t2.setName("2nd_Thread");
	
	t1.start();
	t2.start();
	
}
}
