package com.learn.ifAndSwitch;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Text {
	public static void main(String[] args) {

		String something = "This is Tapan Behera";
		for (int i = 0; i < something.length(); i++) {
//			System.out.println(something.charAt(i));
		}

		StringBuffer sb = new StringBuffer("Test");
		sb.append(123);
		sb.setCharAt(0, 't');
		System.out.println(sb);

		StringBuilder sbld = new StringBuilder("TEST");
		System.out.println(sbld);

		LocalDate now = LocalDate.now();
//		now.getDayOfYear();
//		now.getDayOfMonth();
//		now.getYear();
//		now.getDayOfWeek();
//		now.plusDays(20);
		System.out.println(now.getDayOfWeek());

		LocalDateTime today = LocalDateTime.now();
		today.getDayOfMonth();
//		System.out.println(today);

		LocalTime time = LocalTime.now();
//		System.out.println(time);

	}

}
