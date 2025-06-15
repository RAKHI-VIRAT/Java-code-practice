package com.Array45;

import java.util.Arrays;

public class ClassG 
{
 int[] meth1(boolean flag[])
 {
	 System.out.println("meth1() called");
	 System.out.println("===>"+Arrays.toString(flag));
	 System.out.println("lenth of flag : "+flag.length);
	 
	 //int arr[]= {11,22,33};
	 //return arr; //1st way
	 
	 return new int[] {11,22,33};
 }
 public static void main(String[] args) 
 {
	ClassG gobj=new ClassG();
	int result[]=gobj.meth1(new boolean[] {true,false,true});
	
	System.out.println("meth1() is returning : "+Arrays.toString(result));
	System.out.println("The length of result : "+result.length);
}
}
