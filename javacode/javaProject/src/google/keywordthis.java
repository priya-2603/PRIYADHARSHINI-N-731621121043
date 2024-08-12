package google;
// this keyword in java
public class keywordthis {
	String name;
	keywordthis (String name) {
		this (10,20);
		this.name = name;
		this.greeting ();
	}
	keywordthis (int a,int b) {
		System.out.println("addition :"+ (a+b));
	}
	void greeting () {
		System.out.println("welcome " +name );
	}
	 public static void main (String[] args) {
		 keywordthis obj = new keywordthis("priya");
	 }

}
