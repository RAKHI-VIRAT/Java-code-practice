package Jumpsatements40;

public class ClassD //print the tables from 1 to 5
{
 void meth1(int num1,int num2)
 {
	 for(;num1<=5;num1++)
	 {
		 for(int i=1;i<=10;i++)
		 {
			 System.out.println(num1+"*"+i+"="+(num1*i));
		
		 }
		 System.out.println("\n-----------");
	 }
 }
 public static void main(String[] args) 
 {
	new ClassD().meth1(1, 5);
}
}
