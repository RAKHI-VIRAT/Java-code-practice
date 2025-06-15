package com.Array45;

import java.util.Arrays;

public class ClassA 
{
	void meth1()
	{
		System.out.println("Implementing Java Array\n");
		
		int arr1[];
		arr1=new int[5];
		
		int arr2[]=new int[3];
		
		int arr3[]= {11,22,33,44};
		
		int arr4[]=new int[] {100,200,300,400,500,600};
		
		String s="java";
		
		System.out.println("Length of string s : "+s.length());
		
		System.out.println("Length of arr1 : "+arr1.length);
		System.out.println("Length of arr2 : "+arr2.length);
		System.out.println("Length of arr3 : "+arr3.length);
		System.out.println("Length of arr4 : "+arr4.length);
		
		
		System.out.println(arr1);//arr1 means object internally toString
		System.out.println(arr1.toString());
		System.out.println(arr1[0]);
		
		System.out.println("\narr1 : "+Arrays.toString(arr1));
		System.out.println("arr2 : "+Arrays.toString(arr2));
		System.out.println("arr3 : "+Arrays.toString(arr3));
		System.out.println("arr4 : "+Arrays.toString(arr4));
		
		arr1[1]=23;
		arr1[3]=44;
		System.out.println("\n arr1 : "+Arrays.toString(arr1));
	}
	public static void main(String[] args) 
	{
		ClassA aobj=new ClassA();
		aobj.meth1();
		
		System.out.println(aobj);//the internal implementation toString
	   System.out.println(aobj.toString());
	}

}
