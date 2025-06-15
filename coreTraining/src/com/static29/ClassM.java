package com.static29;

public class ClassM 
{
 static int a=0;
 int b=0;
 ClassM()
 {
	 a++;
	 b++;
	 System.out.println("Static variable ===>"+a);
	 System.out.println("Instance variable ===>"+b);
	 System.out.println("-------");
 }
 void display()
 {
	 System.out.println("*****Accessing static variable****");
	 System.out.println(ClassM.a);
	 System.out.println(a);
	 System.out.println(new ClassM().a);
 }
 public static void main(String[] args) 
 {
	 new ClassM();
	 new ClassM();
	 new ClassM();
	 System.out.println("########################");
	 new ClassM().display();
	
}
}
