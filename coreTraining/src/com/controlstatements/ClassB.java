package com.controlstatements;

public class ClassB {
	void meth1(int x, int y) {
		if(x>y) {
			System.out.println(x+" is biggest");
		}
		else
		{
			System.out.println(y+" is biggest");
		}
	}
	public static void main(String[] args) {
		ClassB aobj= new ClassB();
		aobj.meth1(5, 10);}
	
}
