package com.constructor24;

public class ClassD 
{
 String empName;
 int empSal;
 String empDept;
 
 static String empCompany="TCS";
 
 ClassD(String name, int sal, String dept)//constructor is used to provide values for instance variable
 {
	 empName=name;
	 empSal=sal;
	 empDept=dept;
	 
	// System.out.println("emp1 data : "+name+" "+sal+" "+dept+" "+ClassD.empCompany);
	 
 }
 public static void main(String[] args) 
 {
	 ClassD emp1=new ClassD("Alex",10000,"Java");
	 ClassD emp2=new ClassD("John",50000,"Python");
	 ClassD emp3=new ClassD("Clinka",60000,"Devops");
	 
	 
	 System.out.println("emp1 data : "+emp1.empName+" "+emp1.empSal+" "+emp1.empDept+" "+ClassD.empCompany);
	 System.out.println("emp2 data : "+emp2.empName+" "+emp2.empSal+" "+emp2.empDept+" "+ClassD.empCompany);
	 System.out.println("emp3 data : "+emp3.empName+" "+emp3.empSal+" "+emp3.empDept+" "+ClassD.empCompany);
	 
	 emp1.empSal=45000;
	 emp2.empCompany="HCL";
	 
	 System.out.println("\nemp1 data : "+emp1.empName+" "+emp1.empSal+" "+emp1.empDept+" "+ClassD.empCompany);
	 System.out.println("emp2 data : "+emp2.empName+" "+emp2.empSal+" "+emp2.empDept+" "+ClassD.empCompany);
	 System.out.println("emp3 data : "+emp3.empName+" "+emp3.empSal+" "+emp3.empDept+" "+ClassD.empCompany);
	 
}

}
