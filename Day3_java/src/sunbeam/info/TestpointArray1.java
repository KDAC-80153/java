package sunbeam.info;

	import java.util.Scanner;

	public class TestpointArray1 {
		static int menu()
		{
			int choice;
			System.out.println("1.Display Details of specific point");
			System.out.println("2.Display x and y co-ordinates of all the points");
			System.out.println("3.Display Distnace Between two points");
			System.out.println("4.Exit ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			return choice;
		}

		public static void main(String[] args) {
			
			System.out.println("Please enter How points to store");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			Point2D[] points = new Point2D[size];
			
			for(int i=0 ;i< size;i++)
				points[i]=new Point2D();
			
			for(int i=0 ;i< size;i++)
				points[i].accept();
			int choice;
			while((choice = menu())!=4)
			{
			switch (choice) {
			case 1:
			{
				System.out.println("The enter index of point which co-ordinate you wish to view");
				int x = sc.nextInt();
				points[x].getDetails();
				
				break;
			}
			case 2:
			{

				for(int i=0 ;i< size;i++) {
					System.out.println("The co-ordinates for "+ i +" are ");
						points[i].getDetails();
				}
			}
						
			case 3:
				{
					System.out.println("Enter the index of starting point and ending point");
				int z= sc.nextInt();
				int y=sc.nextInt();
				
				if((z> 0 && z < size-1) && (y>0 && y<size -1))
					points[0].isEqual(points[z],points[y]);
				
					
				break;
				}
				
				

			default:
				System.out.println("Wrong Choice......");
				break;
			}
		}
			System.out.println("Thank for using this app.......");
			
	}
			
	}


