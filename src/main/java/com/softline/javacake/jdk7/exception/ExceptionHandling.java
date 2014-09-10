package com.softline.javacake.jdk7.exception;

import java.io.InterruptedIOException;
import java.net.UnknownHostException;

/**
 * @author softlinecode@gmail.com
 * jdk7 
 * try-with-resources
 * muti exception
 */
public class ExceptionHandling {

	private static void mutiExceptionHandle(boolean checked) {
		try {
			if (checked) {
				throw new InterruptedIOException();
			}
			if (checked) {
				throw new UnknownHostException();
			}
		} catch (InterruptedIOException | UnknownHostException e) { // muti exception handle
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		mutiExceptionHandle(true);
	}
}
