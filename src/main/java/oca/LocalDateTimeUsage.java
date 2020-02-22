package oca;

import java.time.LocalDateTime;

public class LocalDateTimeUsage {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		LocalDateTime localDateTimeParsed = LocalDateTime.parse("2015-01-31T23:01");
		System.out.println(localDateTimeParsed);

		LocalDateTime localDateTimeMonthChanged = localDateTimeParsed.withMonth(12);
		System.out.println(localDateTimeMonthChanged);
	}

}
