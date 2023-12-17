package com.learn.ifAndSwitch;

import java.util.Scanner;

public class DoWhileRepeatedRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = -2;
		
		do {
			if (number != -2) {
				System.out.println("Cube is " + (number * number * number));
			}
			System.out.print("Enter a number:");
			number = sc.nextInt();
		} while (number >= 0);
		System.out.println("Thank You Have  nice Day...");

//		do {
//			System.out.println("Square is :" + number * number);
//			System.out.print("Enter a number:");
//			number = sc.nextInt();
//
//		} while (number >= -29);
//		System.out.println("enter a number greater than -29.");
	}

}
