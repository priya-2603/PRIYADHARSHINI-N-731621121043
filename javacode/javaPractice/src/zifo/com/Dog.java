package zifo.com;

public class Dog {
	String name;
	String breed;
	public Dog (String name,String breed) {
		this.name=name;
		this.breed=breed;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getbreed() {
		return breed;
	}
	public void setbreed(String breed) {
		this.breed=breed;
	}
	void display() {
		System.out.println("Dogname:"+name);
		System.out.println("Dogbreed:"+breed);
	}
	
public static void main(String[] args) {
	Dog dog1 =  new Dog ("lucy","golden retriver");
	Dog dog2 = new Dog ("max","labrardor");
	dog1.display();
	dog2.display();
	
}
}
