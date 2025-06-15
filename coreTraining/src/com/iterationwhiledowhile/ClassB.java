package com.iterationwhiledowhile;

public class ClassB 
{ 

 void meth1(int i, int j)
	{
		System.out.println("----meth6()----");
		
			while(i<=5)
			{
				while(j>=0)
				{
					
				System.out.println("The i value is "+i++ +" " + j--);
				}
				System.out.println("----------------");
	}
	}
 void meth2(int x, int y)
 {
	 while(x<5)
	 {
		 while(y>0)
		 {
			 System.out.println(x++ +" "+y--);
		 }
	 }
 }
	public static void main(String[] args) 
	{
		new ClassB().meth1(3, 2);
		
		new ClassB().meth2(3, 8);
	}

}
