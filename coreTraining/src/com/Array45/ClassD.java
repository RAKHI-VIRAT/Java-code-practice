package com.Array45;

public class ClassD 
{
 void meth1()
 {
 int arr[] []= {{1,2,3},{4,5,6},{7,8,9}};
 for(int i=0;i<3;i++)
 {
	 for(int j=0;j<3;j++)
	 {
		 System.out.print(arr[i][j]+" ");
	 }
	 System.out.println();
 }
 }
 public static void main(String[] args) 
 {
	new ClassD().meth1();
}
}
