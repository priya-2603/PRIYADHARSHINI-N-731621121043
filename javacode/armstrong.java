import java.util.*;
public class armstrong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Number:");
int n=sc.nextInt();
int orginalnum,rem,res=0;
orginalnum=n;
while(orginalnum!=0)
{
rem=orginalnum%10;
res+=Math.pow(rem,3);
orginalnum/=10;
}
if(res==n)
System.out.println("Armstrong Number:"+n);
else
System.out.println("Not an Armstrong Number:"+n);
}
}