package com.bridgelab.linecomparision.day5;

public class LineComparision {
	public double calculateLength(double x1, double x2, double y1, double y2) {
		double distance;
		distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		// distance = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		return distance;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision Computation");
		double x1 = (Math.random() * 7);
		double x2 = (Math.random() * 6);
		double y1 = (Math.random() * 8);
		double y2 = (Math.random() * 10);
		LineComparision line = new LineComparision();
		double totalLength = line.calculateLength(x1, x2, y1, y2);
		System.out.println("Distance Of Line::" + totalLength);
	}
}
