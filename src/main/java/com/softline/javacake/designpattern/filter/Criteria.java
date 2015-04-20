package com.softline.javacake.designpattern.filter;

import java.util.List;

/**
 * @author softlinecode@gmail.com
 */
public interface Criteria {
	public List<Person> criteria(List<Person> persons);
}
