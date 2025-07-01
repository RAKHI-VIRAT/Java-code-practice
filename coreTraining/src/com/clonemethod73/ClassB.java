package com.clonemethod73;

public class ClassB implements Cloneable//classA ClassC
{
 int a=111;
 int b=222;
 
 ClassB createClone() throws CloneNotSupportedException
 {
	 ClassB obj=(ClassB)super.clone();
	 return obj;
 }
}
