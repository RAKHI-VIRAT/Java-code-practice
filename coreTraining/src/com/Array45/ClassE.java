package com.Array45;

import java.util.Arrays;
import java.util.Scanner;

public class ClassE 
{
 Scanner sc=new Scanner(System.in);
 
 public void bookTickets()
 {
	 System.out.println("Welcome to e-Booking");
	 System.out.println("Which movie you want to see??");
	 
	 String movie_name=sc.nextLine();
	 System.out.println("How many tickets you need for "+movie_name);
	// String names[]=new String[sc.nextInt()];
	 String names[]=new String[Integer.parseInt(sc.nextLine())];
	 
	 System.out.println("Please enter "+names.length+" names for ticket booking");
     for(int i=0;i<names.length;i++)
     {
    	 names[i]=sc.nextLine();
     }
     System.out.println(names.length+" tickets were locked for "
    	+Arrays.toString(names));
     
     System.out.println("Please select your seats");
     System.out.println("Enter your seat row between A to Z");
     String row=sc.nextLine();
     
     System.out.println("Select your 1st Seat number between 1 to 30");
     int seat_number=Integer.parseInt(sc.nextLine());
     System.out.println(names.length+" seats were booked for "+movie_name+" movie below are the details");
     
     for(String data:names)
     {
    	 System.out.println(data+" "+row+"-"+seat_number++);
     }
     System.out.println("Thanks you for using our services!!!");
 }
 public static void main(String[] args)
 {
	 ClassE eobj=new ClassE();
	 eobj.bookTickets();
 }
}
