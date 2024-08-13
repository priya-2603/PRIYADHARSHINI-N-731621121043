package oops.com;


class y {
	 y () {
		System.out.println("A");
	}
	y (int a) {
		System.out.println("A 1");
	}
}
class z extends y {
	z () {
		super(5);
		System.out.println("B");
	}
	z(int a) {
		System.out.println("B 1");
	}
}
public class constructor {
	public static void main(String[] args) {
		z b = new z (5);
	}

}
