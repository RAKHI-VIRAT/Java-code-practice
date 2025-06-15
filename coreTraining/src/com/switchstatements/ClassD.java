package com.switchstatements;

public class ClassD
{
	void meth1(String name, int age, char gender, int tyre )
	{
		System.out.println("welcome to online appliction for driving lisence");
		if ((age >=18)&&(age<=90))
		{
			System.out.println(name+" you are eligible for driving lisence");
		switch(gender)
		{
		case 'M','m':
			System.out.println("User is a male");
		switch(tyre)
		{
		case 2:
			System.out.println("mr."+name+" you can apply for 2 wheeler lisence");
			break;
		case 4:
			System.out.println("mr."+name+" you can apply for 4 wheeler lisence");
		    break;
		case 6,10:
			System.out.println("mr."+name+" you can apply for heavy wheeler lisence");
		    break;
		    default:
		    	System.out.println("please provide correct input"); 
		}
		System.out.println("tyre loop excution completed");
		break;
		
		case 'F','f':
			System.out.println("User is a female");
		switch(tyre)
		{
		case 2:
			System.out.println("miss."+name+" you can apply for 2 wheeler lisence");
			break;
		case 4:
			System.out.println("miss."+name+" you can apply for 4 wheeler lisence");
		    break;
		case 6,10:
			System.out.println("miss."+name+" you can apply for heavy wheeler lisence");
		    break;
		    default:
		    	System.out.println("please provide correct input"); 
		}
		System.out.println("tyre loop excution completed");
		break;
		default:
			System.out.println();
			
      }
		System.out.println("gender loop execution completed");
		
		}
		
	
		
		if((age<=18)&&(age>=0))
		{
			System.out.println(name+" you are not eligle for driving lisence");
		   System.out.println(name+" you need to wait more "+(18-age)+" years to eligible for driving liscence");
		}
		else if(age>=90)
		{
			System.out.println(name+" you are not eligible for driving");
		}
		   else
			   System.out.println("please provide valid data");
			
	
		
		 
	}
	public static void main(String[] args) 
	{
		ClassD dobj = new ClassD();
		dobj.meth1("john",18,'h',1);
	}
	

}
