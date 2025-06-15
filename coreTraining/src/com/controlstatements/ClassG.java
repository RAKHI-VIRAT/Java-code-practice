package com.controlstatements;

public class ClassG {
	void meth1(char c)
	{
		if((c>=65)&&(c<=90))
		System.out.println(c+" is upper case letter");
		else if((c>=97)&&(c<=122))
			System.out.println(c+" is lower case letter");
		else
			System.out.println(c+" the given value is not a alphabet");
	}
	public static void main(String[] args) {
		ClassG gobj=new ClassG();
		gobj.meth1('@');
		
	}

}
