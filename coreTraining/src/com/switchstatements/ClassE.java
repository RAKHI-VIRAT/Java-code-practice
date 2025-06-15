package com.switchstatements;

public class ClassE 
{
	String name = "raki";
	 void meth1(int age) 
	 {
		 System.out.println("welcome to driving online application");
		 
		 new ClassE().meth3('j');
		if((age >=18)&&(age <=90))
		{
			 
			System.out.println(name+" is elgible for driving");
			new ClassE().meth4(2);
			
			 
			
		}
		else if(age <18)
		
			System.out.println(name+" is not eligible for driving nedd to wait more "+(18-age)+" years");

			else
				System.out.println("please give me correct input");
	 }
	 
	 String meth2(String s)
	 {
		 return s = name;
	 }
	char meth3(char c)
	 {
		switch(c)
		{
		case 'm':
		case'M':
			System.out.println("User is male");
		break;
		case 'f':
		case 'F':
			System.out.println("User is female");
		break;
		default:
			System.out.println("invalid input");
			break;
		}
		 return c;
	 }
	int meth4(int y)
	{
		switch(y)
		{
		case 2:
			System.out.println(name+" is eligible for 2 Wheeler license");
			break;
			
		case 4:
			System.out.println(name+" is eligible for 4 Wheeler license");
			break;
			
		case 6:
		case 8:
			System.out.println(name+" is eligible for heavy vechile license");
			break;
		default:
			System.out.println(name+",please give me correct input");
			break;
		
		}
	return y;
	}
	 public static void main(String[] args) 
	 {
	ClassE eobj =new ClassE();
	eobj.meth1(2);
	
	}
}
