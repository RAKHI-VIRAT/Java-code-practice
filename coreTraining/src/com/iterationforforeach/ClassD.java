package com.iterationforforeach;

//write a program on 3 for loops one inside the other
public class ClassD 
{
	void meth1(int i)  //initialization;condition;operator
	{
		for(;i<5;)
		{
			int z=1;
			System.out.println("i value is "+i++);
			int j;
			for(j=3;j<5;j++)
			{
				System.out.println("j value is "+j);
				for(;z<3;)
				{
					System.out.println("z value is "+z);
					z++;
					
				}
				System.out.println("z execution completed");
				System.out.println("-----");
			}
			System.out.println("j execution completed");
			System.out.println("**********");
		}
		System.out.println("meth1 execution completed");
	}
 public static void main(String[] args) 
 {
	ClassD dobj= new ClassD();
	dobj.meth1(2);
	
}

}
/*if we are having 3 for loops one inside the other
 for example A,B and C
 first A loop one statement will execute and moves to B loop one statement
 then moves to C loop it will complete all statements in C loop then moves to
 B loop after completing of B-loop then moves to A-loop and execute next statements
 then it will repeats again all loops until A loops conditions fails
 */
