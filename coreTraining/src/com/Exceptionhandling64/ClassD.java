package com.Exceptionhandling64;

public class ClassD 
{
 int avl_amt=1000;
 
 void withDraw(int wd_amt)
 {
	 if(avl_amt<wd_amt)
	 {
		 throw new IllegalArgumentException("Insufficient Funds");
	 }
	 else
	 {
		 System.out.println("Transaction Sucess!!");
		 System.out.println("please take : "+wd_amt);
	 }
 }
 public static void main(String[] args) 
 {
	ClassD dobj=new ClassD();
	dobj.withDraw(6000);
}
}
