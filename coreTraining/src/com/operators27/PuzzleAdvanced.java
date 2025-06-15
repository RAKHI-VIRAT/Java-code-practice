package com.operators27;

public class PuzzleAdvanced 
{
	 
	    int x = 10;
	    static int y = 20;

	    {
	        x += 5;
	        y += 10;
	    }

	    static {
	        y += 5;
	    }

	    PuzzleAdvanced() {
	        x += ++y;
	        y += x++;
	    }

	    public static void main(String[] args) {
	        PuzzleAdvanced p1 = new PuzzleAdvanced();
	        PuzzleAdvanced p2 = new PuzzleAdvanced();

	        int result = --p1.x + p2.x++ + y++ - p1.x-- + ++y;
	        System.out.println("Result = " + result);
	        System.out.println("Final x(p1): " + p1.x + ", x(p2): " + p2.x + ", y: " + y);
	    }
	}



