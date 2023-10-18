package sunbeam.info;


	class Displayable {
	    private String content;

	    public Displayable(String content) {
	        this.content = content;
	    }

	    public void show() {
	        System.out.println(content);
	    }

	  
	}

	class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Age: " + age;
	    }

	  
	}

	class Date {
	    private int day;
	    private int month;
	    private int year;

	    public Date(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

	    @Override
	    public String toString() {
	        return day + "/" + month + "/" + year;
	    }

	

	public class Main {

	    public static void printDisplayableBox(Displayable b) {
	        b.show();
	    }

	    public static void printAnyBox(Object b) {
	        System.out.println(b.toString());
	    }

	    public static void main(String[] args) {
	        Displayable displayable = new Displayable("This is a displayable object");
	        Person person = new Person("John Doe", 30);
	        Date date = new Date(18, 10, 2023);

	        printDisplayableBox(displayable);
	        printAnyBox(person);
	        printAnyBox(date);
	    }
	}
}
