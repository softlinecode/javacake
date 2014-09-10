package com.softline.javacake.jdk8.stream;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author softlinecode@gamil.com
 */
public class StreamCount {

	public static int jdk7Style(List<String> texts) {
		int count = 0;
		for (String text : texts) {
			if (text.length() > 10) {
				count++;
			}
		}
		return count;
	}

	public static long jdk8Style(List<String> texts) {
		Stream stream = texts.stream()//
		.limit(2);
		System.out.println(stream.count()); //2

		return 
		texts.stream()//
		.filter(text -> text.length() > 10)//
		.count();//0
	}

	public static void main(String[] args) {
		String text = "안녕1 안녕2 안녕3";
		List<String> texts = Arrays.asList(StringUtils.split(text, " "));

		System.out.println(jdk7Style(texts));//0
		System.out.println(jdk8Style(texts));//0

		//stream create
		Stream<String> vocabularys = Stream.of(StringUtils.split(text, " "));
		Stream<String> vacabularys2 = Stream.of("gently", "down", "the", "stream");

		System.out.println(vocabularys.count());//3
		System.out.println(vacabularys2.count());//4

	}
}
