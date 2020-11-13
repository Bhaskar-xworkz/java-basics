package com.xworkz.online;

public class PhoneDirectory {
	private static long[] mobileNumbers= {9972018356l,7829012246l,8050532131l,9686294556l,8636452117l};
	
	public static void searchPhone(long number) { 
		System.out.println("total users: "+mobileNumbers.length);
			System.out.println("Entered mobile number : "+number);
			
			for(int count=0;count<=mobileNumbers.length;count++){
				
				if(number == mobileNumbers[count]) {
					System.out.println("number found");
					
					break;
				}else {
					System.out.println("number not found");
					break;
				}
			}

}
}