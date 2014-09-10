package com.softline.javacake.jdk8.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author softlinecode@gmail.com
 */
public class StreamMap {

	public static void main(String[] args) {
		String text = "Hello1 HELLO2 hello3";
//		List<String> texts = Arrays.asList(StringUtils.split(text, " "));
		List<String> texts = Lists.newArrayList();
		texts.add("보노보노1");
		texts.add("보노보노2");

		Stream<String> uppercaseWords = texts.stream().map(String::toUpperCase);
		Stream<Character> firstWords = texts.stream().map(s -> s.charAt(0));

		texts.add("보노보노3");
		uppercaseWords.forEach(word -> System.out.println(word));
		firstWords.forEach(word -> System.out.println(word));


		System.out.println("----------------");
		uppercaseWords.forEach(word -> System.out.println(word));
		
		Stream<Double> randoms = Stream.generate(Math::random).limit(10).skip(1);//skip : remove index 
		System.out.println(randoms.count());//9
	}
}
