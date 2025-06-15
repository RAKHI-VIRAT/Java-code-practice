package com.controlstatements;

public class ClassD {
	void meth1(int length, int breadth) {
		if(length==breadth)
			System.out.println("it is a square");
		else
			System.out.println("it is a rectangular");
		
	}
	public static void main(String[] args) {
		ClassD dobj=new ClassD();
		dobj.meth1(3, 3);
		
	}

}
