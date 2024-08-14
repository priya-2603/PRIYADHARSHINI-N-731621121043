package com.zoho.dev;
class vehicle {
	void drive() {
		System.out.println("drives a car");
	}
}
class car extends vehicle {
	@Override
	void drive() {
		System.out.println("repairing a car");
		super.drive();
	}
	
}

public class Vehicles {
	public static void main(String[] args) {
		car mycar = new car();
		mycar.drive();
		
		
	}

}
