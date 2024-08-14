package com.zoho.dev;
class animals {
	void makesound() {
		System.out.println("animal sound");
	}
	
}
class dog extends animals {
	@Override
	void makesound() {
		System.out.println("bark");
		super.makesound();
		
	}
		
	
}
public class Animal {
public static void main(String[] args) {
	dog mydog = new dog();
	mydog.makesound();
	
}
}
