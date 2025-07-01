package com.multithreading;//classR

public class ClassQ 
{
 int amount=1000;
 synchronized void with_draw(int amount) throws Exception
 {
	 if(this.amount<amount)
	 {
		 System.out.println("Insufficient balance");
		 
	 //wait(30000); //30 sec
	 Thread.sleep(30000); // 30 sec
	 
	 System.out.println("Amount credited");
	 this.amount-=amount;
	 System.out.println("with draw sucessful \nBalance is "+this.amount);
    }
 else
 {
	 this.amount-=amount;
	 System.out.println("with draw sucessful \nBalance is "+this.amount);
}
}
 synchronized void deposit(int amount)
 {
	 this.amount+=amount;
	 System.out.println("Deposited successfully \nBalance is "+this.amount);
 //notify();
 notifyAll();
 }
}
