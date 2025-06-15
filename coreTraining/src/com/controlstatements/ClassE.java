package com.controlstatements;

public class ClassE {
	void bill(int units) {
		System.out.println(" welcome to CHARAN TEJA mart");
		int finalbill=units*100;
		if(finalbill >= 1000) {
			int discount=(finalbill*10)/100;
			System.out.println("your shopping bill is : "+finalbill);
			System.out.println("your shopping bill: "+finalbill+" is greater than 1000, you will get an discount of : "+discount);
			System.out.println("congratulations!!! you have saved "+discount);
			System.out.println("you need to pay final bill as "+(finalbill-discount));
			System.out.println("Thank you for shoping visit again");
		}
		else {
		System.out.println("your final bill is : "+finalbill);
		System.out.println("you need to shop more "+(1000-finalbill)+" to get an discount 10%");
	}
	}
	public static void main(String[] args) {
		ClassE eobj=new ClassE();
		eobj.bill(1);
		
	}
		 

}
