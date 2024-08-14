package com.zoho.dev;

import java.util.*;

class shapes {
	double getarea() {
		return 0;
	}
}
class rectangle extends shapes {
	private double width;
	private double height;
	public rectangle (double width,double height ) {
		this.width=width;
		this.height=height;
	}
	
	@Override
	double getarea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	}

public class Shape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of width: ");
		double width = sc.nextInt();
		System.out.println("enter the value of height: ");
		double height = sc.nextInt();
		
		rectangle myrec =  new rectangle (width,height);
		
		System.out.println("area of rectangle:" + myrec.getarea());
		
		
	}

}
