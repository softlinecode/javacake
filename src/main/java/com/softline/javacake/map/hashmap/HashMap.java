package com.softline.javacake.map.hashmap;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * @author softlinecode@gmail.com
 */
public class HashMap {

	public static void main(String... args) {
		Map<String, String> map = Maps.newConcurrentMap();
		map.put("aa", "aa");
		map.put("aa", "bb");
		System.out.println("map:" + map);

		Map<String, Object> map2 = new HashMap<>();
		map.put("aa", "aa");
		map.put("aa", "bb");
		System.out.println("map2:" + map2);
	}
}
