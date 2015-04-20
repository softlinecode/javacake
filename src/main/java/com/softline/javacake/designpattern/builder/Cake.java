package com.softline.javacake.designpattern.builder;

/**
 * @author softlinecode@gmail.com
 */
public class Cake {

	private final String cakeName;
	private final int calories;

	public static class CakeBuilder implements Builder<Cake> {

		private final String cakeName;

		private int calories;

		public CakeBuilder(String cakeName) {
			this.cakeName = cakeName;
		}

		public CakeBuilder calories(int calories) {
			this.calories = calories;
			return this;
		}

		@Override
		public Cake build() {
			return new Cake(this);
		}
	}

	private Cake(CakeBuilder cakeBuilder) {
		cakeName = cakeBuilder.cakeName;
		calories = cakeBuilder.calories;
	}

	public String getCakeName() {
		return cakeName;
	}

	public int getCalories() {
		return calories;
	}

	public static void main(String... args) {
		Cake cake = new CakeBuilder("pizza").calories(11).build();
		System.out.println(String.format("cakeName:%s", cake.getCakeName()));
		System.out.println(String.format("calories:%s" + "" + "", cake.getCalories()));
	}
}
