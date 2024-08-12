import java.util.Scanner;
public class factorial {
public static void main(String [] args) {
Scanner sc = new Scanner (System.in);
int n , i , j =1,r;
System.out.println("Enter the number:");
n = sc.nextInt();
for ( i=n;i>0;i--){
r=i*j;
j=r;
}
System.out.print("Factorial is: "+j);
}
}














