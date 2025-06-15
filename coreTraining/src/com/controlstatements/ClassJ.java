package com.controlstatements;

public class ClassJ 
{
	void meth1(int held, int atten)
	{
	int attendance = ((atten*100)/held);
	//System.out.println(attendance);
	if((attendance >= 75)&&(attendance <101))
	{
		System.out.println("his/her attendance percentage is "+attendance);
		System.out.println("his/her elgible for exam");
	}
	else if ((attendance <= 75) && (attendance >=0))
	{
	System.out.println("his/her is not elgible for exam");
	System.out.println("his/her attendance percentage is "+attendance);
	System.out.println("his/her must need more "+(75-attendance)+" precentage to write an exam");
	System.out.println("better luck for next time");
	
	}
	else
	{
		System.out.println("please give the correct input");
	}
	
	}
	public static void main(String[] args) 
	{
		ClassJ jobj=new ClassJ();
		jobj.meth1(50, -99);
	}
}
