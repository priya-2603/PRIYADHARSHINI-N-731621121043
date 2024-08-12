package google;
// types of methods in java
public class myclass3 {
	void myMethod1 () {
		System.out.println("instance method");
	}
	static void myMethod2 () {
		System.out.println("static method");
	}
 public static void main (String [] args) {
	 myclass3 obj = new myclass3 ();
	 obj.myMethod1 ();
	 myclass3.myMethod2();
 }
}
