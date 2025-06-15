package com.switchstatements;

public class ClassC 
{
	void meth1(String name, int age, char gender, int no_tyres)
	{
		System.out.println("Implementing switch case\n");
		final int i=50; //final variable are compile time constants
		//i++;//c.E
		byte b=20;
		switch(b+45) //20+45=65===> int
		{
		//System.out.println("Hello world");//C.E
		case 10:
			System.out.println("case 10 executed");
			break;
		case 20:
			System.out.println("case 20 executed");
			break;
		case 'A':
			System.out.println("case 65 executed");
		
			if(age>=18)
			{
				System.out.println(name+" you are eligible for driving");
				switch(gender)
				{
				case 'M','m':
					System.out.println("User is male");
				switch(no_tyres)
				{
				case 2:
					System.out.println("Mr."+name+" you can apply for 2 wheeler lisence");
					break;
				case 4:
					System.out.println("Mr."+name+" you can apply for 4 wheeler lisence");
					break;
				case 6,10:
					System.out.println("Mr."+name+" you can apply for Heavy vechile lisence");
					break;
				default:
					System.out.println("Invalid TYRE count observed!!!");
					break;
				}
				break;
				case 'F','f':
					System.out.println("User is female");
				switch(no_tyres)
				{
				case 2:
					System.out.println("Miss."+name+" you can apply for 2 wheeler lisence");
					break;
				case 4:
					System.out.println("Miss."+name+" you can apply for 4 wheeler lisence");
					break;
				case 6,10:
					System.out.println("Miss."+name+" you can apply for Heavy vechile lisence");
					break;
				default:
					System.out.println("Invalid TYRE count observed!!!");
					break;
				}
				break;
				default:
					System.out.println("Invalid Gender Data!!!");
					break;
				
				}
				
			}
			else
			{
				System.out.println(name+"please come back after "+(18-age)+"years");
			}
			break;
		case 400-360:
			System.out.println("case 40 executed");
		    break;
		default:
			System.out.println("Invalid data !!!");
			break;
				
		}
		System.out.println("\nCompiler came out from switch case");
	}
	public static void main(String[] args) 
	{
		
		ClassC cobj=new ClassC();
		cobj.meth1("raki", 34, 'm', 2);
	}

}
