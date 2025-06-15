package com.Stringhandling49;

public class ClassD 
{
	public String helloNames(String names)
	{
		return "Hello ".concat(names);
		
	}
public static void main(String[] args) 
{
	ClassD dobj=new ClassD();
	String result =dobj.helloNames("bob");
	System.out.println(result);
	
}
}
