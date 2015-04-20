package com.softline.javacake.designpattern.factory;

/**
 * @author softlinecode@gmail.com
 */
public class FactoryMain {
	public static void main(String... args) {
		Cake chocolateCake = CakeFactory.getCake("Carrot");
		chocolateCake.cook();//Cake cook
	}

}
