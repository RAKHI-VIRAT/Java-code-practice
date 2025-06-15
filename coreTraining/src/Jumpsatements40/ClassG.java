package Jumpsatements40;

public class ClassG //write a factorial of a number using for loop
//n!=n*(n-1)*(n-2)*----2*1
{
 void meth1(int n)
 {
	 int fac=1;
	 for(int i=1;i<=n;i++)
	 { 
		 fac=fac*i;

	 }
	 System.out.println(fac);
 }
 public static void main(String[] args) 
 {
	ClassG gobj=new ClassG();
	gobj.meth1(5);
}
}
