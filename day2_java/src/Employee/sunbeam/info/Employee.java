package Employee.sunbeam.info;

class Employee1 {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    
    public Employee1(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

  
    public String getFirstName() {
        return firstName;
    }

   
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

   
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for monthly salary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setter for monthly salary with validation
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Method to calculate yearly salary
    public double calculateYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a 10% raise
    public void giveRaise() {
        monthlySalary *= 1.10;
    }
}
public class Employee{
    public static void main(String[] args) {
        // Create two Employee objects
        Employee1 employee1 = new Employee1("Asad", "khan", 5000.0);
        Employee1 employee2 = new Employee1("bhai", "brother", 6000.0);

        // Display yearly salaries
        System.out.println("Yearly Salary for Employee 1: " + employee1.calculateYearlySalary());
        System.out.println("Yearly Salary for Employee 2: " + employee2.calculateYearlySalary());

        // Give a 10% raise to both employees
        employee1.giveRaise();
        employee2.giveRaise();

        // Display yearly salaries after the raise
        System.out.println("\nYearly Salary for Employee 1 (after raise): $" + employee1.calculateYearlySalary());
        System.out.println("Yearly Salary for Employee 2 (after raise): $" + employee2.calculateYearlySalary());
    }
}








