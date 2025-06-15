package com.pack3;

public class ClassZ 
{
 public String testMethod()
 {
	 System.out.println(35);
	 return new ClassZ().testMethod3(new ClassZ().testMethod2())+new ClassZ().testMethod4("here");
	 
 }
 public int testMethod2()
 {
	 System.out.println(25);
	 return 25+5;
 }
 public String testMethod3(int a)
 {
	 System.out.println(15);
	 return "is";
 }
 public String testMethod4(String s)
 {
	 System.out.println(45);
	 return "awesome";
 }
 public static void main(String[] args) 
 {
	 ClassZ t=new ClassZ();
	System.out.println("Java "+t.testMethod());
}

}
