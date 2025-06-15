package com.Array45;
import java.util.Arrays;
public class ClassO //2-D array
{
	void meth1()
	{
		int arr1[][];
		arr1=new int[2][3];
		arr1[0][0]=1;
		arr1[0][1]=2;
		arr1[0][2]=3;
		arr1[1][0]=4;
		arr1[1][1]=5;
		arr1[1][2]=6;
		
		int arr2[][]=new int[][] {{2,3,4},{5,6,7}};
		
		int arr3[][]= {{9,8,7},{6,5,4}};
		
		int row=arr1.length;
		
		int coloumn=arr1[0].length;
		
		int totalElement=row*coloumn;
		
		System.out.println("The length of a= "+totalElement);
		
		System.out.println("aar1 lenth : "+arr1.length);
		
		System.out.println("aar2 lenth : "+arr2.length);
		
		System.out.println("aar3 lenth : "+arr3.length);
		
		System.out.println(Arrays.deepToString(arr1));//1st way
		
	
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------");
		System.out.println(Arrays.deepToString(arr2));
		
		System.out.println(Arrays.deepToString(arr3));
		System.out.println(arr1);
		System.out.println(arr1.toString());
		
		
		
	}
	public static void main(String[] args) 
	{
		new ClassO().meth1();
		
	}

}
