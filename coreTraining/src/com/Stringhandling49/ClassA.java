package com.Stringhandling49;

class ClassA 
{
 void meth1()
 {
	 System.out.println("Implementing String Handling\n");
     String s1="Java";
     String s2=new String("Java");
     char arr[]= {'j','a','v','a'};
     String s3=new String(arr);
     String s4=new String(arr,2,1);//2-index position,1-element
     String s5=new String(arr,0,3);//0-index position,3-elements
     
     System.out.println("s1 : "+s1+"("+s1.length()+")");
     System.out.println("s2 : "+s2+"("+s2.length()+")");
     System.out.println("s3 : "+s3+"("+s3.length()+")");
     System.out.println("s4 : "+s4+"("+s4.length()+")");
     System.out.println("s5 : "+s5+"("+s5.length()+")");
 }
 void meth2()
 {
	 System.out.println("String which were created by using String Class are Immutable\n");
     String s="Java";
	 System.out.println("Before s : "+s);
	 System.out.println(s.concat(" is awesome"));
	 
	 s=s.concat(" is awesome");
	 System.out.println("After s : "+s);
 }

public static void main(String[] args) 
{
	ClassA aobj=new ClassA();
	aobj.meth1();
	aobj.meth2();
}
}
