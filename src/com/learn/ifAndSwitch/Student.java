package com.learn.ifAndSwitch;

public class Student {

	private int mark;

	public Student(int mark) {
		this.mark = mark;
	}

	public char assignGrades() {

		if (mark < 0 || mark > 100) {
			return 'X';
		}
		else if (mark >= 90) {
			return 'A';
		} else if (mark >= 80) {
			return 'B';
		} else if (mark >= 70) {
			return 'B';
		} else if (mark >= 60) {
			return 'B';
		} else if (mark <= 50) {
			return 'F';
		} else {
			return 'Y';
		}
	}

}

