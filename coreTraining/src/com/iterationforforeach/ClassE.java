package com.iterationforforeach;

public class ClassE 
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
	  
	// names[5]="Alex5";// It generates AIOB Exception
	  
	  System.out.println(names[0]);
	  System.out.println(names[1]);
	  System.out.println(names[2]);
	  System.out.println(names[3]);
	  System.out.println(names[4]);
	  System.out.println(names[5]);
 }
 public static void main(String[] args) 
 {
	ClassE eobj = new ClassE();
	eobj.meth1();
	
}

}
