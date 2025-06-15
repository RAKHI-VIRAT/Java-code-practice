package com.encapsulation1;//encapsulation

public class ClassC 
{
	  private String empName; //instance variables
	  private int empSal;
	  private String empDep;//Alt+shift+s getter and setters method
	  
	  
	 public void setEmpName(String empName)
	 {
		 this.empName=empName;
		 //System.out.println(empName);
	 }
	 public String getEmpName()
	 {
		 return empName;
	 }
	 public void setEmpSal(int empSal)
	 {
		 this.empSal=empSal;
	 }
	 public int getEmpSal()
	 {
		 return empSal;
	 }
	 public void setEmpDep(String empDep)
	 {
		 this.empDep= empDep;
	 }
	 public String getEmpDep()
	 {
	 return empDep;
	 }
}
 