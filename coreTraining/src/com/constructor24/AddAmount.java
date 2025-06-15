package com.constructor24;

public class AddAmount 
{
	/*
 3) Suppose you have a Bank Account  with an initial amount 
of 500 and you have to add some more amount to it. Create 
a class 'AddAmount' with a data member named 'amount' 
with an initial value of 500. Now make two constructors of 
this class as follows: 
1 - without any parameter - no amount will be added then 
just display your balance with out updating 
2 - having a parameter which is the amount that will be 
added to the account & display the final amount
	 
	 */
	int amount=500;
	AddAmount()
	{
		System.out.println("Balance is "+amount);
	}
	AddAmount(int deposite)
	{
		System.out.println("Updated balance "+(amount+deposite));
	}
	public static void main(String[] args) 
	{
		new AddAmount();
		new AddAmount(500);
		
	}

}
