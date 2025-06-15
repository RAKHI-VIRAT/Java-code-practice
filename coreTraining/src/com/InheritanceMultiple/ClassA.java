package com.InheritanceMultiple;

public class ClassA implements InterfaceA, InterfaceB
{
 public void msg()
 {
	System.out.println("we are overridding the msg()"); 
	InterfaceA.super.msg();
	InterfaceB.super.msg();
 }
 public static void main(String[] args) 
 {
	ClassA aobj = new ClassA();//3rd point
	aobj.msg();
	
	System.out.println("\n---------------");
	InterfaceA aobj1= new ClassA();//2nd point
	aobj1.msg();
	
	System.out.println("\n---------------");
	InterfaceB aobj2= new ClassA();//2nd point
	aobj2.msg();
}
}
