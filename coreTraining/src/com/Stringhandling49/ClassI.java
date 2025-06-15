package com.Stringhandling49;

public class ClassI 
{
	public String firstTwo(String str)
	{
		if(str.length()>=2)
		{
			return str.substring(0,2);
		}
		else
			return str;
	}
	public static void main(String[] args) 
	{
		ClassI iobj=new ClassI();
		String result=iobj.firstTwo("h");
		System.out.println(result);
		
	}

}
