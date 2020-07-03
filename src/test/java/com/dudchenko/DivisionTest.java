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
		expected.appendQuotient(0);
		DivisionResult actual = division.divide(2, 3);

		assertEquals(expected.getQuotient().toString(), actual.getQuotient().toString());
	}

	@Test
	public void givenDivisionWithoutReminder_whenDivide_thenLastMinuendElementIsZero() {
		DivisionResult expected = new DivisionResult();
		expected.addMinuend("21");
		expected.addMinuend("0");
		DivisionResult actual = division.divide(21, 3);

		assertEquals(expected.getMinuend().get(expected.getMinuend().size() - 1),
				actual.getMinuend().get(actual.getMinuend().size() - 1));
	}

	@Test
	public void givenDivisionWithManyDividers_whenDivide_thenAddMinuendWorkProperly() {
		DivisionResult expected = new DivisionResult();
		expected.addMinuend("147");
		expected.addMinuend("78");
		expected.addMinuend("189");
		expected.addMinuend("9");
		DivisionResult actual = division.divide(14789, 20);

		assertTrue(expected.getMinuend().size() == actual.getMinuend().size());
	}

	@Test
	public void givenDivisionWithManyDividers_whenDivide_thenAddSubtrahendWorkProperly() {
		DivisionResult expected = new DivisionResult();
		expected.addSubtrahend("140");
		expected.addSubtrahend("60");
		expected.addSubtrahend("180");
		DivisionResult actual = division.divide(14789, 20);

		assertTrue(expected.getSubtrahend().size() == actual.getSubtrahend().size());
	}

	@Test
	public void givenDivisionWithNegativeQuotient_whenDivide_thenGetNegativeQuotient() {
		DivisionResult expected = new DivisionResult();
		expected.appendQuotient(-7);
		DivisionResult actual = division.divide(-21, 3);

		assertEquals(expected.getQuotient().toString(), actual.getQuotient().toString());
	}

}
