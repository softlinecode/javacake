package com.softline.javacake.jdk8.lambda.search;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author softlinecode@gmail.com
 */
public class PersonSearchCake {

	public static void main(String[] args) {
		List<Person> persons = Lists.newArrayList();
		persons.add(generatePerson("test1", Person.Sex.FEMALE, 20, "tet1@test.com"));
		persons.add(generatePerson("test2", Person.Sex.MALE, 21, "tet2@test.com"));
		persons.add(generatePerson("test3", Person.Sex.FEMALE, 22, "tet3@test.com"));
		persons.add(generatePerson("test4", Person.Sex.MALE, 23, "tet4@test.com"));

		printOlderThanV2(persons, 21);

		printOlderThanV2(persons, new CheckPersonEligibleForSelectiveService());

		printOlderThanV2(persons, new CheckPerson() {
			public boolean test(Person p) {
				if (p.getAge() >= 21) {
					return true;
				}
				return false;
			}
		});

		printOlderThanV2(
				persons,
				(Person p) -> p.getAge() >= 21
		);
	}

	public static Person generatePerson(String name, Person.Sex gender, int age, String email) {
		Person person = new Person();
		person.setName(name);
		person.setGender(gender);
		person.setAge(age);
		person.setEmail(email);
		return person;
	}

	public static void printOlderThanV2(List<Person> persons, int age) {
		for (Person p : persons) {
			if (p.getAge() >= age) {
				System.out.println("v1:" + p.toString());
			}
		}
	}

	public static void printOlderThanV2(List<Person> roster, CheckPerson tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				System.out.println("v2:" + p.toString());
			}
		}
	}
}
