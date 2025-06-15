package com.practise;

import java.util.Arrays;
import java.util.Scanner;

public class ClassF 
{
	static int x=1;
	static
	{
		System.out.println(x);
		//System.out.println(j);//c.e
		System.out.println(ClassF.j);
	}
	static int j=22;
	public static void main(String[] args) 
	{
		
		System.out.println("hi main");
		System.out.println(j);
		new ClassF();
		//try {
		//Class.forName("ClassE");
		//}catch(Exception e) {
		//	System.err.println(e);
		//}
		System.out.println("after try");
		int[] r = {6,3,2,5,4,9,4};
		System.out.println(Arrays.toString(r)+" "+r.length);
		Arrays.sort(r);
		System.out.println(r.length);
		System.out.println(Arrays.toString(r));
	}

	
	
}
