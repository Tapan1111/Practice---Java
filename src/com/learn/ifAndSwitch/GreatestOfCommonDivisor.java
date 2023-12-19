package com.learn.ifAndSwitch;

public class GreatestOfCommonDivisor {

	private int number1;
	private int number2;

	public GreatestOfCommonDivisor(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int calculateGCD() {

		if (number1 < 0 || number2 < 0) {
			return 1;
		}
		if (number1 == number2) {
			return number1;
		}
		int min = Math.min(number1, number2);
		for (int i = min; i > 0; i--) {
			boolean isFinalGcdForBoth = number1 % i == 0 && number2 % i == 0;
			if (isFinalGcdForBoth) {
				return i;
			}
		}
		return -1;

	}

}
