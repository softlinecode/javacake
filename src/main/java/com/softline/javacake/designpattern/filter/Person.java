package com.softline.javacake.designpattern.filter;

/**
 * @author softlinecode@gmail.com
 */
public class Person {
	private String name;
	private GenderType genderType;
	private int age;

	public Person(String name, GenderType genderType) {
		this.name = name;
		this.genderType = genderType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GenderType getGenderType() {
		return genderType;
	}

	public void setGenderType(GenderType genderType) {
		this.genderType = genderType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
