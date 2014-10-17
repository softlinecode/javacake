package com.softline.javacake.designpattern.factory;

import org.apache.commons.lang3.StringUtils;

/**
 * @author softlinecode@gmail.com
 */
public class CakeFactory {

	public static Cake getCake(String cake) {
		if (StringUtils.isEmpty(cake)) {
			return null;
		}

		if (StringUtils.equalsIgnoreCase(cake, "Carrot")) {
			return new CarrotCake();
		}

		if (StringUtils.equalsIgnoreCase(cake, "Chocolate")) {
			return new ChocolateCake();
		}

		return null;
	}

}
