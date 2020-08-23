package org.itpfus.java003.exceptions;

public class BalanceCannotBeNegativeException extends RuntimeException {
	public BalanceCannotBeNegativeException(String message) {
		super(message);
	}
}
