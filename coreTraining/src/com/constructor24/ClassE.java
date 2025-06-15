package com.constructor24;

public class ClassE 
{
	String mobileName;
	String mobileType;
	String networkType;
	
	int ram;
	int storage;
	int camera;
	int speakers;
	
	static String store="croma";
	
	public ClassE(String mname, String mtype, String net, int ram1, int sto, int cam, int spk )
	{
		mobileName=mname;
		mobileType=mtype;
		networkType=net;
		ram=ram1;
		storage=sto;
		camera=cam;
		speakers=spk;
		
	}
	public static void main(String[] args)
	{
		ClassE aobj1=new ClassE("Nokia","Keypad","2G",2,10,1,1);
		ClassE aobj2=new ClassE("Samsung","smart","4G",4,128,3,2);
		ClassE aobj3=new ClassE("MI","smart","5G",16,256,3,2);
		
		System.out.println("aobj1 data "+aobj1.mobileName+" "+aobj1.mobileType+" "+aobj1.networkType+" "+aobj1.ram+" "+aobj1.storage+" "+aobj1.camera+" "+aobj1.speakers+" "+ClassE.store);
		
	}
	

}
