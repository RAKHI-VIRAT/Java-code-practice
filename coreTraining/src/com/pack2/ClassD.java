package com.pack2;

public class ClassD {
	void method(int i) {
		
		 
		System.out.println(i);
		++i;
		 
			//return;
		if(i>100)
			return;
		new ClassD().method(i);
		//method(i);
	}
	public static void main(String[] args) {
		new ClassD().method(1);
	}

}
