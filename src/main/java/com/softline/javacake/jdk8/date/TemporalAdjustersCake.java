package com.softline.javacake.jdk8.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

/**
 * @author softlinecode@gmail.com
 * http://docs.oracle.com/javase/tutorial/datetime/iso/adjusters.html
 */
public class TemporalAdjustersCake {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2000, Month.OCTOBER, 15);
		DayOfWeek dotw = date.getDayOfWeek();
		System.out.printf("%s is on useData2G %s%n", date, dotw);//2000-10-15 is on useData2G SUNDAY
		System.out.printf("first day of Month: %s%n", date.with(TemporalAdjusters.firstDayOfMonth()));//first day of Month: 2000-10-01
		System.out.printf("first Monday of Month: %s%n", date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));//first Monday of Month: 2000-10-02
		System.out.printf("last day of Month: %s%n", date.with(TemporalAdjusters.lastDayOfMonth()));//last day of Month: 2000-10-31
		System.out.printf("first day of next Month: %s%n", date.with(TemporalAdjusters.firstDayOfNextMonth()));//first day of next Month: 2000-11-01
		System.out.printf("first day of next Year: %s%n", date.with(TemporalAdjusters.firstDayOfNextYear()));//first day of next Year: 2001-01-01
		System.out.printf("first day of Year: %s%n", date.with(TemporalAdjusters.firstDayOfYear()));//first day of Year: 2000-01-01
	}
}
