package com.learning.core.day2session2.PS6;

public class BankAccountPS01 {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;

	public BankAccountPS01(int accNo, String custName, String accType, float balance)
			throws LowBalanceException, NegativeAmountException {
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;

		if (balance < 0) {
			throw new NegativeAmountException("NegativeAmount");
		}

		if (accType.equalsIgnoreCase("Saving")) {
			if (balance < 1000) {
				throw new LowBalanceException("LowBalance");
			}
		} else if (accType.equalsIgnoreCase("Current")) {
			if (balance < 5000) {
				throw new LowBalanceException("LowBalance");
			}
		}

		this.balance = balance;
	}

	public void deposit(float amt) throws NegativeAmountException {
		if (amt < 0) {
			throw new NegativeAmountException("NegativeAmount");
		}
		balance += amt;
	}

	public float getBalance() throws LowBalanceException {
		if (accType.equalsIgnoreCase("Saving")) {
			if (balance < 1000) {
				throw new LowBalanceException("LowBalance");
			}
		} else if (accType.equalsIgnoreCase("Current")) {
			if (balance < 5000) {
				throw new LowBalanceException("LowBalance");
			}
		}
		return balance;
	}

	public static void main(String[] args) {
		try {
			BankAccountPS01 account1 = new BankAccountPS01(123, "John", "Saving", 900);
			System.out.println("Output 1:");
			System.out.println("LowBalance");
		} catch (LowBalanceException e) {
			System.out.println("Output 1:");
			System.out.println(e.getMessage());
		} catch (NegativeAmountException e) {
			System.out.println("Output 2:");
			System.out.println(e.getMessage());
		}

		try {
			BankAccountPS01 account2 = new BankAccountPS01(123, "John", "Saving", -900);
			System.out.println("Output 2:");
			System.out.println("LowBalance");
		} catch (LowBalanceException e) {
			System.out.println("Output 2:");
			System.out.println(e.getMessage());
		} catch (NegativeAmountException e) {
			System.out.println("Output 2:");
			System.out.println(e.getMessage());
		}
	}
}
