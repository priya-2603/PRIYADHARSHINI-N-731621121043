package google;

public class methodoverloading {
	void mymethod (String name ) {
		System.out.println("welcome " + name);
		
	}
	void mymethod (int a,int b) {
		System.out.println("sum  :" + (a+b));
		
	}
	
	void mymethod(int n) {
		System.out.println("sum : "+(n+n));
		
	}
	public static void main(String[] args) {
		methodoverloading obj = new methodoverloading();
		obj.mymethod(43);
		obj.mymethod("priya");
		obj.mymethod(10, 20);
	}

}
