package com.iterationwhiledowhile;

public class ClassA
{
	void meth1(int i)
	{
	System.out.println("----meth1()----");
	
		while(i<=5)
		{
			System.out.println("The i value is "+i);
			i++;
		}
		System.out.println("meth1() execution completed");
	}
	void meth2(int i)
	{
	System.out.println("----meth2()----");
	
		while(i<=15)
		{
			System.out.println("The i value is "+i++);
			i++;
		}
		System.out.println("meth2() execution completed");
	}
	void meth3(int i)
	{
	System.out.println("----meth3()----");
	
		while(i<=15)
		{
			System.out.println("The i value is "+i++ + ++i);
			i++;
		}
		System.out.println("meth3() execution completed");
	}
	void meth4(int i)
	{
	System.out.println("----meth4()----");
	
		while(i<=15)
		{
			System.out.println("The i value is "+i++ +" " + ++i);
			i++;
		}
		System.out.println("meth4() execution completed");
	}
	void meth5(int i)
	{
	System.out.println("----meth5()----");
	
		while(i<=15)
		{
			System.out.println("The i value is "+(i++ + ++i));
			i++;
		}
		System.out.println("meth5() execution completed");
	}
	void meth6(int i,int j)
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
		System.out.println("meth6() execution completed");
	}
		void meth7(int i)
		{
		System.out.println("----meth7()----");
		
			while(i<=5)
				//int a=2;  //c.e
			
				System.out.println("The i value is "+i);
				i++;	
			
			System.out.println("meth7() execution completed");
		}
		void meth8(int i)
		{
		System.out.println("----meth8()----");
		
			while(true)
			{
				System.out.println("The i value is "+i);
				i++;
				break;
			}
			System.out.println("meth8() execution completed");
		
			System.out.println(" Hi "); 
		}
		void meth9(int i)
		{
			System.out.println("----meth9()----");
			do
			{
				System.out.println(i);
				i++;
			}
			while(i<=5);
			System.out.println("meth9() execution completed");
			
		}
		
	
	public static void main(String[] args) 
	{
		ClassA aobj =new ClassA();
		aobj.meth1(2);
		//aobj.meth2(1);
		//aobj.meth3(1);
		//aobj.meth4(1);
		//aobj.meth5(1);
		aobj.meth6(1,6);
		//aobj.meth7(1);
		//aobj.meth8(1);
		//aobj.meth9(10);
		
	}

}
