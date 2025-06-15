package com.constructor24;

public class Student 
{
	/*
	  2)Write a program to print the name of a student by creating 
	a Student class. If no name is passed while creating an 
	object of Student class, then the name should be 
	"Unknown", otherwise the name should be equal to the
	  String value passed while creating object of Student class. 
	  */
	Student()
	{
		System.out.println("The name of the student is Unknown");
	}
	Student(String name)
	{
		System.out.println("The name of the Student is "+name);
	}
	public static void main(String[] args) 
	{
		new Student();
		new Student("Raki");
		
	}

}
