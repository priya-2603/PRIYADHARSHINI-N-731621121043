import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
       String rev = "";

        
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            rev += c;
        }

       
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
