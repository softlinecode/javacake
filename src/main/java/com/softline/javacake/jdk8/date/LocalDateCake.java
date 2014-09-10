package com.softline.javacake.jdk8.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

/**
 * @author softlinecode@gmail.com
 * 
 * http://docs.oracle.com/javase/tutorial/datetime/iso/date.html
 */
public class LocalDateCake {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2014, Month.AUGUST, 19);
		LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println(date);
		System.out.println(nextWed);
	}

}
