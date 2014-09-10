package com.softline.javacake.designpattern.adapter;

/**
 * @author softlinecode@gmail.com
 */
public class FeatureAdapter implements SmartPhone {

	private FeaturePhone featurePhone;

	public FeatureAdapter(FeaturePhone featurePhone) {
		this.featurePhone = featurePhone;
	}

	@Override
	public void call() {
		featurePhone.call();
	}

	@Override
	public void receive() {
		featurePhone.receive();
	}

	@Override
	public void useWifi() {
		featurePhone.useData2G();
	}
}
