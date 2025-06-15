package com.controlstatements;

public class ClassC {
	void meth1(int x,int y, int z) 
	{
		if(x>y) 
		{
			if(x>z)
			System.out.println(x+" is biggest");
			  
			else {
		
				System.out.println(z+" is biggest");
			}
		}
		else 
		{
			if(y>z)
			System.out.println(y+" is biggest");
			else
				System.out.println(z+" is biggest");
				
		}
	}
	public static void main(String[] args) {
		ClassC cobj=new ClassC();
		cobj.meth1(61, 20, 60);
		
	}

}
