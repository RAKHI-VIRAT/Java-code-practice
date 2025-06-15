package com.Array45;
import java.util.Arrays;
public class ClassN //1-d array
{
	
	void meth1()
	{
		
	int arr1[]=new int[4];
	//arr1= new int[]{22,33,44,55};//valid
	//arr1= {1,2,3,4}//in valid
	arr1[0]=1;
	arr1[1]=2;
	arr1[2]=4;
	
	int arr2[]=new int[] {22,33,55};
	int arr3[]= {22,11,33,44};
	System.out.println(arr2.length);
	System.out.println(arr2[arr2.length-1]);
	System.out.println(arr2[2]);
	System.out.println(Arrays.toString(arr1));//1st way
	
	for(int i=0;i<arr1.length;i++)//2nd way
    System.out.print(arr1[i]+" ");
	
	
	}
	public static void main(String[] args) 
	{
		ClassN nobj=new ClassN();
		nobj.meth1();
	}
}
