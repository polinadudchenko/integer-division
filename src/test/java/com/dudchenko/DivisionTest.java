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
		assertTrue(division.divide(2, 3).getResultZero());
	}

	@Test
	public void givenDivisionWithoutReminder_whenDivide_thenLastMinuendElementIsZero() {
		DivisionResult result = division.divide(21, 3);
		String actual = result.getMinuend().get(result.getMinuend().size() - 1);
		assertEquals("0", actual);
	}

	@Test
	public void givenDividendBiggerAsDivisor_whenDivide_thenMinuendSizeBiggerAsSubtrahendSize() {
		DivisionResult result = division.divide(25, 12);
		assertTrue(result.getMinuend().size() > result.getSubtrahend().size());
	}

	@Test
	public void givenDivisionWithNegativeQuotient_whenDivide_thenGetNegativeQuotient() {
		DivisionResult result = division.divide(-21, 3);
		String actual = result.getQuotient().toString();
		assertEquals("-7", actual);
	}

}
