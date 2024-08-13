package oops.com;

// super keyword in java
class A {
	int a = 10;
	A(String name){
		System.out.println("welcome "+name);
	}
	void mymethod1() {
		System.out.println("i am a super class method");
	}
}

class B extends A {
	B () {
		super("priya");
	}
	void mymethod2() {
		System.out.println("super class variable: "+ super.a);
	super.mymethod1();
	}
}

public class Superkeyword {
	public static void main(String[] args) {
		B b = new B();
		b.mymethod2();
	}

}
