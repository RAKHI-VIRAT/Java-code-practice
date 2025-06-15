package com.pack2;

public class BankAccount {
	
	
	static String bankName = "HDFC";
	String accountHolderName;
	int balance=400000;
	BankAccount(String num, int bal)
	{
		accountHolderName=num;
		balance=bal;
	
	}
	void displayAccountInfo()
	{
		System.out.println("name of holder: "+accountHolderName+" "+"balance: "+balance+" "+"bankname: "+bankName);
	}
	static void setBankName(String name)
	{
		bankName =name;

		System.out.println("name of holder: "+new BankAccount("MANU",300004).accountHolderName+" "+ "balance: "+new BankAccount("radi",30001).balance +" "+"bankname: "+bankName);
		 
		
	}
	static
	{
		bankName="Default Bank";
		System.out.println(bankName);
		
	} 
	public static void main(String[] args) {
		//new BankAccount("raki",100).displayAccountInfo();
	BankAccount	bobj1=new BankAccount("raki",100);
	bobj1.displayAccountInfo();
	System.out.println("--------\n");

	BankAccount.setBankName("ABN");//static method calling by Class Name
	//setBankName("ABN");//identifier name
	//new BankAccount("hi",5).setBankName("ABN");//by using class object
	}
	
}
