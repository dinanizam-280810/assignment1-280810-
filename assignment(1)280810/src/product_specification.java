
//this program is to create subclass for product specification 
//input by admin
import java.util.Scanner;

public class product_specification {
	private String product_name;
	private String Description;
	private String material;
	private String color;
	private double price;
	private String day;
	private int month;
	private int year;
	// to answer question 1.2 Pre-Define Class for using Scanner
	Scanner input = new Scanner(System.in);

	// to answer question 1.4 Constructor for using constructor with no-arguments
	product_specification() {
		System.out.println("\nEnter The Product Name: ");
		this.product_name = input.nextLine();
		System.out.println("Enter The Description: ");
		this.Description = input.nextLine();
		System.out.println("Enter The material: ");
		this.material = input.nextLine();
		System.out.println("Enter The Color");
		this.material = input.nextLine();
		System.out.println("Enter The Price:RM ");
		this.price = input.nextDouble();
	}

	// to answer question 1.4 Constructor for using constructor with three-arguments
	product_specification(String day, int month, int year) {
		System.out.println("Enter The Day: ");
		this.day = input.nextLine();
		System.out.println("Enter the Month: ");
		this.month = input.nextInt();
		System.out.println("Enter the Year: ");
		this.year = input.nextInt();
	}

	public String getproduct_name() {
		return this.product_name;
	}

	public String getDescription() {
		return this.Description;
	}

	public String getmaterial() {
		return this.material;
	}

	public String getcolor() {
		return this.color;
	}

	public double getprice() {
		return this.price;
	}

	public String getday() {
		return this.day;
	}

	public Integer getmonth() {
		return this.month;

	}

	public Integer getyear() {
		return this.year;
	}
}
