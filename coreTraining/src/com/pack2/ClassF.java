package com.pack2;

public class ClassF { //class-31

void meth1() {
	System.out.println("performing implicit typecasting of byte\n");
	
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
	
	float f=33;
	//float f=33.0f; // float to double
	System.out.println("float PDT f : "+f);
		
	double d=f;
	System.out.println("double PDT d : "+d);
	
	System.out.println("----------------");
}

public static void main(String[] args) {
	ClassF fobj=new ClassF();
	fobj.meth1();
	fobj.meth2();
	fobj.meth3();
	fobj.meth4();
	fobj.meth5();
	fobj.meth6();
}

}
