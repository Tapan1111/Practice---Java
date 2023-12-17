package com.learn.ifAndSwitch;

import java.util.Scanner;

public class ThinkingexRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1;
		int number2;
		int choice = 0;

		do {
			System.out.println("Enter  number:");
			number1 = sc.nextInt();

			System.out.println("Enter  number:");
			number2 = sc.nextInt();
			System.out.println("Choices available are ");
			System.out.println("1 - Add ");
			System.out.println("2 - Substract ");
			System.out.println("3 - Multiply ");
			System.out.println("4 - Divide ");
			System.out.println("5 - Exit ");

			System.out.println(" Enter your Choice :");
			choice = sc.nextInt();

			System.out.println("Your Choices are :");
			System.out.println(" Number1 :" + number1);
			System.out.println(" Number2 :" + number2);
			System.out.println("Choice :" + choice);

			performOperationSimpleIfElse(number1, number2, choice);
			System.out.println();
		} while (choice != 5);

	}

	private static void performOperationSimpleIfElse(int number1, int number2, int choice) {
		if (choice == 1) {
			System.out.println(number1 + number2);
		} else if (choice == 2) {
			System.out.println(number1 - number2);
		} else if (choice == 3) {
			System.out.println(number1 * number2);
		} else if (choice == 4) {
			System.out.println(number1 / number2);
		} else if (choice == 5) {
			System.out.println("Thank You");
		} else {
			System.out.println("Invalid Operation");
		}
	}

}
