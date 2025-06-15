package Jumpsatements40;

public class ClassB //need to print even numbers in between
{
	void meth1(int num1,int num2)
	{
		int count =1;
		for(;num1<= num2;num1++)
		{
			if(num1%2==0)
				System.out.println(num1+ "is even "+"("+count++ +")");
		}
	}
  public static void main(String[] args) 
  {
	new ClassB().meth1(1, 77);
}
}
