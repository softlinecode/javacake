package com.softline.javacake.log.format;

import java.util.Date;

/**
 * @author softlinecode@gmail.com
 * String.format exeample code
 */
public class StringFormat {

	public static void main(String[] args) {
		//%d is number format
		System.out.println(String.format("%d", 1000000000)); //1000000000
		System.out.println(String.format("%, d", 1000000000));//1,000,000,000

		//%f is floating-point number format
		System.out.println(String.format("%f", 1000000.1));//1000000.100000
		System.out.println(String.format("%,3.1f", 1000000.1111));//1,000,000.1

		//%t is date format
		System.out.println(String.format("%tc", new Date()));//월 8월 18 11:44:00 KST 2014
		System.out.println(String.format("%tr", new Date()));//11:44:29 오전
		System.out.println(String.format("%tA", new Date()));//월요일
		System.out.println(String.format("%tB", new Date()));//8월
		System.out.println(String.format("%tC", new Date()));//20
	}

}
