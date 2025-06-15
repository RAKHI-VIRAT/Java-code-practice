package com.scannerClass41;
import java.util.Scanner;
public class ClassC 
{
	static Scanner sc=new Scanner(System.in);
	void empData()
	{
		System.out.println("Employee Details Entered by user");
		
		
		System.out.println("Enter EmpName: ");
		//sc.nextLine();
		String name=sc.nextLine();
		
		
		System.out.println("Enter EmpSal: ");
		Long sal=sc.nextLong();
		
		System.out.println("Enter EmpAddress: ");
		//sc.nextLine();
		String addr=sc.next();
		
		
		System.out.println("Enter EmpId: ");
		int id=sc.nextInt();
		
		//System.out.println("Enter EmpSal: ");
		//int sal=sc.nextInt();
		
		
		
		
		System.out.println("EmpName: "+name);
		System.out.println("EmpId: "+id);
		System.out.println("EmpSal: "+sal);
		System.out.println("EmpAddress: "+addr);
	}
	public static void main(String[] args) 
	{
		new ClassC().empData();
	}

}
