import java.util.Scanner;
public class prime{
public static void main(String args[]){      
int i, n, a = 0;
System.out.print("Enter the number :");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for( i = 2; i < n; i++) {
if(n % i == 0) {
a = 0;
break;
}
else
{
a = 1;
 }
}
if(a == 1){
System.out.println("prime number");
 }
else {
 System.out.println("not a prime number");
    }          
  }
}
