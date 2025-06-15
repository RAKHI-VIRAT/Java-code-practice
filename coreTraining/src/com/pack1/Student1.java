package com.pack1;

public class Student1
{
 /*
  2)Write a program to print the name of a student by creating 
a Student class. If no name is passed while creating an 
object of Student class, then the name should be 
"Unknown", otherwise the name should be equal to the
  String value passed while creating object of Student class. 
  */
	
	Student1()
	{
		System.out.println("The name of the Student: Unknown");
	}
	Student1(String s)
	{
		System.out.println("The name of the Student is "+s);
	}
	public static void main(String[] args) 
	{
		new Student1();
		new Student1("Raki");
	}
}
