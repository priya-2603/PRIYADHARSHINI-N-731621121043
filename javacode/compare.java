import java.util.Scanner;
public class compare {
public static void main (String [] args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the first string:");
String str1= sc.nextLine();
System.out.println("Enter the second string:");
String str2= sc.nextLine();
if (str1.equals(str2)){
System.out.println("same object");
}
else {
System.out.println("different object");
}
}
}