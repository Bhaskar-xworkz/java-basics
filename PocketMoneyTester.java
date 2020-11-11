package com.xworkz.basics;

public class PocketMoneyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PocketMoneyEstimator.requestPocketMoney(500, "monday");
		PocketMoneyEstimator.requestPocketMoney(800, "tuesday");
		PocketMoneyEstimator.requestPocketMoney(500, "wednesday");


		PocketMoneyEstimator.expenditure(200);	
		PocketMoneyEstimator.expenditure(500);
		
		double amt = PocketMoneyEstimator.getTotalAmount();
		System.out.println("total pocket money: " + amt);
	}

}
