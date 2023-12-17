package com.learn.ifAndSwitch;

public class WeatherAdviser {

	public String provideWeatherAdvisory(int temperature) {

		if (temperature < 0) {
			return "Its freezing wear a heavy coat";
		} else if (temperature <= 15) {
			return "Its cold bundle up";
		} else if (temperature <= 25) {
			return "Its cool alight jacket will do";
		} else if (temperature > 25) {
			return "Its warm  enjoy your day";
		}
		return "";
	}

}
