package com.typecasting31;

public class ClassA 
{
	void meth1() {
		System.out.println("performing implicit typecasting of byte\n");
		//byte = 1byte(8bits)-128 t0 127
		byte b=10;  //byte to short, int, long, float, double 
		System.out.println("byte PDT b : "+b);
		
		short s=b;
		System.out.println("short PDT s : "+s);
		
		int i=b;
		System.out.println("int PDT i : "+i);
		
		long l=b;
		System.out.println("Long PDT l : "+l);
		
		float f=b;
		System.out.println("float PDT f : "+f);
			
		double d=b;
		System.out.println("double PDT d : "+d);
		System.out.println("----------------");
		
	}
	void meth2() {
		System.out.println("performing implicit typecasting of short\n");
		//short=2 bytes(16bits) -32768 to 32767 
		short s=12; //short to int, long, float, double
		System.out.println("short PDT s : "+s);
		
		int i=s;
		System.out.println("int PDT i : "+i);
		
		long l=s;
		System.out.println("Long PDT l : "+l);
		
		float f=s;
		System.out.println("float PDT f : "+f);
			
		double d=s;
		System.out.println("double PDT d : "+d);
		
		System.out.println("----------------");
		
	}
	void meth3() {
		System.out.println("performing implicit typecasting of char\n");
		//char=2 bytes (0 to 65535)
		char c='A'; //char to int, long, float, double
		System.out.println("char PDT c : "+c);
		
		int i=c;
		System.out.println("int PDT i : "+i);
		
		long l=c;
		System.out.println("Long PDT l : "+l);
		
		float f=c;
		System.out.println("float PDT f : "+f);
			
		double d=c;
		System.out.println("double PDT d : "+d);
		
		System.out.println("----------------");
	}
	void meth4() {
		System.out.println("performing implicit typecasting of int\n");
		//int=4bytes(32bits)  -2147483648 to 2147483647
		int i=15; //int to long, float, double
		System.out.println("char PDT i : "+i);
		
		long l=i;
		System.out.println("Long PDT l : "+l);
		
		float f=i;
		System.out.println("float PDT f : "+f);
			
		double d=i;
		System.out.println("double PDT d : "+d);
		
		System.out.println("----------------");
	}
	void meth5() {
		System.out.println("performing implicit typecasting of long\n");
		//long=8bytes(64 bits) 
		long l=23;// long to float, double
		System.out.println("Long PDT l : "+l);
		
		float f=l;
		System.out.println("float PDT f : "+f);
			
		double d=l;
		System.out.println("double PDT d : "+d);
		
		System.out.println("----------------");
	}
	void meth6() {
		System.out.println("performing implicit typecasting of long\n");
		//float=4 bytes(5 to 6 decimal places)
		float f=33;//float f=33.0f; // float to double
		System.out.println("float PDT f : "+f);
		//double=8 bytes(14 to 15 decimal places)	
		double d=f;
		System.out.println("double PDT d : "+d);
		
		System.out.println("----------------");
	}

	public static void main(String[] args) {
		ClassA fobj=new ClassA();
		fobj.meth1();
		fobj.meth2();
		fobj.meth3();
		fobj.meth4();
		fobj.meth5();
		fobj.meth6();
	}


}
