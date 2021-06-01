//this program is to create subclass for feedback from user
import java.util.Scanner;

public class feedback {
	private String feedback_name;
	private String feedback_title;
	private String feedback_comment;
	private int feedback_rating;
	// to answer question 1.2 Pre-Define Class for using Scanner
	Scanner input = new Scanner(System.in);

// to answer question 1.4 Constructor for using constructor with no-arguments
	feedback() {

		System.out.println("\nPlease Enter Your Name: ");
		this.feedback_name = input.nextLine();
		System.out.println("Please Enter Your Feedback Title:");
		this.feedback_title = input.nextLine();
		System.out.println("Enter Your comment:");
		this.feedback_comment = input.nextLine();
		System.out.println("Enter Your rating:\nRate:1-3");
		this.feedback_rating = input.nextInt();
		rating();

	}

	// to answer question 1.3 User Define Class for using this method
	// method for feedback rating
	public void rating() {
		if (this.feedback_rating == 1) {
			System.out.println("WORST");
			System.out.println("Thank You");
		} else if (this.feedback_rating == 2) {
			System.out.println("moderate");
			System.out.println("Thank You");
		} else if (this.feedback_rating == 3) {
			System.out.println("Excellent");
			System.out.println("Thank You");
		} else
			System.out.println("ERROR");

	}

	public String getfeedback_name() {
		return this.feedback_name;
	}

	public String getfeedback_title() {
		return this.feedback_title;
	}

	public String getfeedback_comment() {
		return this.feedback_comment;
	}

	public Integer getfeedback_rating() {
		return this.feedback_rating;
	}

}
