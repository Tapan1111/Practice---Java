package com.learn.ifAndSwitch;

public class SwitchCaseRunner {

	public static void main(String[] args) {
		System.out.println(determineNameOfTheMonth(5));

	}

	public static String determineNameOfTheDay(int number) {

		String result = "";
		switch (number) {
		case 0:
			result = "Monday";
			break;
		case 1:
			result = "Tuesday";
			break;
		case 2:
			result = "WednesDAY";
			break;
		case 3:
			result = "Thursday";
			break;
		case 4:
			result = "Friday";
			break;
		case 5:
			result = "Monday";
			break;
		case 6:
			result = "Saturday";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + number);
		}
		return result;

	}

	public static String determineNameOfTheDayReturn(int number) {

		switch (number) {
		case 0:
			return "Monday";
		case 1:
			return "Tuesday";
		case 2:
			return "Wednesday";
		case 3:
			return "Thursday";
		case 4:
			return "Friday";
		case 5:
			return "SATURDAY";
		case 6:
			return "Sunday";
		default:
			throw new IllegalArgumentException("Unexpected value: " + number);
		}
	}
	public static String determineNameOfTheMonth(int number) {

		switch (number) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "JULY";
		case 8:
			return "AUGUST";
		case 9:
			return "SWPTEMBER";
		case 10:
			return "OCTONBER";
		case 11:
			return "nOVEMER";
		case 12:
			return "december";
		default:
			throw new IllegalArgumentException("Unexpected value: " + number);
		}
	}

}
