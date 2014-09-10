package com.softline.javacake.jdk8.stream;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author softlinecode@gmail.com
 */
public class StreamReduction {

	public static void main(String[] args) {
		String text = "Hello1 HELLO2 hello3";
		List<String> texts = Arrays.asList(StringUtils.split(text, " "));

		Optional<String> max = texts.stream().max(String::compareToIgnoreCase);
		if (max.isPresent()) {
			System.out.println(max.get());//hello3
		}

		Optional<String> min = texts.stream().min(String::compareTo);
		if (min.isPresent()) {
			System.out.println(min.get());
		}
	}
}
