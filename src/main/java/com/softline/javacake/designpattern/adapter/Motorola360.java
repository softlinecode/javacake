package com.softline.javacake.designpattern.adapter;

/**
 * @author softlinecode@gmail.com
 */
public class Motorola360 implements FeaturePhone {
	@Override
	public void call() {
		System.out.println("call");
	}

	@Override
	public void receive() {
		System.out.println("receive");
	}

	@Override
	public void useData2G() {
		System.out.println("useData2G");
	}
}
