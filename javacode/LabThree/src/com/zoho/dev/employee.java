package com.zoho.dev;

class employees1{
void work() {
System.out.println("Employee is Working: ");
}
double getSalary() {
return 50000;
}
}
class HRManager extends employees1{
	 @Override
		void work() {
		 System.out.println("HR Manager is managing the employee");
			super.work();
		}
	 void addEmployee() {
		 System.out.println("HR id adding a new Employee");
		 }
		 }

public class employee {
	public static void main(String[] args) {
		HRManager hr=new HRManager();
		hr.work();
		hr.addEmployee();
		System.out.println("Salary: "+hr.getSalary());
    }

}
