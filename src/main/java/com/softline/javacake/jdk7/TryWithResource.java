package com.softline.javacake.jdk7;

import com.softline.javacake.jdk7.exception.ExceptionHandling;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author softlinecode@gmail.com
 */
public class TryWithResource {

	private static void notNeedClose() throws IOException {
		// in.close() called  exception occur
		String path = ExceptionHandling.class.getResource("").getPath();
		System.out.println(String.format("path:%s", path));
		try (Scanner in = new Scanner(Paths.get(path + "/words"))) {
			while (in.hasNext()) {
				System.out.println(in.next().toLowerCase());
			}
		}
	}

	public static void main(String[] args) throws Exception {
		notNeedClose();
	}
}
