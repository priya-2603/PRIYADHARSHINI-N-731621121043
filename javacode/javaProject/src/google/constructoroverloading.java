package google;
// constructor overloading in java

public class constructoroverloading {
	constructoroverloading(String name){
		System.out.println("welcome "+ name);
	}
	
	constructoroverloading(int a, int b) {
		this("priya");
		System.out.println("sum : " +(a+b));
	}
	
	constructoroverloading(int n) {
		this(10,20);
		System.out.println("sum: "+ (n+n));
	}
	
	public static void main(String[] args) {
		constructoroverloading obj1 = new constructoroverloading(43);
		
	}
	

}
