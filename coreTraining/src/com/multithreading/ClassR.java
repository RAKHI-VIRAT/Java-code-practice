package com.multithreading;

public class ClassR extends ClassQ
{
	public static void main(String[] args) 
	{
		ClassR robj=new ClassR();
		
		new Thread()// first thread
		{// Anonymous Inner Class Starts here
		 @Override
		 public void run()
		 {
			 try
			 {
				 robj.with_draw(20000);
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }
		}// Anonymous Inner class Ends here
		.start();
		new Thread()// Second Thread
		{// Anonymous Inner Class Starts here
			@Override
			public void run()
			{
				robj.deposit(90000);
			}
			
		}
		.start();
	}

}
