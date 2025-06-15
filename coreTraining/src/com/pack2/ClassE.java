package com.pack2;

public class ClassE {
 int c;
static int e; //112
ClassE() {
	System.out.println(++c);// 1   c=1   1   C=1   1  c=1   1      c=1   1     c=1
	System.out.println(++e);// 1   e=1   2   e=2   3  e=3   113   e=113  114   e=114
	
	}
	public static void main(String[] args) {
		int a=34;
		int b=21;
		new ClassE().c-=a++ + ++b; //34+22=56  a=35 b=22 c-=a+b ===> .c= (c-(a+b)=(1-(34+22))=1-56=55
		int d=--a + --b + new ClassE().c--; //34+21+1   a=34  b=21 //c=0   d=56
		e=a + +b + +new ClassE().c + d--; //34+21+1+56=112    a=34 b=21 d=55 e=112 //c=1
		int f=-a + b-- + -new ClassE().c - d++;  //-34+21-1-55=-69     a=34 b=20 d=56 f=-69 //c=1
		int sum= a+ b + new ClassE().c + d + e + f; //34+20+1+56+114-69=156
		System.out.println("sum="+ sum);  // a +=x+z  ===> a= a+(x+z)
	}

}
