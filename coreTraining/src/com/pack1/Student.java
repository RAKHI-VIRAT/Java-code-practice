package com.pack1;

public class Student 
{
	Student()
	{
		System.out.println("Unknown");
	}
	Student(String s)
	{
		System.out.println("The name of the student is:"+s);
	}
	public static void main(String[] args) 
	{
		new Student("Raki");
	}

}
