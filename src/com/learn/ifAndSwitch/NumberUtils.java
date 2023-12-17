package com.learn.ifAndSwitch;

public class NumberUtils {
	public static void main(String[] args) {
		
		System.out.println(getLastDigit(3450));
		System.out.println(getNumberOfDigits(67895));
		System.out.println(getSumOfDigits(12345));
		System.out.println(reverseNumber(123456789));

	}

	public static int getLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		return number % 10;
	}

	public static int getNumberOfDigits(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 0;
		}
		int noOfDigit = 0;
		while (number > 0) {
			number = number / 10;
			noOfDigit++;
		}
		return noOfDigit;
	}

	public static int getSumOfDigits(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 0;
		}
		int sumOfNoOfDigit = 0;
		while (number > 0) {

			int digit = number % 10;
			sumOfNoOfDigit = sumOfNoOfDigit + digit;
			number = number / 10;
		}
		return sumOfNoOfDigit;
	}

	public static int reverseNumber(int number) {
		if(number < 0) {
			return -1;
		}
		if(number == 0) {
			return 0;
		}
		int reversedDigit = 0;
		while(number > 0) {
			int digit = number%10;
			reversedDigit = reversedDigit * 10 + digit;
			number = number/10;
		}
		return reversedDigit;
	}

}
