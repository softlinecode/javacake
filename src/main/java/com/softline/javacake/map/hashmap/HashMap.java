package com.softline.javacake.map.hashmap;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author softlinecode@gmail.com
 */
public class HashMap {

	public static void main(String... args) {
		Map<String, String> map = Maps.newConcurrentMap();
		map.put("aa", "aa");
	}
}
