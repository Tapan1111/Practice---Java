package com.learn.ifAndSwitch;

public class MyNumber {

	private int num;

	public MyNumber(int num) {

		this.num = num;
	}

	public boolean isPrime() {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}

		return sum;
	}

	public int sumOfDivisor() {

		int sumOfDivisor = 0;
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				sumOfDivisor = sumOfDivisor + i;
			}

		}
		return sumOfDivisor;
	}

	public void printANumberTriangle() {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
