package com.pack3;

public class ClassD
{
 void meth1()
 {
	 System.out.println("Hi");
	 int i = 10;
	 System.out.println("i");
	 System.out.println(i);
	 System.out.println("i :"+i);
	 System.out.println("Addition:"+(i+90));
 }
 public static void main(String[] args) 
 {
	 ClassD aobj = new ClassD();
	 aobj.meth1();
 }
}
