package com.softline.javacake.jdk8.string;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author softlinecode@gmail.com
 * String.join test code
 */
@RunWith(MockitoJUnitRunner.class)
public class JoinTest {

	@Test
	public void testJoin() throws Exception {
		assertEquals("url/test", String.join("/", "url", "test"));
	}
}
