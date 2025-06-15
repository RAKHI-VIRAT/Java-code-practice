package com.practise;

public class ClassC 
{
	public static void main(String[] args) 
	{
		 int i=10;
		 System.out.println(i);
		 Integer i1=i;
		 System.out.println(i1);
		 Integer i2=new Integer(i);
		 System.out.println(i2);
		 Integer i3=Integer.valueOf(i);
		 System.out.println(i3);
		 
		 
		 Integer x=30;
		 Integer x1=new Integer(30);
		 Integer x3=Integer.valueOf(30);
		 
		 int a=x;
		 System.out.println(x);
		 int a1=x.intValue();
		 System.out.println(a1);
		 
		 String s="21";
		 short x5=Short.parseShort(s);
		 System.out.println(x5);
		
	}

}
