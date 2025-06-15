package com.scannerClass41;
import java.util.Scanner;
public class ClassB 
{
	Scanner sc=new Scanner(System.in);//non-static variable
	
	void meth1()
	{
		System.out.println("meth1() called\n");
		System.out.println("Enter 1st number");
		//int x=sc.nextInt();
		int x=Integer.parseInt(sc.nextLine());
		System.out.println("x : "+x);
		
	}
	String meth2(int i)
	{
		System.out.println("meth2() called");
		if(i%2==0)
		{
			System.out.println("If block executed");
			System.out.println("please give your result");
			return sc.nextLine();
		}
		else
		{
			System.out.println("else block executed");
			System.out.println("please give your result");
			return sc.nextLine();
		}
	}
	void checkEligibility(String name, int age)
	{
		if(age>18)
			System.out.println(name+" you are eligible to vote");
		else
			System.out.println(name+" you are eligible to vote after "+(18-age)+" years");
	}
 public static void main(String[] args)
 {
	ClassB bobj=new ClassB();
	bobj.meth1();
	System.out.println("meth2() is returning : "+bobj.meth2(6));
	 System.out.println("Enter your name");
	
	String uname=bobj.sc.next();//non-static variable inside static block
	//String uname1=sc.next() ;//static variable
	
	System.out.println("Enter your age");
	int uage=bobj.sc.nextInt();
	//int uage=sc.nextInt();
	
	bobj.checkEligibility(uname, uage);
	
}
} 
