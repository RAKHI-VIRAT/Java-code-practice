package com.Array45;

import java.util.Arrays;

public class ClassP //3-D array/multi dimensional array
{
	void meth1()
	{
		int arr2[][][]=new int[2][2][3];
		int arr1[][][]={ {{1,2,3},{4,5,6}},
				{ {1,2,3},{4,5,6}}};
		
		//System.out.println(arr1.length);
		int layer=arr2.length;
		System.out.println("no.of layers "+layer);
		
		int row=arr2[0].length;
		
		System.out.println("no.of rows "+row);
		
		int coloumn=arr2[0][0].length;
		System.out.println("no.of coloumn"+coloumn);
		
		int totalele=layer*row*coloumn;
		System.out.println("total no of elements "+totalele);
		
		System.out.println(Arrays.deepToString(arr1));//1st way
		
		for(int i=0;i<arr1.length;i++)//2nd way
		{
		System.out.println("Layer "+i+":");
		for(int j=0;j<arr1[i].length;j++)
		{
		for(int z=0;z<arr1[i][j].length;z++)
		{
			System.out.print(arr1[i][j][z]+" ");
		}
		System.out.println();
		}
		System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		 ClassP pobj=new ClassP();
		 pobj.meth1();
	}

}
