package com.Array45;

public class ClassJ //class-48
{
int meth1(int arr1[])
{
	if(arr1.length>=2)
		return arr1[0]+arr1[1];
	else if(arr1.length==1)
		return arr1[0];
	else
		return 0;
	
}
public static void main(String[] args) 
{
	ClassJ jobj=new ClassJ();
	int result=jobj.meth1(new int[] {22,22,33});
	System.out.println("result "+result);	
}
}
