package com.pack2;

public class ClassC 
{
	protected void finalize()
	{
		System.out.println("garbae collector called");
	}
	void meth1()
	{
		System.out.println("unique id.no (public int hashCode(): "+hashCode());
		
System.out.println("difference location address (public boolean equals(object)"+new ClassC().equals(new ClassC()));
	System.out.println("FULLY QUALIFIED CLASS NAME(public final Class getClass()):" +getClass ());
	System.out.println("class object to string(public StringtoSting()): "+toString());
	//null =meth1();
   System.gc();

	
	
	}
	
	public static void main(String[] args) 
	{
		ClassC cobj= new ClassC();
		cobj.meth1();
		
	}

}
