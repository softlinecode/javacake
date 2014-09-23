package com.softline.javacake.jdk8.stream;

import com.google.common.collect.Lists;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

/**
 * @author softlinecode@gmail.com
 * paralle stream is twice the performance than stream
 */
public class ParalleStream {

	public static void paralleStream(List<String> cakes) {
		Instant start = Instant.now();
		cakes.stream()//
		.filter(e ->  e == null ? true : e.length() > 15)//
		.forEach(e -> System.out.println(e));
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println(timeElapsed.toMillis());

		Instant start1 = Instant.now();
		cakes.parallelStream()//
		.filter(e -> e.length() > 15)//
		.forEach(e -> System.out.println(e));
		Instant end1 = Instant.now();
		Duration duration = Duration.between(start1, end1);
		System.out.println(duration.toMillis());
	}

	public static void main(String[] args) {

		List<String> cakes = Lists.newArrayList();
		cakes.add("chocolate");
		cakes.add("chiffon");
		cakes.add("mousse");

		for (int i = 0; i < 10000000; i++) {
			cakes.add("test" + i);
		}
		paralleStream(cakes);
	}
}
