package com.softline.javacake.guava;

import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;

import java.util.HashMap;

/**
 * @author softline@gmail.com
 * HashBiMap (guava) not allow same value
 * If you want unique value with map, you can use HashBiMap 
 */
public class HashBiMapCookie {

	public static void main(String[] args) {
		HashMap<String, String> temp = Maps.newHashMap();
		temp.put("test", "test1");
		temp.put("test1", "test1");
		System.out.println(temp);

		try {
			HashBiMap<String, String> cookies = HashBiMap.create();
			cookies.put("test", "test1");
			cookies.put("test1", "test1");
		} catch (IllegalArgumentException e) {
			System.out.println("HashBiMap not allow same value");
		}
	}
}
