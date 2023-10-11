package sunbeam.info;

	import java.lang.Math;
	import java.util.Scanner;

	public class Point2D {

			int x_cords;
			int y_cords;
			
			public Point2D() {
				
			}
			public Point2D(int x_cords, int y_cords) {
				super();
				this.x_cords = x_cords;
				this.y_cords = y_cords;
			}
			public void stringformreturn()
			{
				
			}
			
			public void isEqual( Point2D p1, Point2D p2)
			{
				if((p1.x_cords == p2.x_cords) && (p1.y_cords==p2.y_cords))
				{
					System.out.println("Both points and equal co-ordinates");
					
				}
				else
				{
					calculateDistance(p1, p2);
				}
			}
			public void calculateDistance(Point2D p1, Point2D p2)
			{
				int distance = (int) Math.sqrt( Math.pow((p2.x_cords-p1.x_cords),2.0)+Math.pow(p2.y_cords-p1.y_cords,2.0));
				System.out.println("The distance between p1 and p2 is"+ distance);
			}
			
			public void accept()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter the x co-ordinate");
				this.x_cords= sc.nextInt();
				System.out.println("Please enter the y co-ordinate");
				this.y_cords= sc.nextInt();
			}
			 public void getDetails()
			 {
				 System.out.println("The x co-ordinate is"+this.x_cords);
				 System.out.println("The y co-ordinate is"+this.y_cords);
			 }
			
		
	}


