package com.softline.javacake.map.enummap;

import com.google.common.collect.Maps;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author softlinecode@gmail.com
 */
public class EnumMapMain {

	public enum CakeEnum {
		Carrot,
		Coconut,
		Fruitcake
	}

	public static void main(String... args) {
		EnumMap<CakeEnum, String> map = new EnumMap<CakeEnum, String>(CakeEnum.class);
		map.put(CakeEnum.Carrot, "best");
		map.put(CakeEnum.Coconut, "good");
		map.put(CakeEnum.Fruitcake, "not bad");

		System.out.println(String.format("size:%s", map.size()));

		Iterator<CakeEnum> keyIterator = map.keySet().iterator();
		while (keyIterator.hasNext()) {
			CakeEnum cakeEnum = keyIterator.next();
			System.out.println(String.format("enum:%s", cakeEnum.name()));
		}

		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(String.format("value:%s", value));
		}

		System.out.println(String.format("Map:%s", map));
		System.out.println(String.format("Values:%s,", values));

		Map<CakeEnum, String> map2 = new EnumMap<>(CakeEnum.class);
		map2.put(CakeEnum.Carrot, "best1");

		System.out.println(String.format("Normal Map:%s", map2));

		Map<CakeEnum, String> map3 = Maps.newEnumMap(CakeEnum.class);
		map3.put(CakeEnum.Carrot, "best2");
		map3.put(CakeEnum.Fruitcake, "good2");
		System.out.println(String.format("Maps.newEnumMap Map:%s", map3));



	}

}
