package com.pack2;

public class ClassG {  //class-31
	void meth1()
	{
		System.out.println("performing implicit typecasting\n");
		byte b=10;
		int i=b;
		float f=b;
		System.out.println("byte PDT b : "+b);
		System.out.println("int PDT i : "+i);
		System.out.println("float PDT f : "+f);
		
		char c1='A';
		int i2=c1;
		
		char c2=' ';
		int i3=c2;
		
		char c3='1';
		int i4=c3;
		
		System.out.println("\nchar PDT c1 : "+c1);
		System.out.println("int PDT i2 : "+i2);
		
		System.out.println("\nchar PDT c2 : "+c2);
		System.out.println("int PDT i3 : "+i3);
		
		System.out.println("\nchar PDT c3 : "+c3);
		System.out.println("int PDT i4 : "+i4);
	}
	void meth2() {
		System.out.println("performing explicit typecasting");
		
		int i1=10;
		byte b1=(byte)i1;
		System.out.println("\nint PDT i1 : "+i1);
		System.out.println("byte PDT b1 : "+b1);
		
		final int i2=10; // final variables are compile time constants
		//i2=i2+200; // c.e
		byte b2=i2;  //byte range is -128 to 127
		System.out.println("\nint PDT i2 : "+i2);
		System.out.println("byte PDT b2 : "+b2);
		
		int i3=500;
		byte b3=(byte)i3;//byte range is -128 to 127
		System.out.println("\nint PDT i3 : "+i3);
		System.out.println("byte PDT b3 : "+b3);
		
		/* if the source variable exceeds the range of the destination 
		 variable then formula
		 [minumRange+(result-maximumRange-1)]
		 -128+(500-127-1)===>-128+(500-128)===> -128+372===>244>127
		 -128+(244-127-1)====>-128+(244-128)===>-128+116==>-12 (-128<-12<127)
		 
		*/
		
		float f=10.9999f;
		byte b4=(byte)f;
		System.out.println("\nfloat PDT f : "+f);
		System.out.println("byte PDT b4 : "+b4);
		
		
		int i=2;
		short s=(short)i;
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		ClassG gobj = new ClassG();
		//gobj.meth1();
		gobj.meth2();
		
		
	}

}
