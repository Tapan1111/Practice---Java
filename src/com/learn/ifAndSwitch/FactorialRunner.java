package com.learn.ifAndSwitch;

public class FactorialRunner {

	public int calculateFactorial(int number) {
		if (number <= 0) {
			return -1;
		}
		int factorial = 1;
		for (int i = 2; i <= number; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

}
