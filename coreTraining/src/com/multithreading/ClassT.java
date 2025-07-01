package com.multithreading;//thread pool

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassT extends Thread
{
	private String msg;
	public ClassT(String s)
	{
		this.msg= s;
	}
	@Override
	synchronized public void run()
	{
		System.out.println(Thread.currentThread().getName()+" (Begining) message");
		processMessage();
		
		System.out.println(Thread.currentThread().getName() + " (Ending)");
		processMessage();
	}
	
		private void processMessage()  
		{
			try
			{
				Thread.sleep(10000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void main(String[] args) 
		{
			ExecutorService executor = Executors.newFixedThreadPool(3);
			
			for(int i=1;i<=5;i++)
			{
				ClassT tobj=new ClassT(""+i);
				Thread t=new Thread(tobj);
				executor.execute(t);
			}
			executor.shutdown();
			while(!executor.isTerminated())
			{
				
			}
			System.out.println("Finished all threads");
		}
}
