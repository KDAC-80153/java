package Employee.sunbeam.info;

class Date1 {
    private int month;
    private int day;
    private int year;

    public Date1(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

  
    public int getMonth() {
        return month;
    }

    
    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d%n", month, day, year);
    }
}




public class Date {
    public static void main(String[] args) {
        
        Date1 date = new Date1(8, 10, 2023); 

      
        System.out.print("Date: ");
        date.displayDate();
    }
}