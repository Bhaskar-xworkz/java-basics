package com.xworkz.gadget;

public class Mobile {
	public String brand;
	public short ram;
	public float screenSize;
	public String os;
	public static String avalaibility="yes";
	
	public void displaySpecs() {
		System.out.println("Brand: "+brand);
		System.out.println("RAM: "+ram+"GB");
		System.out.println("Screen Size: "+screenSize+" inches");
		System.out.println("Operating system: "+os);
		System.out.println("avalaibility in india: "+avalaibility);
		
	}
	

}
