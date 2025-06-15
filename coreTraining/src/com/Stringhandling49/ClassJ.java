package com.Stringhandling49;

public class ClassJ 
{
	
	public String doubleChar(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
			s=s+str.charAt(i)+str.charAt(i);
		return s;
			
	}
	public static void main(String[] args) 
	{
		ClassJ jobj=new ClassJ();
		String result=jobj.doubleChar("honey");
		System.out.println(result);
	}

}
