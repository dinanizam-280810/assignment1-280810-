
// to createprogram about employee subclass
import java.util.Scanner;

public class employee {

	private int emp_id;
	private String name;
	private double tax_amount;
	private String position;
	private String contactnumber;
	// to answer question 1.2 Pre-Define Class for using Scanner
	Scanner input = new Scanner(System.in);

	// to answer question 1.4 Constructor for using constructor with no-arguments
	employee() {

		employeeid();
		System.out.println("Enter Your Name: ");
		this.name = input.next();
		System.out.println("Enter Your Number Phone: ");
		this.contactnumber = input.next();
		System.out.println("Please Enter Your Position: ");
		this.position = input.next();
		position();
	}

	// to answer question 1.4 Constructor for using constructor with two-arguments
	employee(double tax_amount, double salary) {// overloading with two argument
		Salary();
	}

	// to answer question 1.3 User Define Class for using this method
	public double Salary() { // method for totalnetsalary

		double MonthlySalary, NumberOfDaysWork, TotalSalary, TotalNetSalary;
		int NumberOfDayMonth;
		System.out.print("\nEnter MonthlySalary : ");
		MonthlySalary = input.nextDouble();
		System.out.print("Enter NumberOfDaysWork: ");
		NumberOfDaysWork = input.nextDouble();
		System.out.println("Please enter 30 or 31 only on number of day month");
		System.out.print("Enter NumberOfDayMonth: ");

		NumberOfDayMonth = input.nextInt();

		TotalSalary = (MonthlySalary * NumberOfDaysWork) / NumberOfDayMonth;

		System.out.printf("Your TotalSalary : %.2f\n", TotalSalary);
		TotalNetSalary = TotalSalary - (TotalSalary * tax_amount);

		return TotalNetSalary;

	}

	// to answer question 1.3 User Define Class for using this method
	public void employeeid() {

		System.out.print("\nPlease enter Your id: ");
		this.emp_id = input.nextInt();
	}

	// to answer question 1.3 User Define Class for using this method
	public void position() {

		String a = "cleaner";
		if (this.position == a) {
			System.out.println("You don't  have income tax");
		} else
			System.out.println("You have to pay income tax");

	}

	public Integer getempid() {
		return this.emp_id;
	}

	public String getName() {
		return this.name;
	}

	public String getnumber() {
		return this.contactnumber;
	}

	public String getposition() {

		return this.position;
	}
}
