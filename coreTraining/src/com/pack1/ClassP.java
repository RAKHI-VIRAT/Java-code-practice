package com.pack1;

public class ClassP 
{
	/*void meth1(int i)
	{
    if(i<=100);
    System.out.println(i++);
    new ClassP().meth1(1);
    
	}*/
	void meth2(int i) {
		//System.out.println(i);
		
		if(i>100) {
			return;
		//System.out.println(i);
		}
		//System.out.println(i);
		meth2(++i);   //post incre  5
		//System.out.println("-------------");
		//System.out.println(j);
		
	}
	
	void meth4(int i)
	{
		 
		if(i>100)
		{
		return;
		}
		System.out.println(i);
	
		new ClassP().meth4(++i);
		//meth4(++i);
		//ClassP.meth4(++i); //c.e because of non-static variable
		
		
			
		
	}

	
   public static void main(String[] args) 
   {
	ClassP pobj = new ClassP();
	pobj.meth4(1);
   }
}