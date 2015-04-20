package com.softline.javacake.jdk8.stream;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * @author softlinecode@gmail.com
 * http://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html
 */
public class CollectionCake {

	public static void listStream(List<String> cakes) {
		Instant start = Instant.now();
		cakes.stream().filter(e -> e.length() > 7).forEach(e -> System.out.println(e));
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println(timeElapsed.toMillis());

		Instant start1 = Instant.now();
		cakes.parallelStream().filter(e -> e.length() > 7).forEach(e -> System.out.println(e));
		Instant end1 = Instant.now();
		Duration duration = Duration.between(start1, end1);
		System.out.println(duration.toMillis());
	}

	public static void main(String[] args) {

		List<String> cakes = Lists.newArrayList();
		cakes.add("chocolate");
		cakes.add("chiffon");
		cakes.add("mousse");

		listStream(cakes);
	}
}
