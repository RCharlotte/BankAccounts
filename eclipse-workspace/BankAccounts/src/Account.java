
public class Account {
	private String name;
	private String accNo;
	private double balance;
	
public Account(String name ,String accNo, double balance) {
	this.name= name;
	this.accNo= accNo;
	this.balance= balance;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	if(balance>0.0) {
		this.balance = balance;
	}
	}
	

public String getAccNo() {
	return accNo;
}

public void setAccNo(String accNo) {
	this.accNo = accNo;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name= name;
}
public void deposit(int deposit) {
	if(deposit>0.0) {
		balance= balance+deposit;
	}
}
public void withdraw(int withdrawal) {
	if(withdrawal>0.0) {
		balance= balance+withdrawal;
	}
}



}
