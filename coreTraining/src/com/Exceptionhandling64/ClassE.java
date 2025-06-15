package com.Exceptionhandling64;

public class ClassE 
{
double bal=100;
String nam="RAKI";
boolean withDraw(double d)
{
	if(bal-d<=0)
	{
		
		try {
			throw new NegativeNumberException("account balance is less that withdraw amount");
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	else
	{
		this.bal=d;
		return true;
	}
}
public static void main(String[] args) {
	
	new ClassE().withDraw(400);
}

}
