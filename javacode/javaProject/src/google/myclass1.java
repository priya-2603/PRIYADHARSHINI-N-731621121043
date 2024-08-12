package google;

// types of variables in java

public class myclass1 {
	int b = 20;
	static int c = 30;
	public static void main(String [] args) {
		int a = 10;// local variables
		System.out.println("local variable :" +a);
		
		myclass1 obj = new myclass1();
		System.out.println(obj.b);
		System.out.println(myclass1.c);
		
	}

}
