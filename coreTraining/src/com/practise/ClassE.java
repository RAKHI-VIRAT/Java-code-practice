package com.practise;

public class ClassE 
{
  int i;
  static int k=2;
  
  {
	 System.out.println(i);
	// System.out.println(j);//c.e
	 System.out.println(this.j);
	 
	 System.out.println(k);
	 System.out.println(l);
     System.out.println(this.l);
	System.out.println(ClassE.l);
 }
      
	  int j=20;
	  static int l=50;
	  
 
	 public static void main(String[] args) {
	 System.out.println("in main");
	 new ClassE();
	 System.out.println("\n-----------");
	 System.out.println(new ClassE().j);
			 
			 
	}
}
