package com.softline.javacake.jdk8.lambda;

/**
 * @author softlinecode@gmail.com
 * first lambda study code
 */
public class BasicLambda {

	public static void main(String[] args) {

		String first = "test";
		String second = "test";

		//jdk 1.7 
		Integer.compare(first.length(), second.length());

		//jdk 1.8
		//		() -> Integer.compare(first.length(), second.length());

		//		() -> {
		//			for(int i =0 ; i < 1000 ; i++)
		//				System.out.print(i);
		//		}

		//		Search search = new Search();
	}
}
