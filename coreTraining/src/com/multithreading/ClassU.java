package com.multithreading;//Daemon Thread

public class ClassU extends Thread
{
	@Override
	public void run()
	{
		int count=1;
		while(true)
		{
			System.out.println("ClassU run() : "+count++);
		}
	}
	public static void main(String[] args) 
	{
		ClassU uobj = new ClassU();
		Thread t = new Thread(uobj);
		t.setDaemon(true);
		t.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("main() : "+i);
		}
	}

}
