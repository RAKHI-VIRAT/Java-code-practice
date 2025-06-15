package com.pack4;

public class ClassB {
	ClassB()
	{
		System.out.println("hi");
	int x;
		//System.out.println(x);
	}
	public ClassB(int x)
	{
		System.out.println(x);
	}
	public ClassB(int x,int y)
	{
		System.out.println(y);
	}
public static void main(String[] args) 
{
	new ClassB();
	new ClassB(3);
	new ClassB(3,4);
}

}
