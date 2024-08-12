package google;

//class and object
class Employee {
	// variables
	int employeeId;
	String employeeName;
	float employeeSalary;
	// constructor
	Employee (int employeeId, String employeeName,float employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	// define method
	void display () {
		System.out.println("Employee Id :" + employeeId);
		System.out.println("Employee Name :"+ employeeName);
		System.out.println("Employee Salary :" + employeeSalary);
		
	}
	
}

public class ClassObject {
	public static void main (String[] args) {
		Employee emp1 = new Employee (101,"priya",2000.0f);
		emp1.display();
		
		Employee emp2 = new Employee(102,"dharshini",30000.0f);
		emp2.display();
		
		
	}

}
