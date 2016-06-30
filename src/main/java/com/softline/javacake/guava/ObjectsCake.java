package com.softline.javacake.guava;

import com.google.common.base.Objects;

/**
 * @author softline@gmail.com
 */
public class ObjectsCake {

	public static void main(String[] args) {
		try {
			String temp = null;
			System.out.println(Objects.firstNonNull(temp, "Unknown data"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
