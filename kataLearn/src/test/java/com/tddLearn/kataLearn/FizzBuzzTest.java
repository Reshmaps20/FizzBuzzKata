package com.tddLearn.kataLearn;

import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzbzz = new FizzBuzz();
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZBUZZ = "Fizz Buzz";

	@Test
	public void testGetFizzBuzzValue_inputNumIs1_returns1() {

		int input = 1;
		String result = fizzbzz.getFizzBuzzValue(input);
		assertEquals("1", result);
	}

	@Test
	public void testGetFizzBuzzValue_inputNumIs3_returnsFizz() {

		int input = 3;
		String result = fizzbzz.getFizzBuzzValue(input);
		assertEquals(FIZZ, result);
	}

	@Test
	public void testGetFizzBuzzValue_inputNumIsMultipleOf3_returnsFizz() {

		int input = 12;
		String result = fizzbzz.getFizzBuzzValue(input);
		assertEquals(FIZZ, result);
	}

	@Test
	public void testGetFizzBuzzValue_inputNumIs5_returnsBuzz() {

		int input = 5;
		String result = fizzbzz.getFizzBuzzValue(input);
		assertEquals(BUZZ, result);
	}

	@Test
	public void testGetFizzBuzzValue_inputNumIsMultipleOf5_returnsBuzz() {

		int input = 50;
		String result = fizzbzz.getFizzBuzzValue(input);
		assertEquals(BUZZ, result);
	}

	@Test
	public void testGetFizzBuzzValue_inputNumIsMultipleOf3And5_returnsFizzBuzz() {

		int input = 30;
		String result = fizzbzz.getFizzBuzzValue(input);
		assertEquals(FIZZBUZZ, result);
	}

	@Test
	public void testFizzBuzz_inputNumIs0_returnsFizzBuzz() {

		int input = 0;
		String result = fizzbzz.getFizzBuzzValue(input);
		assertEquals("0", result);
	}

}
