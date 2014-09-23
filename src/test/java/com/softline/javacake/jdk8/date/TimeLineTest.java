package com.softline.javacake.jdk8.date;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRulesException;
import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;

/**
 * @author softlinecode@gmail.com
 * http://helloworld.naver.com/helloworld/textyle/645609
 */
public class TimeLineTest {

	/**
	 * jdk7 bug class of date
	 */
	@Test
	public void getAfterOneDayWithJdk7() {
		TimeZone utc = TimeZone.getTimeZone("UTC");
		Calendar calendar = Calendar.getInstance(utc);
		calendar.set(1582, Calendar.OCTOBER, 4);
		String pattern = "yyyy.MM.dd";
		String theDay = toString(calendar, pattern, utc);
		assertEquals(theDay, "1582.10.04");

		calendar.add(Calendar.DATE, 1);
		String nextDay = toString(calendar, pattern, utc);
		//		assertEquals(nextDay, "1582.10.05");
		System.out.print(nextDay);
		assertEquals(nextDay, "1582.10.15");
	}

	@Test
	public void getAfterOneDayWithJdk8() {
		LocalDate theDay = IsoChronology.INSTANCE.date(1582, 10, 4);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		assertEquals(theDay.format(formatter), "1582.10.04");

		LocalDate nextDay = theDay.plusDays(1);
		assertEquals(nextDay.format(formatter), "1582.10.05");
	}

	/**
	 * jdk7 bug class of date
	 */
	@Test
	public void shouldGetAfterOneMinuteWithJdk7() {
		TimeZone seoul = TimeZone.getTimeZone("Asia/Seoul");
		Calendar calendar = Calendar.getInstance(seoul);
		calendar.set(1961, Calendar.AUGUST, 9, 23, 59);
		String pattern = "yyyy.MM.dd HH:mm";
		String theTime = toString(calendar, pattern, seoul);
		assertEquals(theTime, "1961.08.09 23:59");

		calendar.add(Calendar.MINUTE, 1);
		String after1Minute = toString(calendar, pattern, seoul);
		assertEquals(after1Minute, "1961.08.10 00:00");
		//assertEquals(after1Minute , "1961.08.10 00:30");
	}

	@Test
	public void shouldGetAfterOneMinuteWithJdk8() {
		ZoneId seoul = ZoneId.of("Asia/Seoul");
		ZonedDateTime theTime = ZonedDateTime.of(1961, 8, 9, 23, 59, 59, 0, seoul);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
		assertEquals(theTime.format(formatter), "1962.08.09 23:59");

		ZonedDateTime after1Minute = theTime.plusMinutes(1);
		assertEquals(after1Minute.format(formatter), "1962.08.10 00:00");
	}

	/**
	 * jdk7 bug class of date
	 */
	@Test
	public void shouldSetGmtWhenWrongTimeZoneIdWithJdk7() {
		TimeZone zone = TimeZone.getTimeZone("Seoul/Asia");
		assertEquals(zone.getID(), "GMT");
	}

	@Test(expected = ZoneRulesException.class)
	public void shouldThrowExceptionWhenWrongTimeZoneIdWithJdk8() {
		ZoneId.of("Seoul/Asia");// It's wrong time zone
	}

	private String toString(Calendar calendar, String pattern, TimeZone zone) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		format.setTimeZone(zone);
		return format.format(calendar.getTime());
	}

	@Test(expected = DateTimeException.class)
	public void shouldNotAcceptWrongDate() {
		LocalDate.of(1999, 13, 31); // It's mistake that date does not exist 1999.12.31
	}

	@Test
	public void shouldGetDayOfWeek() {
		LocalDate theDay = LocalDate.of(2014, 1, 1);
		DayOfWeek dayOfWeek = theDay.getDayOfWeek();
		assertEquals(dayOfWeek, DayOfWeek.WEDNESDAY);
	}
}
