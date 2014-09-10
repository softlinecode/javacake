package com.softline.javacake.jdk8.lambda.search;

import java.time.LocalDate;

/**
 * @author softlinecode@gmail.com
 */
public class Person {

	public enum Sex {
		MALE,
		FEMALE
	}

	private String name;
	private LocalDate birthday;
	private Sex gender;
	private String email;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return String.format("name : %s , email : %s , age : %d", getName(), getEmail(), getAge());
	}
}
