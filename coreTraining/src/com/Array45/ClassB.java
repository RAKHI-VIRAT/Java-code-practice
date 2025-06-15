package com.Array45;

import java.util.Arrays;

public class ClassB 
{ 
	void meth1()
	{
		System.out.println("Implementing Java Array\n");
		int arr1[];
		arr1=new int[5];
		
		int arr2[]=new int[3];
		
		int arr3[]= {22,33,55,33};
		
		int arr4[]=new int[] {100,200,300,400,500,600};
		
		String s="Java";
		
		System.out.println("arr1 length : "+arr1.length);
		System.out.println("arr2 length: "+arr2.length);
		System.out.println("arr3 length: "+arr3.length);
		System.out.println("arr4 length: "+arr4.length);
		System.out.println("s lenth :"+s.length());
		
		System.out.println("\narr1 : "+arr1);//internally compiler is going to call toString() present in object class
	    System.out.println("\narr1 : "+arr1.toString());
	    System.out.println("arr2 : "+arr2);
	    System.out.println("arr3 : "+arr3);
	    System.out.println("arr4 : "+arr4);
	    
	    System.out.println("\nnarr1 : "+Arrays.toString(arr1));
	    System.out.println("narr2 : "+Arrays.toString(arr2));
	    System.out.println("narr3 : "+Arrays.toString(arr3));
	    System.out.println("narr4 : "+Arrays.toString(arr4));
	    
	    arr1[1]=25;
	    arr1[3]=45;
	    System.out.println("\narr1 : "+Arrays.toString(arr1));
	    
	    System.out.println("\nReteriving the data from Array");
	    
	    System.out.println(arr1[0]);
	    System.out.println(arr1[arr1.length-2]);
	    System.out.println(arr3[arr1.length-3]);
	   // System.out.println(arr4[arr4.length]);//it generates AIBO exception
	    System.out.println(arr4[arr4.length-1]);
	}
	public static void main(String[] args) 
	{
		new ClassB().meth1();
	}

}
