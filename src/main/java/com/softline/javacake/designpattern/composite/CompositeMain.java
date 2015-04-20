package com.softline.javacake.designpattern.composite;

/**
 * @author softlinecode@gmail.com
 */
public class CompositeMain {

	public static void main(String... args) {

		CakeComposite cakeComposite = new CakeComposite();
		Cake cake = new Cake("1");
		Cake cake1 = new Cake("2");
		cakeComposite.add(cake);
		cakeComposite.add(cake1);

		cakeComposite.cook();
	}
}
