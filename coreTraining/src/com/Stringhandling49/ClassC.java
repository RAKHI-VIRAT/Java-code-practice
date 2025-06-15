package com.Stringhandling49;

import java.util.Arrays;

public class ClassC 
{
	void meth()
	{
		String s1="Java";
		String s2="java";
		System.out.println("length "+s1.length());//length//1
		System.out.println("length "+s2.length());
		
		System.out.println(s1.equals(s2));//compare text//2
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1==s2);//compare address location
		
		System.out.println("concat : "+s1.concat(" java java"));//3
		System.out.println("length "+s1.length());
		System.out.println(s1.concat(" java java").length());
		
		System.out.println(s1.charAt(0));//4
		System.out.println(s1.charAt(s1.length()-1));
		
		System.out.println(s1.startsWith(s2));//5
		System.out.println(s1.startsWith("J"));
		
		System.out.println(s1.toLowerCase());//6
		System.out.println(s1.toUpperCase());//7
		System.out.println(s1);
		
		System.out.println(s1.substring(0));//8
		System.out.println(s1.substring(0,2));
		
		String s3=" hello hexa ";
		System.out.println(s3.length());
		System.out.println(s3.trim().length());//9
		
		System.out.println(s3.replace('e','1'));//10
		
		System.out.println(s3.indexOf('e'));//11
		System.out.println(s3.lastIndexOf('e'));//12
		
		String arr1[]=s3.split("");//13
		System.out.println(Arrays.toString(arr1));
		String date="13-5-2025";
		String arr2[]=date.split("-");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("a".compareTo("a"));//14
		System.out.println("a".compareTo("c"));
		System.out.println("c".compareTo("a"));
		
	}
	public static void main(String[] args) 
	{
		ClassC cobj=new ClassC();
		cobj.meth();
	}

}
