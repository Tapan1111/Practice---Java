package com.learn.ifAndSwitch;

public class IfStatementRunner {

	public static void main(String[] args) {
//		int i = 13;
//		int k = 15;

		puzzles();
		puzzels2();
		printPattern(5);

//		if (i == 11) {
//			System.out.println(" i is  eleven ");
//		} else {
//			System.out.println(" i is not eleven ");
//		}

//		if (i == 11) {
//			System.out.println(" i is eleven ");
//		} else if (i == 12) {
//			System.out.println("i is tweleve");
//		} else {
//			System.out.println("i is neither eleven or twelve");
//		}

	}

	private static void puzzles() {
		int k = 15;

		if (k > 20) {
			System.out.println(1);
		} else if (k > 10) {
			System.out.println(2);
		} else if (k < 30) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}

	private static void puzzels2() {
		int l = 15;

		if (l < 20) {
			System.out.println(" l is less then 20");
		}
		if (l > 20) {
			System.out.println(" l is greater then 20");
		}
		else {
			System.err.println("what  the  fu... is this");
		}
	}

	public static void printPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
//			2 * n - ((2 * i) + 1)
			for (int j = 1; j <= 2 * n - ((2 * i) + 1); j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
