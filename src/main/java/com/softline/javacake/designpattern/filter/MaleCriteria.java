package com.softline.javacake.designpattern.filter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author softlinecode@gmail.com
 */
public class MaleCriteria implements Criteria {

	@Override
	public List<Person> criteria(List<Person> persons) {
		List<Person> list = Lists.newArrayList();
		for (Person person : persons) {
			if (person.getGenderType() == GenderType.MALE) {
				list.add(person);
			}
		}
		return list;
	}
}
