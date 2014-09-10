package com.softline.javacake.designpattern.adapter;

/**
 * @author softlinecode@gmail.com
 */
public class IPhone5 implements SmartPhone {
	@Override
	public void call() {
		System.out.println("call");
	}

	@Override
	public void receive() {
		System.out.println("receive");
	}

	@Override
	public void useWifi() {
		System.out.println("useWifi");
	}
}
