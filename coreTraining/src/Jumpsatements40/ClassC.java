package Jumpsatements40;

public class ClassC //print 2 table
{
 void meth1(int num1)
 {
	 System.out.println("2 table as given below");
	 for(int i=1;i<=10;i++)
	 {
		 System.out.println(num1+"*"+i+"="+(num1*i));
	 }
 }
 public static void main(String[] args) 
 {
	new ClassC().meth1(3);
}
}
