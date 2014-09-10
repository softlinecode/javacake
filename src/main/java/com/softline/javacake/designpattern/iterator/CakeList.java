package com.softline.javacake.designpattern.iterator;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * @author softlinecode@gmail.com
 */
public class CakeList implements Iterable<String> {
	private List<String> list = Lists.newArrayList();

	public void add(String name) {
		list.add(name);
	}

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			int index = 0;

			public boolean hasNext() {
				return index < list.size();
			}

			public String next() {
				return list.get(index++);
			}
		};
	}

	public static void main(String[] arg) {
		CakeList cakeList = new CakeList();
		cakeList.add("chocolate");
		cakeList.add("chiffon");
		cakeList.add("mousse");

		Iterator<String> iterator = cakeList.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}
}
