package com.iterationforforeach;

public class ClassC 
{
 void meth1()
 {
	 System.out.println("---meth1()-----");
	for(int i=1;i<=5;++i) //here in this place post-
 //and pre increment/decrement not change same result
	 //for(int i=1;i<=5;i++)
	 {
		 System.out.println("i value : "+i);
	 }
	 System.out.println("meth1() execution completed");
 }
 void meth2()
 {
	 System.out.println("---meth2()-----");
	 for(int i=1;i<=5;i++)
	 {
		 for(int j=5;j>=0;j--)
		 {
			 System.out.println("i : "+i+" j : "+j);
		 }
		 System.out.println("-------");
	 }
	 System.out.println("meth2() execution completed");
 }
 void meth3()
 {
	 {
		 System.out.println("----meth3()----");
		 for(int i=1;i<=10;i++)
		 {
			 System.out.println("i value : "+i++);
			 i++;
		 }
		 System.out.println("meth3() execution completed");
	 }
 }
	 void meth4()
	 {
		 System.out.println("---meth4()----");
		 int i=1;
		 for(;i<10;)
		 {
			 System.out.println("i vaule : "+i++ +" "+ ++i);
			 //System.out.println("i vaule : "+(i++ + ++i);
			 i++;
		 }
		 System.out.println("meth4() execution completed");
	 }
	 void meth5()
	 {
		 System.out.println("---meth5--");
		 for(int i=(new ClassC().meth6()-64); i<=5;  new ClassC().meth7())
		 {
			 System.out.println("i value : "+ i++);
		 }
		 System.out.println("meth5() execution completed");
	 }
	 int meth6()
	 {
		 System.out.println("meth6() called");
		 return 'A';
	 }
	 void meth7()
	 {
		 System.out.println("--------");
	 }
	 void meth8()
	 {
		 System.out.println("---meth8()----");
		 int i=1;
		 for(;;)
		 {
			 System.out.println("i value : "+i);
			 i++;
			 
		 }
		// System.out.println("meth8() execution completed"); //c.e beoz of unrechable code
	 }
 
 public static void main(String[] args) 
 {
	ClassC cobj=new ClassC();
	//cobj.meth1();
	//cobj.meth2();
	//cobj.meth3();
	//cobj.meth4();
   //cobj.meth5();
	cobj.meth8();
}
}
