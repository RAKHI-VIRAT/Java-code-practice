package com.abstractioninterface60;

public interface InterfaceA 
{
	int x=10;//Internally by default public static final int x=10;
	public static final int y=20;
	
	void meth1();//internally by default public abstract void meth1();
	public abstract int greeting(String msg);
	
	default void meth2()  //Java 1.8V
	{
		System.out.println("InterfaceA default meth2()");
		
	}
	static void meth3()   //Java1.8V
	{
		System.out.println("InterfaceA static meth3()");
	}
	private void meth4()  //Java 1.9V
	{
		System.out.println("InterfaceA private meth4()");
	}
	public static void main(String[] args) //Java 1.8
	{
		System.out.println("InterfaceA main()");
		//new InterfaceA();  //c.E
		meth3();
		InterfaceA.meth3();
	}

}
