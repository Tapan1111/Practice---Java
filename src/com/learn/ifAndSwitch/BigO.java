package com.learn.ifAndSwitch;

public class BigO {

	public static void printNumber(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					System.out.println(i + "" + j + "" + k);
				}
			}
		}

	}

	public static void main(String[] args) {
		printNumber(10);

	}

}
