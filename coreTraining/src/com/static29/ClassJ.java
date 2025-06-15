package com.static29;

public class ClassJ 
{
 int x = 10;
 public static void main(String[] args) 
 {
	ClassJ t1 = new ClassJ();
	ClassJ t2 = new ClassJ();
	
	t1.x = 20;
	System.out.print(t1.x + " ");
	System.out.println(t2.x);
 }
}
