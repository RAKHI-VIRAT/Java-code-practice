package com.multithreading; //dead lock class-70

public class ClassP 
{
	public static void main(String[] args) 
	{
		final String A="Java";
		final String B="Python";
		
		Thread t1=new Thread()
		{// Anononmyous Inner Class starts here
			@Override
			public void run()
			{
				synchronized(A)// Thread 1 is holding JAVA
				{
					System.out.println("Thread 1 locked on A");
				try
				{
					Thread.sleep(10000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				synchronized(B)// Thread1 will be waiting for B (Python)
				{
					System.out.println("Thread 1 locked on B");
				}
				System.out.println("no dead lock");
				}
			}
		
		}// Anononmyous Inner Class End here
		;
	
	Thread t2=new Thread()
	{// Anononmyous Inner Class starts here
		@Override
		public void run()
		{
			synchronized(B)// Thread 2 is holding Python
			{
				System.out.println("Thread 2 locked on B");
			try
			{
				Thread.sleep(10000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			synchronized(A)// Thread1 will be waiting for A (Java)
			{
				System.out.println("Thread 2 locked on A");
			}
			System.out.println("no dead lock");
		   }
		}
	    }
		;
 t1.start();
 t2.start();
	}
}
