package com.constructor24;

public class programming 
{
	/*1) Create a class named 'Programming'. While creating an 
	object of the class, if nothing is passed to it, then the 
	message "I love programming languages" should be printed. 
	If some String is passed to it, then in place of "programming 
	languages" the name of that String variable should be 
	printed.For example, while creating object if we pass "Java", 
	then "I love Java" should be printed. */
	programming()

	{
		System.out.println("I love programming language");
	}
	programming(String Java)
	{
		System.out.println(Java);
	}
	public static void main(String[] args) 
	{
		new programming();
		new programming("I love Java");
		
	}

}
