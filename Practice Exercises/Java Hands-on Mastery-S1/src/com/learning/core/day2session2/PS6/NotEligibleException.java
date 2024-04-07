package com.learning.core.day2session2.PS6;

class NotEligibleException extends Exception {
	public NotEligibleException() {
		super("Player is not eligible for any coin.");
	}
}
