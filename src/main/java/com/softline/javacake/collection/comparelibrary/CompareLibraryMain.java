package com.softline.javacake.collection.comparelibrary;

/**
 * @author softlinecode@gmail.com
 */
public class CompareLibraryMain {

	public static void main(String[] args) {
		Student test1 = make("test1", 170, 70, "a");
		Student test2 = make("test2", 171, 56, "c");
		Student test3 = make("test3", 180, 56, "b");
		Student test4 = make("test4", 190, 100, "c");
		Student test5 = make("test5", 190, 100, "c");
	}

	public static Student make(String name, int height, int weight, String school) {
		Student student = new Student();
		student.setName(name);
		student.setHeight(height);
		student.setWeight(weight);
		student.setSchool(school);
		return student;
	}
}
