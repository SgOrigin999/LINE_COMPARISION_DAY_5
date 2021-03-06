package com.bridgelab.linecomparision.day5;

public class LineComparision {
	private double x1, x2, y1, y2, p1, p2, q1, q2;

	public LineComparision(double x1, double x2, double y1, double y2, double p1, double p2, double q1, double q2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.p1 = p1;
		this.p2 = p2;
		this.q1 = q1;
		this.q2 = q2;
	}

	public double calculateLength(double x1, double x2, double y1, double y2) {
		double distance;
		distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		// distance = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		return distance;
	}

	public String checkEqualityOfLine(double x1, double x2, double y1, double y2, double p1, double p2, double q1, double q2) {
		String str = null;
		double distance1, distance2;
		distance1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		distance2 = Math.sqrt(Math.pow((p1 - p2), 2) + Math.pow((q1 - q2), 2));

		Double obj1 = new Double(distance1);
		Double obj2 = new Double(distance2);
		int compareValue = obj1.compareTo(obj2);

		if (compareValue == 0)
			str = " Both Line is Equal";
		else if (compareValue > 0)
			str = "Line1 is greater then Line2";
		else if (compareValue < 0)
			str = "Line1 is less then Line2";
		return str;
	}
	
	public  boolean checkLineEqualOrNot(double x1, double x2, double y1, double y2, double p1, double p2, double q1,
			double q2) {
		double distance1, distance2;
		distance1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		distance2 = Math.sqrt(Math.pow((p1 - p2), 2) + Math.pow((q1 - q2), 2));
		Double obj1 = new Double(distance1);
		Double obj2 = new Double(distance2);
		if (obj1.equals(obj2))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision Computation");
		double x1 = (Math.random() * 7);
		double x2 = (Math.random() * 6);
		double y1 = (Math.random() * 8);
		double y2 = (Math.random() * 10);
		
		double p1 = (Math.random() * 7);
		double p2 = (Math.random() * 6);
		double q1 = (Math.random() * 8);
		double q2 = (Math.random() * 10);
		
		LineComparision line = new LineComparision(x1, x2, y1, y2, p1, p2, q1, q2);
		double totalLength = line.calculateLength(x1, x2, y1, y2);
		System.out.println("Distance Of Line::" + totalLength);
		
		String checkLength = line.checkEqualityOfLine(x1, x2, y1, y2, p1, p2, q1, q2);
		System.out.println("Distance Of Line::" + checkLength);
		boolean checkEquality = line.checkLineEqualOrNot(x1, x2, y1, y2, p1, p2, q1, q2);
		System.out.println("Distance Of Line::" +checkEquality );
		System.out.println("Compare Two Line Line::" +line.compareLineUsingCompareTo() );
	}

	private String compareLineUsingCompareTo() {
		String str = null;
		double distance1, distance2;
		distance1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		distance2 = Math.sqrt(Math.pow((p1 - p2), 2) + Math.pow((q1 - q2), 2));

		Double obj1 = new Double(distance1);
		Double obj2 = new Double(distance2);
		int compareValue = obj1.compareTo(obj2);

		if (compareValue == 0)
			str = " Both Line is Equal";
		else if (compareValue > 0)
			str = "Line1 is greater then Line2";
		else if (compareValue < 0)
			str = "Line1 is less then Line2";
		return str;
	}
}
