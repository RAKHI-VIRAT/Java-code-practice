package com.practise;

public class ClassD 
{
	 
	    static String value = "abc";

	    public static void changeValue(String a) {
	        String data = a.concat(value);
	        data = value;
	    }

	    public static void main(String[] args) {
	        value = "Java";
	        changeValue(value);
	        System.out.println(value);
	    }
	}


