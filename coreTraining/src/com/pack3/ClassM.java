package com.pack3;

public class ClassM
{
	void meth1(int a,String s)
{
	System.out.println(a+a);
	System.out.println("a");
	System.out.println('a');
	System.out.println("s :"+s);
}
void meth2(int a,int b)
{
	System.out.println(a*a);
	System.out.println(b);
	new ClassM().meth4("Java is awesome");
	new ClassM().meth3('A',100);
	System.out.println(a-b);
}
void meth3(char c,int a)
{
	System.out.println(c);
	System.out.println('c');
	System.out.println(a);
}
void meth4(String s)
{
	new ClassM().meth1(10, "Hello world");
	System.out.println(s);
}
public static void main(String[] args)
{
	System.out.println("start");
	new ClassM().meth2(5,10);
	System.out.println("End");
	
 }

}

