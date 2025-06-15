package com.polymorphismruntime;

public class ClassC //inherit by object class
{
	@Override  //Annotation
	public String toString()
	{
		return "Java is awesome";
	}
 public static void main(String[] args) 
 {
	ClassC cobj = new ClassC();
	ClassC cobj1 = new ClassC();
	
	System.out.println("cobj : "+cobj);
	System.out.println("cobj : "+cobj.toString());
	
	System.out.println("cobj1 : "+cobj);
	System.out.println("cobj1 : "+cobj.toString());
 }
}
