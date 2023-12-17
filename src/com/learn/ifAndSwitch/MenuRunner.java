package com.learn.ifAndSwitch;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number1 :");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the Number2 :");
		int number2 = sc.nextInt();


		System.out.println("Choices available are ");
		System.out.println("1 - Add ");
		System.out.println("2 - Substract ");
		System.out.println("3 - Multiply ");
		System.out.println("4 - Divide ");

		System.out.println(" Enter your Choice :");
		int choice = sc.nextInt();

		System.out.println("Your Choices are :");
		System.out.println(" Number1 :" + number1);
		System.out.println(" Number2 :" + number2);
		System.out.println("Choice :" + choice);

		performOperationSimpleIfElse(number1, number2, choice);



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
		} else {
			System.out.println("Invalid Operation");
		}
	}

	private static void performOperationSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println(number1 + number2);
			break;
		case 2:
			System.out.println(number1 - number2);
			break;
		case 3:
			System.out.println(number1 * number2);
			break;
		case 4:
			System.out.println(number1 / number2);
		default:
			System.out.println("Invalid Operation");
			break;
		}

	}

}
