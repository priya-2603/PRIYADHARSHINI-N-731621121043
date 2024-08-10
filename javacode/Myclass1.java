import java.util.Scanner;
public class Myclass1 {
public static void main (String args []){
int employeeId;
String employeeName;
float employeeSalary;

Scanner sc = new Scanner(System.in);

System.out.println("Enter employeeid");
employeeId = sc.nextInt();
System.out.println("Enter employeename");
employeeName = sc.next();
System.out.println("Enter employeesalary");
employeeSalary = sc.nextFloat();

System.out.println("Employee id : " + employeeId);
System.out.println("Employee name : " + employeeName);
System.out.println("Employee salary : " + employeeSalary);

}
}