package google;
import java.util.Arrays;
import java.util.Scanner;

class student1 {
	int regNum;
	String stuName;
	int marks[] = new int[5];
	int sum;
	float avg;
	String grade;
	
	student1(int regNum, String stuName) {
		this.regNum=regNum;
		this.stuName=stuName;
		}
	void getmarks() {
		Scanner sc = new Scanner(System.in);
		 for (int i = 0; i < marks.length; i++) {
System.out.println("Enter marks for subject " + (i + 1) + ":");
 marks[i] = sc.nextInt();	
			}
	}
	void calgrade() {
		for(int i=0;i<5;i++) {
			sum=sum+marks[i];
		}
		avg = sum/5;
		if(avg>=90) {
			System.out.println("O  grade");
		}
		if(avg>=80) {
			System.out.println("A grade");
		}
		
		if(avg>=70){
			System.out.println("B grade");
		}
	}
	void display() {
		System.out.println ("name:"+stuName);
		System.out.println("regnumber:"+regNum);
		System.out.println("average:"+avg);
		System.out.println("sum:"+sum);
		System.out.println("grade"+grade);
		
	}
}
public class student {
	public static void main(String[] args) {
		student1 obj = new student1(43 ,"priya");
	obj.getmarks();
	obj.calgrade();
	obj.display();
		
	}

}
