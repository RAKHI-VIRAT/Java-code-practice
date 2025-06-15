package com.pack3;

public class ClassG
{
	void meth1()
	{
	ClassG obj1=new ClassG();
	obj1.meth5();
	int a=10;
	System.out.println(10);
	System.out.println(54+a);
	}
     void meth2()
     {
    	 int a=20;
    	 System.out.println(78-a);
     }
     void meth3()
     {
    	 int a=30;
    	 ClassG obj1=new ClassG();
    	 System.out.println(89+1);
    	 obj1.meth1();
    	 System.out.println(10);
     }
     void meth4()
     {
    	 int a=10;
    	 System.out.println(89);
    	 System.out.println(85);
    	 System.out.println(44);
     }
     void meth5()
     {
    	 System.out.println(77);
    	 ClassG obj1=new ClassG();
    	 obj1.meth2();
    	 System.out.println(99);
     }
     public static void main(String[] args)
     {
    	 System.out.println("start");
    	 ClassG aobj=new ClassG();
    	 aobj.meth3();
    	 System.out.println("End");
		
	}

}
