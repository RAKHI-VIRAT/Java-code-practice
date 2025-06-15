package com.practise;

public class ClassB 
{
 void meth1(int sal,int exp)    
 {
	 if(exp>5)
	 {
		 int bonus=(sal*5)/100;
		 System.out.println("his/her is having "+exp);
		 System.out.println("his/her is getting the bonous of 5% is "+bonus);
		 System.out.println("his/her is getting current salary is "+sal);
		 System.out.println("his/her updated salary is "+(sal+bonus));
	 }
	 else
	 {
		 System.out.println("his/her is having "+exp);
		 System.out.println("his/her is need to work more "+(6-exp)+" years to get bonus");
	 }
 }
 public static void main(String[] args) 
 {
	 new ClassB().meth1(20000, 6);
	
}
	
}
