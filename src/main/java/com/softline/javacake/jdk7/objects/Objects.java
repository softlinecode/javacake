package com.softline.javacake.jdk7.objects;

/**
 * @author softlinecode@gmail.com
 * http://baptiste-wicht.com/posts/2010/04/java-7-the-new-java-util-objects-class.html
 */
public class Objects {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1 == obj2);//false
		System.out.println(obj1.equals(obj2));//true
		System.out.println(obj1.getClass() == obj2.getClass());//true
		System.out.println(obj1.getClass() == obj2.getClass());//false

		System.out.println(java.util.Objects.equals(obj1, obj2));//false
		obj1 = null;
		System.out.println(java.util.Objects.equals(obj1, obj2));//false
		System.out.println(java.util.Objects.nonNull(obj1));//false
		System.out.println(java.util.Objects.requireNonNull(obj1, "object is null"));//java.lang.NullPointerException occur
	}

}
