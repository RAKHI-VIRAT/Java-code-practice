package com.Stringhandling49;

public class ClassG 
{
	public String makeOutWord(String out, String word)
	{ 
		return out.substring(0,2)+word+out.substring(2);
		//return out.charAt(0)+out.charAt(1)+word+out.charAt(2)+out.charAt(3);
	}
	
	public static void main(String[] args)
	{
		
	ClassG gobj=new ClassG();
	String result=gobj.makeOutWord("<<>>", "RAKI");
	System.out.println(result);
}
}
