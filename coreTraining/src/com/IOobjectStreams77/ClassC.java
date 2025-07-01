package com.IOobjectStreams77;//class A classB
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class ClassC 
{
public static void main(String[] args) throws Exception
{
	System.out.println("Implementing Object Streams\n");
	
	ClassA aobj1=new ClassA();
	ClassB bobj1=new ClassB();
	
	System.out.println("aobj1 : "+aobj1.a+" "+aobj1.b);
	System.out.println("bobj1 : "+bobj1.x+" "+bobj1.y);
	
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("F:\\prac\\f1.ser"));
    System.out.println("\nConnectios created");
    
    oos.writeObject(aobj1);
    oos.writeObject(bobj1);
    
    System.out.println("serilization completed");
    oos.close();
    
   ObjectInputStream ois= new ObjectInputStream(new FileInputStream("F:\\\\prac\\\\f1.ser"));
   System.out.println("\nconnection created");
   
   ClassA aobj2=(ClassA)ois.readObject();
   ClassB bobj2=(ClassB)ois.readObject();
   
   System.out.println("aobj2 : "+aobj2.a+" "+aobj2.b);
   System.out.println("bobj2 : "+bobj2.x+" "+bobj2.y);
   
   ois.close();
}

}
