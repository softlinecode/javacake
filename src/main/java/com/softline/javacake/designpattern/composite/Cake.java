package com.softline.javacake.designpattern.composite;

/**
 * @author softlinecode@gmail.com
 */
public class Cake implements CakeComponent {

	private String name;

	public Cake(String name) {
		this.name = name;
	}

	@Override
	public void cook() {
		System.out.println(String.format("cook:%s", name));
	}
}
