package com.softline.javacake.guava;

import com.google.common.base.Strings;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author softlinecode (softlinecode@gmail.com)
 * @since 2015. 11. 30. 오후 1:37
 */
public class StringsCake {

	@Test
	public void commonPrefixTest() {
		String result = Strings.commonPrefix("ab", "abaaa");
		System.out.println(result);
		assertEquals("ab", result);
	}

	@Test
	public void commonSuffixTest() {
		String result = Strings.commonSuffix("abbb", "abaaabb");
		System.out.println(result);
		assertEquals("bb", result);
	}

	@Test
	public void emptyToNullTest() {
		assertEquals(null, Strings.emptyToNull(null));
	}
}
