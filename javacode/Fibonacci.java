import java.util.Scanner;
public class Fibonacci {
public static void main (String[]args) {
Scanner sc = new Scanner (System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int count=10;
int n3;
for (int i = 0; i<=count;i++) {
n3 = n1+n2;
System.out.print("  "+n3);
n1= n2;
n2 =n3;
}
}
}





















