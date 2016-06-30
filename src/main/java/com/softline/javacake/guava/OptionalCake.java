package com.softline.javacake.guava;

import com.google.common.base.Optional;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * @author softlinecode (softlinecode@gmail.com)
 * @since 2015. 11. 30. 오전 11:52
 */
public class OptionalCake {

	@Test(expected = IllegalStateException.class)
	public void optionalAbsentTest() throws Exception {
		Optional absent = Optional.absent();
		System.out.println(absent.isPresent());
		System.out.println(absent.get());
	}

	@Test
	public void getOptionalTest() {
		final Integer size = 5;
		Optional<Integer> count = Optional.of(size);
		System.out.println(count.isPresent());
		System.out.println(count.get());
		Integer optionalCount = count.get();
		assertTrue(size == optionalCount);
	}

	@Test
	public void orOptionalTest() {
		final Integer size = 5;
		Optional<Integer> count = Optional.fromNullable(size);
		int value = count.or(1);
		Optional<Integer> count2 = Optional.absent();
		int value2 = count2.or(1);
		System.out.println(value);
		System.out.println(value2);
	}

	@Test
	public void fromNullableTest() {
		Optional optional = Optional.fromNullable(null);
		System.out.println(optional.isPresent());
	}
}
