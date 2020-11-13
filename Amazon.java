package com.xworkz.online;

public class Amazon {
	
	private static String[] items={"Mobiles","Home Decor","Appliances","Electronics","Dresses","Groceries"};
	
	public static void search(String product) {
		System.out.println("total items: "+items.length);
		System.out.println("Entered Product: "+product);
		
		for(int count=0;count<=items.length;count++){
			
			if(product.equals(items[count])) {
				System.out.println("item found");
				
				break;
			}else {
				System.out.println("item not found");
				break;
			}
		}
		
		
		
	}

}
