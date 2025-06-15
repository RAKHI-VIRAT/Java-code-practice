package com.Array45;
import java.util.Arrays;
public class ClassM  //class-48
{
	public int[] rotateLeft3(int[] nums)
	{
		return new int[] {nums[1],nums[2],nums[0]};
		
	}
	public static void main(String[] args) 
	{
		ClassM mobj=new ClassM();
		int input[]= {5,11,9};
		int result[]=mobj.rotateLeft3(input);
		System.out.println(Arrays.toString(result));
	}

}
