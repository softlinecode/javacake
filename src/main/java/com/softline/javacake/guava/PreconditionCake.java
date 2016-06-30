package com.softline.javacake.guava;

import com.google.common.base.Preconditions;
import com.softline.javacake.Cake;

/**
 * @author softline@gmail.com
 * Precondition util can make simple code
 */
public class PreconditionCake {

	public static void main(String[] args) {
		try {
			checkCondition(0, Cake.Carrot);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void checkCondition(int count, Cake cake) {
		Preconditions.checkNotNull(cake);
		Preconditions.checkArgument(count > 0, "count is over than 0 : %s", count);
	}
}
