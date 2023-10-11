package sunbeam.info;

	import java.util.Scanner;

	public class DailyDrivingCostCalculator {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	       
	        System.out.print("Enter total miles driven per day: ");
	        double totalMilesDriven = input.nextDouble();

	        System.out.print("Enter cost per gallon of gasoline: ");
	        double costPerGallon = input.nextDouble();

	        System.out.print("Enter average miles per gallon: ");
	        double averageMilesPerGallon = input.nextDouble();

	        System.out.print("Enter parking fees per day: ");
	        double parkingFeesPerDay = input.nextDouble();

	        System.out.print("Enter tolls per day: ");
	        double tollsPerDay = input.nextDouble();

	   
	        double fuelCost = (totalMilesDriven / averageMilesPerGallon) * costPerGallon;
	        double dailyCost = fuelCost + parkingFeesPerDay + tollsPerDay;

	    
	        System.out.println("Your daily driving cost is: " + dailyCost);

	        input.close();
	    }
}
