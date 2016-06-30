package com.softline.javacake.test;

/**
 * @author softlinecode@gmail.com
 */
public class Node {
	//Data field
	private float coef;
	private int expo;
	//Link field
	public Node link;

	//Constructor
	Node() {
		this.setCoef(0);
		this.setExpo(0);
		this.link = null;
	}

	//Getter, Setter Method of member variables
	public void setCoef(float coef) {
		this.coef = coef;
	}

	public float getCoef() {
		return coef;
	}

	public void setExpo(int expo) {
		this.expo = expo;
	}

	public int getExpo() {
		return expo;
	}
}
