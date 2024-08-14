package com.zoho.dev;

class BankAccount {
	protected double balance;
	public BankAccount (double initialBalance) {
	this.balance=initialBalance;
	}
	public void deposit(double amount) {
		if(amount>0) {
		balance+=amount;
		System.out.println("Deposit: "+amount);
		}else {
		System.out.println("Depositive Positive");
		}
	}
		public void withdraw(double amount) {
			if(amount>0 && amount <= balance) {
			balance-=amount;
			System.out.println("withdraw: "+amount);
			}
			else{
			System.out.println("Insufficient Balance");
			}

}
		public double getBalance() {
			return balance;
			}
}
class SavingsAccount extends BankAccount{

public SavingsAccount(double initialBalance) {
super(initialBalance);
}
@Override
	public void withdraw(double amount) {
	if(balance - amount<100) {
		System.out.println("Withdrawal denied!");
		}else {
super.withdraw(amount);
		}
}
	}
public class Bank {
	public static void main(String args[]) {
		SavingsAccount s=new SavingsAccount(600);
		s.deposit(100);
		s.withdraw(200);
		s.withdraw(300);
		System.out.println("Total balance: "+s.getBalance());
		}

}
