package com.xworkz.basics;


public class PocketMoneyEstimator {
	private static double totalAmount;
	public static void requestPocketMoney(double amount,String day) {
		System.out.println("requested amount :"+amount);
		System.out.println("Day :" + day);
		totalAmount = totalAmount+amount;
		System.out.println("total amount :"+ totalAmount);
		
	}
	public static void expenditure(double amount) {
		System.out.println("Spendings :" +amount);
		totalAmount = totalAmount-amount;
		System.out.println("remaining amount :"+ totalAmount);

	}
	
	public static double getTotalAmount() {
		
		return totalAmount;
	}

}
