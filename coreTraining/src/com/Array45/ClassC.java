package com.Array45;

import java.util.Arrays;

public class ClassC 
{
	void meth1()
	{
		System.out.println("Implementing Java Array\n");
		
		String names[]=new String[5];
		names[0]="Alexa";
		names[1]="Athena";
		names[2]="max";
		names[3]="Jack";
		names[4]="katle";
		
		//names[5]="Mack";// It generates AIOB Exception
		
		System.out.println("names : "+Arrays.toString(names));
		
		System.out.println("\nReterving the data by using for loop");//works on index position
	    for(int i=1;i<=3;i++)
	    {
	    	System.out.println(names[i]+" ");
	    }
	    
	    System.out.println("\n-----------");
	    for(int i=0;i<names.length;i++)
	    	System.out.println(names[i]+" ");
	    
	    System.out.println("\n--------");
	    for(int i=names.length-1;i>=0;i--)
	    	System.out.println(names[i]+" ");
	    
	    System.out.println("\n\nReteriving the data by using for-each loop");//works on streaming data
	for(String s:names)
	{
		System.out.println(s+" ");
	}
	
	System.out.println("\n-------------");
	
	String arr[]=new String[names.length];
	int count=1;
	for(String s:names)  //0
	{
		System.out.println(count+++"iteration : "+s);
		//for(int i=arr.length-1;i>=0;i--)  
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s;
			System.out.println("********>"+Arrays.toString(arr));
			
		}
		//break
		//System.out.println("###########>"+Arrays.toString(arr));
	}
	System.out.println("---------");
	System.out.println("=====>"+Arrays.toString(arr));
	}
	void meth2()
	{
		System.out.println("meth2() called");
		
		int arr1[]=new int[0];//this is allowed but we cant pass any elements 
	    System.out.println("arr1 length : "+arr1.length);
	    // arr1[0]=100;
	    // System.out.println("arr1[0] : "+arr1[0]);//AIOB
	     
	    // int arr2[]=new int[-5];// negativeArraySizeException
	    // System.out.println("arr2 : "+arr2.length);
	    
	    boolean flag1[]=new boolean['A'];
	    System.out.println("flag1 length : "+flag1.length);
	    System.out.println(Arrays.toString(flag1));
	}
 public static void main(String[] args) 
 {
	ClassC cobj = new ClassC();
	cobj.meth1();
	cobj.meth2();
}
}
