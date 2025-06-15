package com.static29;

public class ClassI 
{
	static int x=10;
	public static void main(String[] args) 
	{
		ClassI t1 = new ClassI();
		ClassI t2 = new ClassI();
		
		t1.x = 20;
		System.out.print(x+ " ");
		System.out.println(t2.x);
	}

}
