package com.multithreading;//class G

public class ClassF extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("ClassA : "+i);
		}
	}

}
