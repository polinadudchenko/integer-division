package com.dudchenko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivisionTest {

	private Division division;
	private DivisionResult result;

	@BeforeEach
	private void setUp() {
		division = new Division();
		result = new DivisionResult();
	}

	@Test
	public void givenDivisorIsZero_whenDivide_thenThrowException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			division.divide(2, 0);
		});
	}

	@Test
	public void givenDividendLessAsDivisor_whenDivide_thenResultZeroIsTrue() {
		assertEquals(true, division.divide(2, 3).getResultZero());
	}

}
