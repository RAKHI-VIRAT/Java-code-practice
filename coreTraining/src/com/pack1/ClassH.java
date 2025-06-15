package com.pack1;

public class ClassH 
{
String mobilename;
String mobiletype;
int ram;
int storage;
int cameras;
int speakers;

	ClassH(String n,String t,int r, int s, int c,int sp)
	{
		mobilename=n;
		mobiletype=t;
		ram=r;
		storage=s;
		cameras=c;
		speakers=sp;
	}
	public static void main(String[] args) 
	{
		System.out.println("Checking the mobile features");
		 ClassH hobj1 =new ClassH("Nokia","keypad",2,12,1,2);
		 
		 System.out.println("mobile 1 type: "+" "+hobj1.mobilename+" "+hobj1.mobiletype+" "+hobj1.ram+" "+hobj1.storage+" "+hobj1.cameras+" "+hobj1.speakers);
		 
		 
		
	}

}
