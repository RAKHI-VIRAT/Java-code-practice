package Jumpsatements40;

public class ClassA // break statement
{
 void meth1()
 {
	System.out.println("meth1() called"); 
	for(int i=1;i<=10;i++)
	{
		if(i==6)
		{
			//break;
			//continue;
			return;
		}
		System.out.println("i value : "+i);
	}
		System.out.println("Compiler came out from for-loop");
	
 }
 public static void main(String[] args) 
 {
	System.out.println("Start");
	new ClassA().meth1();
	System.out.println("End");
}
}
