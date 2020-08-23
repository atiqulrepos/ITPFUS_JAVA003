package org.itpfus.java003.exceptions;

public class Account {
	private String name;
	private double balance;

	public Account(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 0) {
			throw new BalanceCannotBeNegativeException("Balance " + balance + " is negative. You must pass a positive value");
		} else {
			this.balance = balance;
		}
	}

}
