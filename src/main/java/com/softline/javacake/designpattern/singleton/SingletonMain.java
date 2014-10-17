package com.softline.javacake.designpattern.singleton;

/**
 * @author softlinecode@gmail.com
 */
public class SingletonMain {

	public static void main(String... args) {
		Singleton singleton = Singleton.getInstance();
		singleton.message();//show message
	}

}
