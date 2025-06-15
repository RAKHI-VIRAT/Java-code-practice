package com.static29;

public class BankAccount 
{
	static String bankName="HDFC";
	String accountHolderName;
	int balance;
	
	BankAccount(String name,int bal)
	{
		accountHolderName=name;
		balance=bal;
	}
	void displayAccountInfo()
	{
		System.out.println("bankName "+BankAccount.bankName+" "+"name "+accountHolderName+" "+"balance "+balance);
	}
	public static void main(String[] args) 
	{
		
		BankAccount aobj=new BankAccount("rak",500);
		aobj.displayAccountInfo();
		setBankName("Union");
		
	}
	static void setBankName(String name)
	{
		bankName=name; 
		System.out.println(name);
	}
	static
	{
		bankName="Default Bank";
		System.out.println("Bank name "+bankName);
	}
	
}
