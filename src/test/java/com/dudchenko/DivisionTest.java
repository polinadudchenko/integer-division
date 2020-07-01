package com.dudchenko;

import static org.junit.jupiter.api.Assertions.*;

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
		fail("Not yet implemented");
	}
	
	@Test
	public void givenDividendLessAsDivisor_whenDivide_thenResultZeroIsTrue() {
		division.divide(2,3);
		assertEquals(true, result.getResultZero());
	}
	
//	@Test
//	public void givenDividendBiggerAsDivisor_whenDivide_thenMinuendArrayBiggerAsSubtrahendArray() {
//		Assertions.
//	}

}
