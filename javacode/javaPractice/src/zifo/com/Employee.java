package zifo.com;

public class Employee {
	String name;
	String jobtitle;
	double salary;
	
	public Employee(String name,String jobtitle,double salary) {
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
	}
	public String getname() {
		return name;
	}
	public void setname (String name) {
		this.name=name;
	}
	public String getjobtitle() {
		return jobtitle;
	}
	public void setjobtitle(String jobtitle) {
		this.jobtitle=jobtitle;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void giveRaise(double percentage) {
        if (percentage >0) {
        	salary += salary * (percentage/100);
        } 
    }
	
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Jobtitle:" +jobtitle);
		System.out.println("Salary:"+salary);
	}
	public static void main(String[] args) {
		Employee emp = new Employee ("priya","software engineer",40000);
		emp.giveRaise(10);
		emp.display();
	  
	}

}
