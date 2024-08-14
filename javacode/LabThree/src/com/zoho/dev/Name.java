package com.zoho.dev;

class Person1{
private String firstName;
private String lastName;

public Person1(String firstName,String lastName) {
this.firstName=firstName;
this.lastName=lastName;
}

public String getFirstName() {
return firstName;

}
public String getlastName() {
return lastName;
}
}

class Employee5 extends Person1{
private String jobTitle;
private String employeeId;
public Employee5(String firstName,String lastName,String jobTitle,String employeeId) {
super(firstName,lastName);
this.jobTitle=jobTitle;
this.employeeId=employeeId;
}
public String employeeId() {
return employeeId;
}
public String jobTitle() {
return jobTitle;
}
	@Override
		public String getlastName() {
			// TODO Auto-generated method stub
			return super.getlastName()+", "+jobTitle;
		}
}

public class Name {
	public static void main(String[] args) {
		Employee5 emp=new Employee5("Priya","Narayanan","Full Stack Developer","E043");
		System.out.println("First Name: "+emp.getFirstName());
		System.out.println("Last Name: "+emp.getlastName());
		System.out.println("Job Title: "+emp.jobTitle());
		System.out.println("Employee ID: "+emp.employeeId());
	}

}
