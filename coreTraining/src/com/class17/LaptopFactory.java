package com.class17;

public class LaptopFactory 
{
	String processer;
	int ram;
	int screenSize;
	
	public LaptopFactory(String laptop_processor, int laptop_ram, int laptop_screenSize)
	{
		processer=laptop_processor;
		ram=laptop_ram;
		screenSize=laptop_screenSize;
	}
	public static void main(String[] args) 
	{
		LaptopFactory lenovo=new LaptopFactory("i5",256,15);
		LaptopFactory dell=new LaptopFactory("i7",512,14);
		
		System.out.println("Lenovo Details: "+lenovo.processer+" "+lenovo.ram+" "+lenovo.screenSize);
		System.out.println("dell Details: "+dell.processer+" "+dell.ram+" "+dell.screenSize);
		
		
	}

}
