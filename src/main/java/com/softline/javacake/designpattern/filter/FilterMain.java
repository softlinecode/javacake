package com.softline.javacake.designpattern.filter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author softlinecode@gmail.com
 */
public class FilterMain {
	public static void main(String... args) {
		List<Person> persons = Lists.newArrayList();
		persons.add(new Person("test", GenderType.FEMALE));
		persons.add(new Person("test4", GenderType.FEMALE));
		persons.add(new Person("test1", GenderType.MALE));
		persons.add(new Person("test2", GenderType.MALE));

		Criteria femaleCriteria = new FemaleCriteria();
		Criteria maleCriteria = new MaleCriteria();
		List<Person> females = femaleCriteria.criteria(persons);
		print(females);
		List<Person> males = maleCriteria.criteria(persons);
		print(males);
	}

	public static void print(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", GenderType : " + person.getGenderType());
		}
	}
}
