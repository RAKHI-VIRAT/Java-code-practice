package com.encapsulation1;

import java.util.Scanner;

public class ClassB 
{
  Scanner sc=new Scanner(System.in);
  ClassA aobj=new ClassA();
  
  void meth1()
  {
	  System.out.println("Implementing Encapsulation");
	  
	  System.out.println("Enter your Employee Name");
	  aobj.empName=sc.next();
	  
	  System.out.println("Enter your Employee Salary");
	  aobj.empSal=sc.nextInt();
	  
	  System.out.println("Enter your Employee Department");
	  aobj.empDep=sc.next();
	  
	  System.out.println("\n*****Employee Data*****");
	  System.out.println("Employee Name :"+aobj.empName);
	  System.out.println("Employee Salary :"+aobj.empSal);
	  System.out.println("Employee Department :"+aobj.empDep);
	  
  }
  public static void main(String[] args) 
  {
	ClassB bobj=new ClassB();
	bobj.meth1();
  }
}
