package com.multithreading;//classK

public class ClassJ extends Thread
{
 @Override
 public void run()
 {
	 for(int x=1;x<=3;x++)
	 {
		 System.out.println("ClassI: "+x);
	 }
 }
}
