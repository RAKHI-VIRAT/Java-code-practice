package com.Stringhandling49;

public class ClassH 
{
	public String extraEnd (String str)
	{
		String k="";
		
		//String s=(str.charAt(str.length()-2)+str.charAt(str.length()-1)+k);
		String s=str.substring(str.length()-2);
		return s+s+s;
	}
	public static void main(String[] args) 
	{
		ClassH hobj=new ClassH();
		String result=hobj.extraEnd("mina");
		System.out.println(result);
		
	}

}
