package com.softline.javacake.guava;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.softline.javacake.Cake;

import java.util.List;
import java.util.Map;

/**
 * @author softline@gmail.com
 * Powerful join function
 */
public class JoinerCake {

	public static void main(String[] args) {
		List<String> cakes = Lists.newArrayList();
		cakes.add(Cake.Carrot.name());
		cakes.add(Cake.Chiffon.name());
		cakes.add(Cake.IceCream.name());
		System.out.println(Joiner.on(",").join(cakes));

		cakes.add(null);
		System.out.println(Joiner.on(",").skipNulls().join(cakes));
		System.out.println(Joiner.on(",").useForNull("null !!!!").join(cakes));

		Map<Integer, String> cakeMap = Maps.newHashMap();
		cakeMap.put(1, Cake.Carrot.name());
		cakeMap.put(2, Cake.Chocolate.name());
		cakeMap.put(3, Cake.Moon.name());
		System.out.println(Joiner.on(",").withKeyValueSeparator("-").join(cakeMap));
		final Joiner.MapJoiner mapJoiner = Joiner.on("&&").withKeyValueSeparator("^^");
		System.out.println(mapJoiner.join(cakeMap));
	}
}
