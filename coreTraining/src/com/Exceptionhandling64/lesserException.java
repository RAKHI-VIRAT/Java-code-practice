package com.Exceptionhandling64;

public class lesserException extends Exception
{
	String message;
	public lesserException(String message)
	{
		this.message=message;
	}
	@Override
	public String toString()
	{
		return message;
	}
	

}
