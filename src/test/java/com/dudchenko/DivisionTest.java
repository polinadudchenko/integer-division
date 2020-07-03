package com.dudchenko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivisionTest {

	private Division division;

	@BeforeEach
	private void setUp() {
		division = new Division();
	}

	@Test
	public void givenDivisorIsZero_whenDivide_thenThrowException() {

		assertThrows(IllegalArgumentException.class, () -> {
			division.divide(2, 0);
		});
	}

	@Test
	public void givenDividendLessAsDivisor_whenDivide_thenResultZeroIsTrue() {
		DivisionResult expected = new DivisionResult();
		expected.setDividend(2);
		expected.setDivisor(3);
		expected.appendQuotient(0);
		expected.setResultZero(true);
		DivisionResult actual = division.divide(2, 3);

		assertEquals(expected, actual);
	}

	@Test
	public void givenDivisionWithoutReminder_whenDivide_thenLastMinuendElementIsZero() {
		DivisionResult expected = new DivisionResult();
		expected.setDividend(21);
		expected.setDivisor(3);
		expected.appendQuotient(7);
		expected.addMinuend("21");
		expected.addSubtrahend("21");
		expected.addMinuend("0");
		DivisionResult actual = division.divide(21, 3);

		assertEquals(expected, actual);
	}

	@Test
	public void givenDivisionWithManyDividers_whenDivide_thenDivisionWorkProperly() {
		DivisionResult expected = new DivisionResult();
		expected.setDividend(14789);
		expected.setDivisor(20);
		expected.appendQuotient(739);
		expected.addMinuend("147");
		expected.addSubtrahend("140");
		expected.addMinuend("78");
		expected.addSubtrahend("60");
		expected.addMinuend("189");
		expected.addSubtrahend("180");
		expected.addMinuend("9");
		DivisionResult actual = division.divide(14789, 20);

		assertEquals(expected, actual);
	}

	@Test
	public void givenDivisionWithNegativeQuotient_whenDivide_thenGetNegativeQuotient() {
		DivisionResult expected = new DivisionResult();
		expected.setDividend(21);
		expected.setDivisor(3);
		expected.appendQuotient(-7);
		expected.addMinuend("21");
		expected.addSubtrahend("21");
		expected.addMinuend("0");
		DivisionResult actual = division.divide(-21, 3);

		assertEquals(expected, actual);
	}

}
