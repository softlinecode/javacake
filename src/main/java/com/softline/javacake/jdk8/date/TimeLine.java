package com.softline.javacake.jdk8.date;

import java.time.Duration;
import java.time.Instant;

/**
 * @author softlinecode@gmail.com
 * 
 * java.time object is immutable
 */
public class TimeLine {

	public static void main(String[] args) {
		Instant start = Instant.now();
		System.out.println(start);
		Instant end = Instant.now();
		System.out.println(end);

		Duration timeElapsed = Duration.between(start, end);
		System.out.println(timeElapsed.toMillis());
	}

}
