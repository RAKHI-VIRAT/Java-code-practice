package com.Stringhandling49;

public class ClassE 
{
	public String makeAbba(String a,String b)
	{
		return a.concat(b).concat(b).concat(a);
		//return a+b+b+a;
	}
	public static void main(String[] args) 
	{
		ClassE eobj=new ClassE();
		String result=eobj.makeAbba("hi", "Bye");
		System.out.println(result);
	}

}
