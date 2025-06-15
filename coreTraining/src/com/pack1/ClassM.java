package com.pack1;

public class ClassM 
{
	void meth1()
	{
		int a = 34;    
		int b = 21;
		int c = a++ + ++b;  //c=34+22=56              a=35  b=22 c=56
		System.out.println(c);  //56
		int d = --a + --b + c--;  //34+21+56=111       a=34  b=21 c=55 d=111
		System.out.println(d);
		int e = a + +b + +c + d--; //34+21+55+111=221  a=34  b=21 c=55 d=110 e=221
		System.out.println(e);
		System.out.println("---");
		
		int f = -a + b-- + -c - d++; //-34+21-55-110 =-178   a=34 b=20 c=55 d=111 e=221 f=-178
		System.out.println(f);
		int sum = a + b + c + d + e + f; // 34+20+55+111+221-178=263
		System.out.println("sum = " + sum);
	}
	public static void main(String[] args) 
	{
		new ClassM().meth1();
	}

}
