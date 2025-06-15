package com.scannerClass41;
import java.util.Scanner;
public class ClassD 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		int i=sc.nextInt();
		System.out.println(i);
		
		String s="10";
		int i2=Integer.parseInt(s);
		System.out.println(i2);
		
		byte i4=Byte.parseByte(sc.next());//Byte.parseByte("32")
		System.out.println(i4);
		
		String s4=sc.next();
		System.out.println(s4);
		
		
	}
 public static void main(String[] args) 
 {
	new ClassD().meth1();
}
}
