package com.softline.javacake.jdk8.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author softlinecode@gmail.com
 * http://docs.oracle.com/javase/tutorial/datetime/iso/adjusters.html
 */
public class CustomTemporalAdjusterCake implements TemporalAdjuster {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2014, Month.AUGUST, 18);
		LocalDate nextPayday = date.with(new CustomTemporalAdjusterCake());
		System.out.print(nextPayday);
	}

	@Override
	public Temporal adjustInto(Temporal temporal) {
		LocalDate date = LocalDate.from(temporal);
		int day;
		if (date.getDayOfMonth() < 15) {
			day = 15;
		} else {
			day = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
		}
		date = date.withDayOfMonth(day);
		if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
			date = date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
		}
		return temporal.with(date);
	}
}
