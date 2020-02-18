package oca;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateUsage {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2020, 2, 18);
		System.out.println(localDate);

		LocalDateTime localDateTime = localDate.atTime(20, 16, 35);
		System.out.println(localDateTime);

		LocalDate localDateParsed = LocalDate.parse("1987-03-18");
		System.out.println("My birthday is: " + localDateParsed);

		LocalDate localDateYearNow = localDateParsed.withYear(2020);
		System.out.println(localDateYearNow);

		LocalDate localDateNow = LocalDate.now();
		System.out.println(localDateNow);
	}
}
