package com.zoho.dev;

class Animals1{
	void move() {
		System.out.println("cheetha");
	}
}
class Cheetah extends Animals1 {
	@Override
	void move() {
		System.out.println("Cheetah runs fast");
		super.move();
	}
}
public class animalwild {
	public static void main(String[] args) {
		Cheetah wild = new Cheetah();
		wild.move();
	}

}
