package com.static29;

public class ClassH 
{
 int x=10;
 public static void main(String[] args) 
 {
	int x=20;
	System.out.println(x);
}
 static
 {
	 int x=30;
	 System.out.println(x+ " "+new ClassH().x);
 }
}
