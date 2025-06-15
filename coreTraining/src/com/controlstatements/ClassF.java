package com.controlstatements;

public class ClassF {
	void gradingsystem(int marks)
	{
		if(marks<25)
		{
		System.out.println("Your garde is F");
		System.out.println("Bettter luck for next attempt");
		}
		if((marks>=25)&&(marks<45))
		System.out.println("Your garde is E");
		if((marks>=45)&&(marks<50))
			System.out.println("Your garde is D");
		if((marks>=50)&&(marks<60))
			System.out.println("Your garde is C");
		if((marks>=60)&&(marks<80))
			System.out.println("Your garde is D");
		if((marks>=80)&&(marks<100))
			System.out.println("Your garde is A");
		if(marks>100)
			System.out.println("please give me correct input marks");
		
		
		/*if(marks<25)
		{
		System.out.println("Your garde is F");
		System.out.println("Bettter luck for next attempt");
		}
		else if((marks>=25)&&(marks<45))
		System.out.println("Your garde is E");
		else if((marks>=45)&&(marks<50))
			System.out.println("Your garde is D");
		else if((marks>=50)&&(marks<60))
			System.out.println("Your garde is C");
		else if((marks>=60)&&(marks<80))
			System.out.println("Your garde is D");
		else if((marks>=80)&&(marks<100))
			System.out.println("Your garde is A");
		else
			System.out.println("please give me correct input marks");
			*/
		
	}

	public static void main(String[] args) {
		ClassF fobj = new ClassF();
		fobj.gradingsystem(1);
		
	}
}
