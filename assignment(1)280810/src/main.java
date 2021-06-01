import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// to answer question 1.2 Pre-Define Class for using Scanner
		Scanner input = new Scanner(System.in);
		int answer = 0, choose;

// user and admin enter
		BatikCompany log = new BatikCompany();
		log.setCompanyName("DINA BATIK COMPANY");
		log.setAddress("LOT 27,JALAN TEMBIKAI 6");
		log.setPostcode("07000");
		log.setLocation("PANTAI CENANG,LANGKAWI");
		log.setPhoneNumber("0136743110");
		log.setFax("07485678");
		log.setWebsite("www.DinaaBatikCompany.com.my");
		System.out.println("\nCOMPANY INFORMATION");
		System.out.println("Company Name : " + log.getCompanyName());
		System.out.println("Company Address : " + log.getAddress());
		System.out.println("Company PostCode : " + log.getPostcode());
		System.out.println("Company Location : " + log.getLocation());

		System.out.println("Company Contact Number : " + log.getphonenumber());
		System.out.println("Company Fax Number : " + log.getFax());
		System.out.println("Company Website : " + log.getWebsite());

		System.out.println("Welcome.\n1 You're Admin\n2 You're User");
		System.out.println("Enter: ");
		choose = input.nextInt();
		if (choose == 1) {
//admin enter
			// b is object for subclass employee
			employee b = new employee();
			System.out.println("\nYour ID: " + b.getempid());
			System.out.println("Your Name: " + b.getName());
			System.out.println("Your Number Phone: " + b.getnumber());
			System.out.println("Position: " + b.getposition());
			System.out.printf("Your Total Net Salary:RM %.2f", b.Salary());
//admin enter
			finance f = new finance();
			System.out.printf("Total Revenue:RM %.2f", f.getTotalrevenue());

			System.out.printf("\nQuantity Sold:RM %.2f", f.getQuantitySold());

			System.out.printf("\nPrice Take:RM %.2f", f.getpricetake());

			System.out.printf("\nCost Of Good Solds:RM %.2f", f.getCostofGoodSolds());

			System.out.printf("\nProfit Margin:RM %.2f", f.getProfitMargin());
			System.out.printf("\nPercentage Loss:RM %.2f", f.getPercentageLoss());
//admin enter
			product_specification p = new product_specification();
			product_specification p1 = new product_specification("Monday", 1, 2);
			System.out.println("Product name: " + p.getproduct_name());

			System.out.println("Product Description: " + p.getDescription());

			System.out.println("Product Material: " + p.getmaterial());

			System.out.println("Product Color: " + p.getcolor());

			System.out.println("Product Price: " + p.getprice());
			System.out.println("Day: " + p1.getday());

			System.out.println("Month: " + p1.getmonth());

			System.out.println("Year: " + p1.getyear());

		}

		if (choose == 2) {
// user enter
// a1, a2, a is object for object class
			promotion a1 = new promotion("2994");
			promotion a2 = new promotion();

			promotion a = new promotion(1, 2);
			a1.getadvertisement_id();

			System.out.printf("Normal Price:RM %.2f\n", a.getnormalprice());
			System.out.printf("Discount:RM %.2f\n", a.getPriceAfterDiscount());
			System.out.printf("New Price:RM %.2f", a.getfinalPrice());
//user enter
			feedback c = new feedback(); // c is object for subclass feedback
			System.out.println("Your name: " + c.getfeedback_name());
			System.out.println("Title: " + c.getfeedback_title());
			System.out.println("Comment: " + c.getfeedback_comment());
			System.out.println("Rating: ");
			c.rating();

		} else {
			System.out.println("ERROR");
		}
		while (answer == 1 & answer == 2) {
			System.out.println("\nDo you want to continue..\n1 continue\n2 log out");
			answer = input.nextInt();
			System.out.println("Welcome.\n1 You're Admin\n2 You're User");
			System.out.println("Enter: ");
			choose = input.nextInt();
			if (choose == 1) {
//admin enter
				// b is object for subclass employee
				employee b = new employee();
				System.out.println("\nYour ID: " + b.getempid());
				System.out.println("Your Name: " + b.getName());
				System.out.println("Your Number Phone: " + b.getnumber());
				System.out.println("Position: " + b.getposition());
				System.out.printf("Your Total Net Salary:RM %.2f", b.Salary());
//admin enter
				finance f = new finance();
				System.out.printf("Total Revenue:RM %.2f", f.getTotalrevenue());

				System.out.printf("\nQuantity Sold:RM %.2f", f.getQuantitySold());

				System.out.printf("\nPrice Take:RM %.2f", f.getpricetake());

				System.out.printf("\nCost Of Good Solds:RM %.2f", f.getCostofGoodSolds());

				System.out.printf("\nProfit Margin:RM %.2f", f.getProfitMargin());
				System.out.printf("\nPercentage Loss:RM %.2f", f.getPercentageLoss());
//admin enter
				product_specification p = new product_specification();
				product_specification p1 = new product_specification("Monday", 1, 2);
				System.out.println("Product name: " + p.getproduct_name());

				System.out.println("Product Description: " + p.getDescription());

				System.out.println("Product Material: " + p.getmaterial());

				System.out.println("Product Color: " + p.getcolor());

				System.out.println("Product Price: " + p.getprice());
				System.out.println("Day: " + p1.getday());

				System.out.println("Month: " + p1.getmonth());

				System.out.println("Year: " + p1.getyear());

			}

			if (choose == 2) {
// user enter
// a1, a2, a is object for object class
				promotion a1 = new promotion("2994");
				promotion a2 = new promotion();

				promotion a = new promotion(1, 2);
				a1.getadvertisement_id();

				System.out.printf("Normal Price:RM %.2f\n", a.getnormalprice());
				System.out.printf("Discount:RM %.2f\n", a.getPriceAfterDiscount());
				System.out.printf("New Price:RM %.2f", a.getfinalPrice());
//user enter
				feedback c = new feedback(); // c is object for subclass feedback
				System.out.println("Your name: " + c.getfeedback_name());
				System.out.println("Title: " + c.getfeedback_title());
				System.out.println("Comment: " + c.getfeedback_comment());
				System.out.println("Rating: ");
				c.rating();

			} else {
				System.out.println("ERROR");

			}
		}

	}
}
