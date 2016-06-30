package com.softline.javacake.guava;

import com.google.common.base.CharMatcher;

/**
 * @author softline@gmail.com
 * CharMatcher example
 * to see more test code
 */
public class CharMatcherCake {

	public static void main(String[] args) {
		String UpperCase = CharMatcher.JAVA_LOWER_CASE.negate().retainFrom("B-double E double R U-N beer run");
		System.out.println(UpperCase);


	}
}
