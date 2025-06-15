package com.Stringhandling49;

import java.util.Scanner;
import java.util.Arrays;

public class ClassB 
{
	
	void meth1()
	{
		System.out.println("meth1() called\n");
		
		String s1="Java";
		String s2=new String("Java");
		String s3="Java";
		String s4=new String("java");
		
		System.out.println("---equals()-----");//in String Class equals() is used to compare the content
		System.out.println(s1.equals(s2));
		System.out.println("Java".equals("Java"));
		System.out.println(s2.equals("java"));
		System.out.println(s2.equalsIgnoreCase("java"));
		System.out.println(s3.equals(new String("java")));
		System.out.println(new String("java").equals("java"));
		System.out.println(s2.equals(s4));	
		
		System.out.println("\n------==-------");//== is used here to compare address location
		System.out.println(s1==s2);
		System.out.println(s2==s4);
		System.out.println(s1==s3);
		System.out.println(s2==new String("java"));
		System.out.println("Java"==s1);
		System.out.println("Java"==new String("Java"));
		System.out.println(s3=="Java");
		System.out.println("Java"=="Java");
		System.out.println(new String("Java")==new String("Java"));
	}
	void meth2()
	{
		System.out.println("meth2() called");
		System.out.println("Implementing String Class methods\n");
		
		String s1="Java";
		System.out.println("length() : "+s1.length());
		System.out.println("concat() : "+s1.concat(" is awesome"));
		System.out.println("length() : "+s1.length());
		System.out.println("length() : "+s1.concat(" is awsome").length());
	    
		System.out.println("charAt() : "+s1.charAt(0));
		System.out.println("charAt() : "+s1.charAt(s1.length()-1));
	
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your gender (M/F) ?");
		char gender=sc.nextLine().charAt(0);
		
		switch(gender)
		{
		case 'F','f':
			System.out.println("User is Female");
		    break;
		case 'M','m':
			System.out.println("User is Male");
		    break;
		 default:
			 System.out.println("Invalid input!!!");
		}
		sc.close();
		
		
		System.out.println("startswith() : "+s1.startsWith("J"));
		System.out.println("startswith() : "+s1.startsWith("Ja"));
		System.out.println("startswith() : "+s1.startsWith("J"));
		
		System.out.println("toLowerCase() : "+s1.toLowerCase());
		System.out.println("toUpperCase() : "+s1.toUpperCase());
		System.out.println("s1 : "+s1);
		
		String s2="Java is awesome";
		System.out.println("substring(8) : "+s2.substring(8));
		System.out.println("substring(9,11) : "+s2.substring(9,11));
		System.out.println("substring(3,9) : "+s2.substring(3,9));
	
	    System.out.println("replace() : "+s2.replace('a', 'A'));
	    System.out.println("s2 : "+s2);
	    
	    String s3="Hello world ";
	    System.out.println("===> "+s3.length());
	    System.out.println("===> "+s3.trim().length());
	    
	    System.out.println("indexOf() : "+s3.indexOf('o'));
	    System.out.println("indexOf() : "+s3.lastIndexOf('o'));
	    
	    String date="1-Apr-2025";
	    String arr1[]=date.split("-");
	    System.out.println(Arrays.toString(arr1));
	    
	    String msg="I love Java";
	    String arr2[]=msg.split("");
	    System.out.println(Arrays.toString(arr2));
	    
	    String data="ABC DEF";
	    byte arr3[]=data.getBytes();//we will use this method in IO-Streams
	     
	    for(byte b:arr3)
	    {
	    	System.out.print((char)b+" ");
	    }
	    System.out.println();
	    System.out.println("A".compareTo("A"));
	    System.out.println("A".compareTo("C"));
	    System.out.println("C".compareTo("A"));
	    System.out.println("L".compareTo("Q"));
	    System.out.println("Z".compareTo("R"));
	    System.out.println("A".compareTo("A"));
	    System.out.println("A".compareToIgnoreCase("a"));
	    
	}
	public static void main(String[] args) 
	{ 
		ClassB bobj=new ClassB();
		//bobj.meth1();
		bobj.meth2();
	}

}
