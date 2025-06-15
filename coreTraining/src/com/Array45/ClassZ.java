package com.Array45;
import java.util.Arrays;
public class ClassZ 
{
void meth1(int arr1[], char arr2[])
{
	System.out.println("The length of arr1 : "+arr1.length);
	System.out.println("The length of arr2 : "+arr2.length);
	
	int arr3[]=new int[arr1.length];
	int index=0;
	for(int i=arr1.length-1;i>=0;i--)
	{
		arr3[index++]=arr1[i];
	}
	System.out.println(Arrays.toString(arr3));
	
	for(int i=0;i<arr1.length;i++)
	{
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	System.out.println("-------");
	for(int i=arr1.length-1;i>=0;i--)
	{
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	System.out.println(Arrays.toString(arr2));
	for(char c:arr2)
	{
		System.out.print(c+" ");
	}
}
 public static void main(String[] args) 
 {
	ClassZ zobj=new ClassZ();
	zobj.meth1((new int[] {11,22,33,44}),new char[] {'q','1','@','-'});
}
}
