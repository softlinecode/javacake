package com.softline.javacake.designpattern.singleton;

/**
 * @author softlinecode@gmail.com
 */
public class Singleton {

	private static Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}

	public void message() {
		System.out.println("show message");
	}

}
