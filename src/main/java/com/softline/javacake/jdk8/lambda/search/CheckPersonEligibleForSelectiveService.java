package com.softline.javacake.jdk8.lambda.search;

/**
 * @author softlinecode@gmail.com
 */
public class CheckPersonEligibleForSelectiveService implements CheckPerson {
	@Override
	public boolean test(Person p) {
		if (p.getAge() >= 21) {
			return true;
		}
		return false;
	}
}
