package com.pack2;

public class ClassH {
	void Implicit() { //class-31
		byte b=10;
		System.out.println("byte value is "+b);
		short s=b;
		System.out.println("short value is "+s);
		s++;
		int i=s++;
		System.out.println("int value is "+i);
		System.out.println("short value is "+s);
		long l=i;
		System.out.println("long value is : "+(--l));
		float f=l;
		System.out.println("float value is "+(f+b));
		double d=(--f);
		System.out.println("double value is "+d);
		System.out.println("-------");
		System.out.println(d);
		System.out.println(f);
		show();// calling a method by using identifier names
		if(!(d==f))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
	}
	public static void main(String[] args) {
		ClassH hobj=new ClassH();
		hobj.Implicit();
		
	}
	static void show() {
		char c='A'; //65
		int a=++c;  //66
		System.out.println(a);
		ClassH aobj = new ClassH();
		String s= aobj.meth1();
		System.out.println(s);
	}
	String meth1()
	{
		String s=("Implicit casting is done by the compiler automatically");
		return s;
	}

}
