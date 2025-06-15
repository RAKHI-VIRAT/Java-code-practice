package com.static29;

public class ClassB 
{
 final static int x; // final variables are compile-time constants
 static
 {
	 x=50;
	 System.out.println("1st static block called : "+x);
 }
 public static void main(String[] args)
 {
	// x=51; //c.e because of final key word
	 System.out.println("main() called : "+x);
 }
 static
 {
	// x=100;  //c.e because of final key word
	 System.out.println("2nd static block called : "+x);
 }
}
