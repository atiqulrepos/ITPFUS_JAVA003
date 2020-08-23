package org.itpfus.java003.exceptions;

public class Runner {

	public static void processData() throws BalanceCannotBeNegativeException {

		Account ac = new Account("Humayun");

		ac.setBalance(1000000);
		System.out.println(ac.getBalance());
		ac.setBalance(-1000000);
		System.out.println(ac.getBalance());

	}

	public static void main(String[] args) throws BalanceCannotBeNegativeException {
		//try {
			processData();
		/*} catch (BalanceCannotBeNegativeException e) {
			System.out.println(e.getMessage());
		}
		*/
	}

}
