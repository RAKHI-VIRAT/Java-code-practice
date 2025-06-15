package com.wapperclass33;

public class ClassB 
{
	void meth1()
	{
		System.out.println("Performing Auto-Boxing");
		
		int i=10;
		Integer ival1=i; //1st way
		Integer ival2=new Integer(i); //2nd way
		Integer ival3=Integer.valueOf(i); //3rd way
		
		System.out.println("\nint PDT i : "+i);
		System.out.println("Integer wapperclassobject ival1 : "+ival1);
		System.out.println("Integer wapperclassobject ival2 : "+ival2);
		System.out.println("Integer wapperclassobject ival3 : "+ival3);
		
		boolean flag=true;
		Boolean booleanval=Boolean.valueOf(flag);
		System.out.println("\nboolean PDT flag : "+flag);
		System.out.println("Boolean wapperclassobject booleanval : "+booleanval);
		
		float f=10.9f;
		Float fval=new Float(f);
		System.out.println("\nfloat PDT f : "+f);
		System.out.println("Float wco fval : "+fval);
		
	}
	void meth2()
	{
		System.out.println("Implemeting Auto-Unboxing");
		Integer ival=500;
		Integer ival1=Integer.valueOf(500);
		Integer ival2=new Integer(500);
		
		int i1=ival; // 1st way
		int i2=ival.intValue();// 2nd way
		System.out.println("\nInteger WCO ival: "+ival);
		System.out.println("int PDT i1 : "+i1);
		System.out.println("int PDT i2 : "+i2);
		
		Byte bval=new Byte((byte)10);
		byte b1=bval.byteValue();
		System.out.println("\nByte WCO bval : "+bval);
		System.out.println("byte PDT b1 : "+b1);
		
	}
	void meth3()
	{
		System.out.println("meth3() called");
		String s1="10";
		//String s1="Java";
		//int i=s1+90; //C.E because we cant perform addition with String & int
		int i=Integer.parseInt(s1)+90;
		System.out.println(" i value : "+i);
		
		byte b=Byte.parseByte(s1);
		System.out.println("b vaule : "+b);
		
		short s=Short.parseShort(s1);
		System.out.println("s value : "+s);
		
		long l=Long.parseLong(s1);
		System.out.println("l value : "+l);
		
		float f=Float.parseFloat(s1);
		System.out.println("f value : "+f);
		
		double d=Double.parseDouble(s1);
		System.out.println("d value : "+d);
		
		//char c=Character.parseCharacter(s1);//C.E
		
		boolean flag=Boolean.parseBoolean(s1);
		System.out.println("flag value : "+flag);
		
		System.out.println("Byte range is : "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
		
		 
	}
	public static void main(String[] args) 
	{
		ClassB bobj=new ClassB();
		//bobj.meth1();
		//bobj.meth2();
		bobj.meth3();
	}

}
