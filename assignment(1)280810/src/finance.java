
//this program is to create subclass for finance
import java.util.Scanner;

public class finance {
	private double Totalrevenue, CostOfGoodSolds;
	private double QuantitySold, pricetake;
	private double ProfitMargin, PercentageLoss;
//to answer question 1.2 Pre-Define Class for using Scanner
	Scanner input = new Scanner(System.in);

//to answer question 1.4 Constructor for using constructor with no-arguments
	finance() {

//total revenue per month
		System.out.println("\nReminder enter revenue per month");
		System.out.println("Enter the Quantity Sold: ");
		this.QuantitySold = input.nextDouble();
		System.out.println("Enter the Pricetake: ");
		this.pricetake = input.nextDouble();

		this.Totalrevenue = this.QuantitySold * this.pricetake;
		System.out.println("Enter the Cost Of Good Solds: ");
		this.CostOfGoodSolds = input.nextDouble();
//to calculate the profit margin for month
		this.ProfitMargin = ((this.Totalrevenue - this.CostOfGoodSolds) / this.Totalrevenue) * 100;

//to calculate the percentage loss
		this.PercentageLoss = ((this.Totalrevenue - this.CostOfGoodSolds) / this.CostOfGoodSolds) * 100;

	}

	public Double getTotalrevenue() {
		return this.Totalrevenue;
	}

	public Double getQuantitySold() {
		return this.QuantitySold;
	}

	public Double getpricetake() {
		return this.pricetake;
	}

	public Double getCostofGoodSolds() {
		return this.CostOfGoodSolds;
	}

	public Double getProfitMargin() {
		return this.ProfitMargin;
	}

	public Double getPercentageLoss() {
		return this.PercentageLoss;
	}

}