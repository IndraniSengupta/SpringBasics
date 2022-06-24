package edu.shopping;

public class Acc {
	
	String Name;
	int AccNo;
	int BankBalance;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public int getBankBalance() {
		return BankBalance;
	}
	public void setBankBalance(int bankBalance) {
		BankBalance = bankBalance;
	}
	@Override
	public String toString() {
		return "Acc [Name=" + Name + ", AccNo=" + AccNo + ", BankBalance=" + BankBalance + "]";
	}
	
	
}

	
	


