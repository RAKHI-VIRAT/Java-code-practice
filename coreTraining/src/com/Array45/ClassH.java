package com.Array45;
import java.util.Arrays;
public class ClassH 
{
	String[] meth1(int arr1[], char arr2[])
	{
		System.out.println(Arrays.toString(arr1));
		int new1[]=new int[arr1.length];
		int index=0;
		for(int i=arr1.length-1;i>=0;i--)
		{
			new1[index++]=arr1[i];
		}
		System.out.println("new1 : "+Arrays.toString(new1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("by using for loop in forward direction");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
			
		}
		System.out.println();
		System.out.println("by using for-lopp arr2 in backward direction");
		for(int i=arr2.length-1;i>=0;i--)
		{
			System.out.print(arr2[i]+" ");
		}
		
		return new String[] {"mani","messi","manka","hika"};
	}

public static void main(String[] args) {
	int num[]= {22,44,55,666};
	char char1[]= {'a','b','c','d'};
	ClassH hobj=new ClassH();
String result[]=hobj.meth1(num, char1);
int len=result.length;
if(len%2==0)
{
	System.out.println("The length of array is even");
	for(int i=0;i<len/2;i++)
	{
		System.out.print(result[i]+" ");
	}
	}
	else
	{
		System.out.println("The length of arry is odd");
		System.out.println(result[len-2]+" "+result[len-1]);
	}
}
}

