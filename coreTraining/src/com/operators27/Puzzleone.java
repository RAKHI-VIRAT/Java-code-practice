package com.operators27;

public class Puzzleone 
{
	 
	    int x;
	    static int y = 5;

	    Puzzleone() {
	        x++;
	        y += 2;
	        System.out.println("x=" + x + " y=" + y);
	    }

	    public static void main(String[] args) {
	        Puzzleone p1 = new Puzzleone(); // x=1, y=7
	        p1.x += ++y;                    // x=1+8=9, y=8
	        Puzzleone p2 = new Puzzleone(); // x=1, y=10
	        int z = --p2.x + p1.x-- + y++;  // z = 0 + 9 + 10 = 19
	        System.out.println("z=" + z);
	        System.out.println("sum=" + (p1.x + p2.x + y + z)); // 8 + 0 + 11 + 19 = 38
	    }
	}



