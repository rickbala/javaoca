package oca;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateUsage {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2020, 2, 18);
		System.out.println(localDate);
		System.out.println();

		LocalDateTime localDateTime = localDate.atTime(20, 16, 35);
		System.out.println(localDateTime);
		System.out.println();

		LocalDate localDateParsed = LocalDate.parse("1987-03-18");
		System.out.println("My birthday is: " + localDateParsed);
		System.out.println();

		LocalDate localDateYearNow = localDateParsed.withYear(2020);
		System.out.println(localDateYearNow);
		System.out.println();

		LocalDate localDateNow = LocalDate.now();
		System.out.println(localDateNow);
		System.out.println(localDateNow.getMonthValue());
		System.out.println(localDateNow.getMonth());


	}
}
