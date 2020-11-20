package com.xworkz.brand;

public class VehicleTester {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.color="White";
		vehicle.model="Maestro";
		vehicle.displayInfo();
		System.out.println("--------------------------");
		
		vehicle.model="Yamaha";
		vehicle.color="red";
		vehicle.displayInfo();

		
	}

}
