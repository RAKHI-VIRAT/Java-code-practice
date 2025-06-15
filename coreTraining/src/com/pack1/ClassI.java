package com.pack1;

public class ClassI 
{ 
	int a=10;
	int meth1()
	{
		int a=10;
		a++;     //11
		System.out.println(a++);    //11   a=12
		a++;  //a=13
		System.out.println(++a);   //14 a=14
		System.out.println(a++);   //14  a=15
		System.out.println(a++);   //15  a=16
		a--;   //a=15
		System.out.println(--a);  //a=14
		a=a++ +3;  //14+3=17   a=17
		System.out.println("a vlaue===>"+a);  //17
		
		System.out.println(a++);   //17 a=18
		--a;   //17
		System.out.println(--a);   //16  a=16
		System.out.println(a--);  //16   a=15
		a=a-- +3;     //15+3=18   a=18
		System.out.println(a); //a=18
		return a++ + ++a;   //18+20=38  a=20
	}
	void meth2()
	{
		int a=10;
		//System.out.println("---------");
		//System.out.println("print "+new ClassI().meth1());
		
		int x=new ClassI().meth1()+ a++;  //X=38+10=48  a=11
		System.out.println(x++ + a++);    // 48+11=59    X=49 A=12
		System.out.println(a++);          //a=12         a=13
		System.out.println(a);           //13
		System.out.println(x);           //49
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		new ClassI().meth2();
		System.out.println("Java is awsome");
	}
}
