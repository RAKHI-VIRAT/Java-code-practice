package Jumpsatements40;

public class ClassE //print 1 to 100 with out using for,while loop
{ 
	void meth1(int i)
	{
		
		if(i<=100)
		{
			System.out.println(i);
		
		i++;
		new ClassE().meth1(i);//A method which is calling by it self is called as recursion
		}
		
	}
	
public static void main(String[] args)
{
	new ClassE().meth1(1);
}
}
