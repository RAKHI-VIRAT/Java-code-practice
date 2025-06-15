package com.static29;

public class ClassG 
{
	int x=10;
	public static void main(String[] args) 
	{
		int x=20;
		System.out.println(x);
	}
	static
	{
		int x=30;
		System.out.print(x + " ");
	}

}

/* if the names of the instance variable and
local variable are same, the first priority goes to 
local variable
*/
