package com.bridgelabz.Line_Comparison;

public class Line_Comparison {

	
	    public static void main(String[] args) {

	        double x1 = 1;
	        double y1 = 1;

	        double x2 = 5;
	        double y2 = 5;

	        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

	        System.out.println("Distance between two points :" + distance);
	        Line_Comparison a1 = new Line_Comparison();
	        Line_Comparison a3 = new Line_Comparison();
	        Line_Comparison a4 = new Line_Comparison();

	        System.out.println(a1.equals(a3));
	        System.out.println(a3.equals(a1));
	    }
	}


