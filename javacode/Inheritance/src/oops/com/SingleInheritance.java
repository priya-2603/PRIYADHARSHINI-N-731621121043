package oops.com;

//single inheritance

class Vehicle {
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}
class TwoWheeler extends Vehicle {
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheeler {
	void brandname () {
		System.out.println("Brand name is Honda");
	}
}
class Scooty extends TwoWheeler {
	void brandName() {
		System.out.println("Brand Name is Activa");
	}
}

public class SingleInheritance {
public static void main(String[] args) {
	Bike bike = new Bike();
	bike.noOfEngine();
	bike.noOfWheels();
	bike.brandname();
	
	Scooty scooty = new Scooty();
	scooty.brandName();
	scooty.noOfEngine();
	scooty.noOfWheels();
}
}
