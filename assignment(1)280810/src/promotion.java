
//this program is to create subclass promotion
import java.util.Scanner;

public class promotion {

	private double normalprice, discount, PriceAfterDiscount, finalprice;
	private String advertisement_id;
	private String type, title, description;
	// to answer question 1.2 Pre-Define Class for using Scanner
	Scanner input = new Scanner(System.in);

	// to answer question 1.4 Constructor for using constructor with one-arguments
	promotion(String advertisement_id) {
		this.advertisement_id = advertisement_id;
		System.out.println("Advertisement ID: " + getadvertisement_id());
	}

	// to answer question 1.4 Constructor for using constructor with no-arguments
	promotion() {
		printpromotion();
	}

//to answer question 1.3 User Define Class for using this method
	public void printpromotion() {

		System.out.println("\nAdvertisement Type: Newspaper");
		System.out.println("Advertisement Title: Popularising batik");
		System.out.println(
				"Advertisement Description: WE do not have to wait for Visit Malaysia Year 2020 to promote local batik, \nnor wait for Thursdays, or for some formal occasions. "
						+ "\nOr wait for our wakil rakyat to adorn it in Parliament, \nperhaps make a drab debate more colourful.");
	}

	// to answer question 1.4 Constructor for using constructor with two-arguments
	promotion(double normalprice, double discount) { // constructor with two argument
		System.out.print("Please Enter the normal price:RM ");
		this.normalprice = input.nextDouble();
		System.out.print("Please Enter discount of product(%): ");
		this.discount = input.nextDouble();
		this.PriceAfterDiscount = (this.normalprice * this.discount) / 100;
		this.finalprice = (this.normalprice - this.PriceAfterDiscount);
	}

	public String getadvertisement_id() {
		return this.advertisement_id;
	}

	public String gettype() {
		return this.type;
	}

	public String gettitle() {
		return this.title;
	}

	public String getdescription() {
		return this.description;
	}

	public double getnormalprice() {
		return this.normalprice;
	}

	public double getPriceAfterDiscount() {

		return this.PriceAfterDiscount;
	}

	public double getfinalPrice() {
		return this.finalprice;
	}
}
