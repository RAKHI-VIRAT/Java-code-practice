package com.encapsulation1;

import java.util.Scanner;

public class ClassD 
{
	Scanner sc=new Scanner(System.in);
	 ClassC cobj=new ClassC();
	  
	  void meth1()
	  {
		  System.out.println("Implementing Encapsulation");
		  
		  System.out.println("Enter your Employee Name");
		 // cobj.empName=sc.next();//c.e because of private
		  cobj.setEmpName(sc.next());
		  
		  System.out.println("Enter your Employee Salary");
		  //cobj.empSal=sc.nextInt();
		  cobj.setEmpSal(sc.nextInt());
		  
		   System.out.println("Enter your Employee Department");
		  //cobj.empDep=sc.next();
		   cobj.setEmpDep(sc.next());
		 
		  System.out.println("\n*****Employee Data*****");
		  
		  //System.out.println("Employee Name :"+cobj.empName);
		  System.out.println("Employee Name :"+cobj.getEmpName());
		  
		  //System.out.println("Employee Salary :"+cobj.empSal);
		  System.out.println("Employee Salary :"+cobj.getEmpSal());
		  
		  
		  //System.out.println("Employee Department :"+cobj.empDep);
		  System.out.println("Employee Department :"+cobj.getEmpDep());
		  
	  }
	  public static void main(String[] args) 
	  {
		ClassD dobj=new ClassD();
		dobj.meth1();
	  }

}
