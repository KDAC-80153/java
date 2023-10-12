package Employee.sunbeam.info;

import java.lang.Math;
import java.util.Scanner;

public class Point2D {
	double  x_axis;
	double y_axis;

	public Point2D () {
		this.x_axis = 0.0;
		this.y_axis = 0.0;
	}

	public Point2D(double x_axis, double y_axis) {
		this.x_axis = x_axis;
		this.y_axis = y_axis;
	}

	public double getX_axis() {
		return x_axis;
	}

	public void setX_axis(int x_axis) {
		this.x_axis = x_axis;
	}

	public double getY_axis() {
		return y_axis;
	}

	public void setY_axis(double y_axis) {
		this.y_axis = y_axis;
	}
	
	public void getDetails() {
		System.out.println("x-axis = " + this.x_axis + " and y-axis = " + this.y_axis);
	}
	
	public double calculateDistance(Point2D p1, Point2D p2) {
		return Math.sqrt(Math.pow((p2.x_axis-p1.x_axis),2) + Math.pow((p2.y_axis-p1.y_axis),2));
	}
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the x co-ordinate : ");
		this.x_axis = scanner.nextDouble();
		System.out.print("Enter the y co-ordinate : ");
		this.y_axis = scanner.nextDouble();
	}
		
	public static boolean isEqual(Point2D p1, Point2D p2) {
		boolean a = (p1.y_axis == p2.y_axis) && (p1.x_axis == p2.x_axis);
		return a;
	}
}