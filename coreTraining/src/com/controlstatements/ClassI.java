package com.controlstatements;

public class ClassI { //class-36
void company(int sal, int serv)
{
	int bonus = (sal*5)/100;
	if(serv>5)
	{
		System.out.println("his/her years of experience is "+serv);
		System.out.println("The currect salary of his/her is "+sal);
		System.out.println("The bonus for his/her will be add "+bonus);
		System.out.println("After adding the bonus the total salray of his/her is "+(sal+bonus));
	}
	else if((serv <= 5)&&(serv >= 0))
	{
		System.out.println("his/her year of experience "+serv);
		System.out.println("The currect salary of his/her is "+sal);
		System.out.println("his/her should have work more "+(5-serv)+" years to get the bonus");
			
	}
	else
	{
		System.out.println("his/her please give the vaild service");
	}
	
}
 public static void main(String[] args) 
 {
	ClassI iobj = new ClassI();
	iobj.company(30000,6);
 }
}
