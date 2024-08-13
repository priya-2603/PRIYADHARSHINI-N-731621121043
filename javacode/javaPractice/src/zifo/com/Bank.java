package zifo.com;

public class Bank {
	String name;
	String accountnumber;
	double balance;

	public Bank (String name,String accountnumber,double balance) {
		this.name = name;
		this.accountnumber = accountnumber;
		this.balance = balance;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String accountnumber() {
		return accountnumber;
	}
	public void setaccountnumber(String accountnumber) {
		this.accountnumber=accountnumber;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance() {
		this.balance=balance;
	}
	
	
}
