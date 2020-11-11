package com.xworkz.basics;

public class CreditCardEstimator {
	private static double totalCreditCardAmount=1000;
	
	public static void expenditure(double amount) {
		System.out.println("you are going to spend: "+amount);
		if ((amount<=0||amount>1000) || (totalCreditCardAmount>1000)) {
			System.out.println("you dont have a amount in your credit card");
			System.out.println("credit card limit is: "+totalCreditCardAmount);			
		}
			else {
				totalCreditCardAmount=totalCreditCardAmount-amount;
				System.out.println("Remaining amount: "+totalCreditCardAmount);
			}
		}
}
