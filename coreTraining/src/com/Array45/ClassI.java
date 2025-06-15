package com.Array45;
import java.util.Arrays;
public class ClassI //class 48
{
	int[] meth1()
	{
		int arr1[]= {2,3,2,3};
		for(int i=0;i<arr1.length-1;i++)
		{
			System.out.println(Arrays.toString(arr1));
			System.out.println("------------");
			if((arr1[i]==2)&&(arr1[i+1]==3))
			{
				arr1[i+1]=0;
				System.out.println(Arrays.toString(arr1));
				System.out.println("##########");
				
			}
		}
		return arr1;
	}
public static void main(String[] args)
{
	ClassI iobj=new ClassI();
	int result[] =iobj.meth1();
	System.out.println(Arrays.toString(result));
}
}
