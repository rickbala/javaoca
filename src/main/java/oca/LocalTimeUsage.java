package oca;

import java.time.LocalTime;

public class LocalTimeUsage {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.of(11,20);
		System.out.println(localTime);
		System.out.println();

		LocalTime localTimeNow = LocalTime.now();
		System.out.println(localTimeNow);
		System.out.println();

		LocalTime localTime1 = LocalTime.of(1,23);
		System.out.println(localTime1);
	}
}
