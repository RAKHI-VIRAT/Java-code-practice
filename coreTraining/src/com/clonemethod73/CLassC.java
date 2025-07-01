package com.clonemethod73;

public class CLassC //classA classB
{
 public static void main(String[] args) throws Exception
 {
	System.out.println("Implementing Object Cloning\n");
     ClassA aobj1 =new ClassA();
     System.out.println("aobj1 : "+aobj1.x+" "+aobj1.y);

     ClassA aobj2=aobj1;
     aobj2.y=100;
     System.out.println("aobj1 : "+aobj1.x+" "+aobj1.y+" "+aobj2.y);

     ClassB bobj1 =new ClassB();
     System.out.println("bobj1 : "+bobj1.a+" "+bobj1.b);

     ClassB bobj2 =bobj1.createClone();
     bobj2.b=1000;
     System.out.println("bobj1 : "+bobj1.a+" "+bobj1.b+" "+bobj2.b);


 }
}
