package com.Array45;

import java.util.Arrays;

public class ClassF 
{
 void meth1(boolean flag[])
 {
	 System.out.println("meth1() called");
	 System.out.println("===>"+Arrays.toString(flag));
 }
 public static void main(String[] args) 
 {
	ClassF fobj=new ClassF();
	//boolean input[]= {true,false};
	//fobj.meth1(input);//1st way
	fobj.meth1(new boolean[] {true,false});// 2nd way
}
}
