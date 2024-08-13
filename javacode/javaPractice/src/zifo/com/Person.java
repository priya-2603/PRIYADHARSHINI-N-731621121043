package zifo.com;

public class Person {
	String name;
	int age;
	public Person (String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	
	public static void main(String[] args) {
		Person per = new Person ("priya",20);
		per.display();
		
	}

}
