package Lab_1;

public class SavingsAccount {
	
	public double annualInterestRate = .02;
	public double savingsBalance;
	
	private double calculateMonthlyInterest() {
		return (savingsBalance * annualInterestRate) / 12;
	}

	public void modifyInterestRate (double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public void modifySavingsBalance() {
		savingsBalance += calculateMonthlyInterest();
	}
	
}