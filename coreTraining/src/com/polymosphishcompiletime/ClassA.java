package com.polymosphishcompiletime;

public class ClassA 
{
	public static void meth1()
	{
		System.out.println(10);
	}
	void meth1(int i)
	{
		System.out.println(20);
	}
	private void meth1(String s)
	{
		System.out.println(30);
	}

	static int meth1(int i, String s)
	{
		System.out.println(40);
		return 1;
	}
	//static String meth1(int i, String s)
	//{
	//	System.out.println(40);
	//	return "1";
	//}
	protected void meth1(String s,int i)
	{
		System.out.println(50);
	}
	void meth1(StringBuffer sb)
	{
		System.out.println(60);
	}
	static private void meth1(byte b)
	{
		System.out.println(70);
	}
	public static void main(String[] args) 
	{
		ClassA aobj = new ClassA();
		aobj.meth1();
		aobj.meth1(100);
		aobj.meth1("java");
		aobj.meth1(100,"java");
		aobj.meth1("java",100);
		aobj.meth1(new StringBuffer("Java"));
		aobj.meth1((byte)10);
		main();//static method
		main("Java is awesome");
		
	}
	public static void main()
	{
		System.out.println("1st main()");
	}
	public static void main(String s)
	{
		System.out.println("2nd main()");
	}
	ClassA()
	{
		this(100);
		System.out.println("ClassA default constructor");
	}
	ClassA(int x)
	{
		System.out.println("ClassA parameterized constructor : "+x);
	}
}
