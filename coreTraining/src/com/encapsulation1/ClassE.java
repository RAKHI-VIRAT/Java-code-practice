package com.encapsulation1;

public class ClassE 
{
	 private static String EmpName;//static is not recommended
	 private int EmpSal;
	 private String EmpDep;
	 private int EmpExp;

public void setEmpName(String EmpName)
{
	this.EmpName=EmpName;
}
public String getEmpName()
{
	return this.EmpName;
}
public void setEmpSal(int EmpSal)
{ 
	this.EmpSal=EmpSal;
	
	
	
}
public int getEmpSal()
{
	if(EmpExp>=10)
	{
		int increment=(EmpSal*30)/(100);
		return (EmpSal+increment);
		
	}
	else if((EmpExp<10)&&(EmpExp>0))
	{
		int increment=(EmpSal*10)/(100);
		return (EmpSal+increment);
	}
	else if(EmpExp<0)
	{
		System.out.println("Give valid input");
		return 0;
	}
	else
	{
		return EmpSal;
	}
}
public void setEmpDep(String EmpDep)
{
	this.EmpDep=EmpDep;
}
public String getEmpDep()
{
	return EmpDep;
}
public void setEmpExp(int EmpExp)
{
	this.EmpExp=EmpExp;
	
}
public int getEmpExp()
{
return EmpExp;
}
}
