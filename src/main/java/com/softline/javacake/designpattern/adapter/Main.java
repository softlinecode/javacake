package com.softline.javacake.designpattern.adapter;

/**
 * @author softlinecode@gmail.com
 */
public class Main {

	public static void main(String[] args) {
		Motorola360 motorola360 = new Motorola360();
		IPhone5 iPhone5 = new IPhone5();

		FeatureAdapter featureAdapter = new FeatureAdapter(motorola360);
		iPhone5.useWifi();
		featureAdapter.useWifi();

	}
}
