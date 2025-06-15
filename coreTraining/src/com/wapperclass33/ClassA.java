package com.wapperclass33;

public class ClassA 
{
	void meth1()
	{
		int arr[]= new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr[2]);
	}
	public static void main(String[] args) 
	{
		new ClassA().meth1();
	}

}
