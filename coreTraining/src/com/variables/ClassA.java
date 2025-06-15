package com.variables;

public class ClassA 
{
 int x=10; //instance variable
 static int y=20; // Static Variable
 
 int a;
 static boolean b;
 
/*
  static int x=100;
 static char x='A'; // these will generate C.E because of Duplicate field names
 String y="Java";
*/
 
 void meth1()
 {
	 System.out.println("meth1() called\n");
	 int z=30; //local Variable
	 
	 System.out.println("Instance Variable x : "+x); //by using identifier name
	 System.out.println("Instance Variable x : "+new ClassA().x+"\n"); //by using Class Object
	 
	 System.out.println("Static Variable y : "+y); //by using identifier name
	 System.out.println("Static Variable y : "+new ClassA().y);// by using class object
	 System.out.println("Static Variable y : "+ClassA.y+"\n"); // ****by using respective class name
 
	 System.out.println("Local Vriable z : "+z);// by using identifier name
 }
 void meth2()
 {
	 System.out.println("meth2() called\n");
	 int x=111;
	 int y=222;
	 System.out.println("Instance Variable x : "+new ClassA().x);
	 System.out.println("Static Variable y : "+ClassA.y);
	// System.out.println("Local Variable z : "z); //C.E
	 System.out.println("Local Variable x : "+x+"y : "+y);
 }
 void meth3()
 {

	 System.out.println("meth3() called\n");
	 int c;
	 System.out.println("Instance Variable a : "+a);
	 System.out.println("Static Varibale b : "+ClassA.b);
	 //System.out.println("Local Variable c :"+c);//c.e because not initialized
 }
 public static void main(String[] args)
 {
	
	 ClassA aobj =new ClassA();
	 aobj.meth1();
	 System.out.println("----------");
	 aobj.meth2();
	 System.out.println("-------");
	 aobj.meth3();
 }
 
}
