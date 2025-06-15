package com.iterationforforeach;

public class ClassF 
{
	void meth1()
	 {
		 System.out.println("meth1() called");
		  String names[]=new String[5];
		  names[0]="Alex0";
		  names[1]="Alex1";
		  names[2]="Alex2";
		  names[3]="Alex3";
		  names[4]="Alex4";
		  
		  System.out.println("Reterving the elements by using for loop");
		    for(int i=0;i<=4;i++)
		    {
		    	System.out.println(names[i]);
		    	//System.out.println(i);
		    }
		    
		    System.out.println("\nReterving the elements in reverse order by using for loop");
		    for(int i=4;i>=0;i--)
		    {
		    	System.out.println(names[i]);
		    }
		    
		    System.out.println("\nReterving the elements by using for-each loop");
		    for(String data:names)
		    {
		    	System.out.println(data);
		    }
	 }
	public static void main(String[] args) 
	 {
		ClassF eobj = new ClassF();
		eobj.meth1();
		
		
	 }

}
