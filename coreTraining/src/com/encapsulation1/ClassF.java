package com.encapsulation1;

import java.util.Scanner;
public class ClassF 
{
  Scanner sc= new Scanner(System.in);
  ClassE eobj =new ClassE();
void meth1()
{
 System.out.println("Enter employee Names");
 //ClassE.EmpName=sc.next();
 eobj.setEmpName(sc.next());
 
 System.out.println("Enter employee exeperience");
//eobj.EmpExp=sc.nextInt();
eobj.setEmpExp(sc.nextInt());
 
 System.out.println("Enter employee Salary");
// eobj.EmpSal=sc.nextInt();
 eobj.setEmpSal(sc.nextInt());
 
 System.out.println("Enter employee department");
// eobj.EmpDep=sc.next();
 eobj.setEmpDep(sc.next());
 
 
 System.out.println("\n****************");
// System.out.println("Empolyee names :"+eobj.EmpName);
 System.out.println("Empolyee names :"+eobj.getEmpName());
 
 //System.out.println("Empolyee Experience :"+eobj.EmpExp);
 System.out.println("Empolyee Experience :"+eobj.getEmpExp());
 
 //System.out.println("Empolyee salary :"+eobj.EmpSal);
 System.out.println("Empolyee increment Salary :"+eobj.getEmpSal());
 
 //System.out.println("Empolyee Department :"+eobj.EmpDep);
 System.out.println("Employee Department :"+eobj.getEmpDep());
 

 
}
public static void main(String[] args) 
{
	ClassF fobj=new ClassF();
	fobj.meth1();
}
}
