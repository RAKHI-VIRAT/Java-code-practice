package com.pack1;

public class ClassG 
{
	String empname;
	int empsal;
	String empdep;
	static String companyname = "TCL";
	
	ClassG(String name, int sal,String dep)
	{
		empname=name;
		empsal=sal;
		empdep=dep;
		//System.out.println("emp details: "+ empname+" "+ empsal+" " +empdep);
	}

	public static void main(String[] args)
	{
		ClassG emp1=new ClassG("raki",30000,"mechanical");
		ClassG emp2=new ClassG("manu",50000,"civil");
		
		companyname = "Tll";
		
		System.out.println("emp1 detalis: "+emp1.empname+" " +emp1.empsal+" "+emp1.empdep+" "+ClassG.companyname);
		System.out.println("emp2 detalis: "+emp2.empname+" " +emp2.empsal+" "+emp2.empdep+" "+companyname);
		companyname = "Tll";
		System.out.println("emp1 detalis: "+emp1.empname+" " +emp1.empsal+" "+emp1.empdep+" "+companyname);
	}

}
