package day10;

public class Account {
	double balance;
	
	

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {
		balance-=amount;
		
	}
	
	
	

}
