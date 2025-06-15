package Jumpsatements40;

public class ClassF // sum of 1 to 100 natural numbers
{
	//instanc var  //global var
	int sum=0;  //inst
	//static int sum1=0;
	void meth1()
	{
		//local var
		int sum2=0;
		for(int i=1;i<=100;i++)
		{
			//sum+=i;
			//sum1=sum1+i;
			sum2=sum2+i;
		}
		System.out.println(sum2);
		
			
	}
	public static void main(String[] args) 
	{
	ClassF ref=	new ClassF();
	ref.meth1();
	//System.out.println(ref.sum);
	//System.out.println(sum1);
		
	}
 
}
