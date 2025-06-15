package com.Exceptionhandling64;

public class MinimumAccountBalanceException extends Exception
{
	String message;
	 
	MinimumAccountBalanceException(String message)
	{
		this.message=message;
	}
	@Override
	public String toString()
	{
		return message;
	}
}
