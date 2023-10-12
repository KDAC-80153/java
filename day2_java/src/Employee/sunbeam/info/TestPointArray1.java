package Employee.sunbeam.info;

public class TestPointArray1 {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		Point2D p = new Point2D();
		p1.accept();
		System.out.print("First point : ");
		p1.getDetails();
		
		p2.accept();
		System.out.print("Second point : ");
		p2.getDetails();
		
		if (Point2D.isEqual(p1,p2) == true) {
			System.out.println("The points are one and the same.");
		}
		else {
			System.out.println("The points are different.");
		}
		System.out.println("The distance between the points is "+ p.calculateDistance(p1, p2));
	}
}