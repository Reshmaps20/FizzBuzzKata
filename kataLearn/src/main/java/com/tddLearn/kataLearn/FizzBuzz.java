package com.tddLearn.kataLearn;

public class FizzBuzz {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZBUZZ = "Fizz Buzz";

	public String getFizzBuzzValue(int num) {

		if (num == 0)
			return String.valueOf(num);
		if (isMultipleOf3(num) && isMultipleOf5(num))
			return FIZZBUZZ;
		if (isMultipleOf3(num))
			return FIZZ;
		if (isMultipleOf5(num))
			return BUZZ;
		return String.valueOf(num);

	}

	private boolean isMultipleOf5(int num) {
		return num % 5 == 0;
	}

	private boolean isMultipleOf3(int num) {
		return num % 3 == 0;
	}
}
