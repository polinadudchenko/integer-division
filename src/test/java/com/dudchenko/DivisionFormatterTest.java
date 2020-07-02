package com.dudchenko;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DivisionFormatterTest {

	private Division division;
	private DivisionFormatter formatter;
	private StringBuilder expectedResult;

	@BeforeEach
	private void setUp() {
		division = new Division();
		formatter = new DivisionFormatter();
		expectedResult = new StringBuilder();
	}

	@Test
	public void givenNegativeDividend_whenMakeDivision_thenNegativeQuotient() {

		String actualResult = formatter.format(division.divide(-86, 12));

		expectedResult.append("_86|12").append(System.lineSeparator());
		expectedResult.append(" 84|--").append(System.lineSeparator());
		expectedResult.append(" --|-7").append(System.lineSeparator());
		expectedResult.append("  2");
		assertEquals(expectedResult.toString(), actualResult);
	}

	@Test
	public void givenNegativeDivisor_whenMakeDivision_thenNegativeQuotient() {

		String actualResult = formatter.format(division.divide(86, -12));
		expectedResult.append("_86|12").append(System.lineSeparator());
		expectedResult.append(" 84|--").append(System.lineSeparator());
		expectedResult.append(" --|-7").append(System.lineSeparator());
		expectedResult.append("  2");
		assertEquals(expectedResult.toString(), actualResult);
	}

	@Test
	public void givenDividendFewerThanDivisor_whenMakeDivision_thenQuotientIsZero() {

		String actualResult = formatter.format(division.divide(12, 86));
		expectedResult.append("12/86=0");
		assertEquals(expectedResult.toString(), actualResult);
	}

	@Test
	public void givenSingleDividendAndDivisor_whenMakeDivision_thenSingleQuotient() {

		String actualResult = formatter.format(division.divide(9, 2));
		expectedResult.append("_9|2").append(System.lineSeparator());
		expectedResult.append(" 8|-").append(System.lineSeparator());
		expectedResult.append(" -|4").append(System.lineSeparator());
		expectedResult.append(" 1");
		assertEquals(expectedResult.toString(), actualResult);
	}

	@Test
	public void givenDivisionWithoutReminder_whenMakeDivision_thenQuotientWithoutReminder() {

		String actualResult = formatter.format(division.divide(8, 2));

		expectedResult.append("_8|2").append(System.lineSeparator());
		expectedResult.append(" 8|-").append(System.lineSeparator());
		expectedResult.append(" -|4").append(System.lineSeparator());
		expectedResult.append(" 0");
		assertEquals(expectedResult.toString(), actualResult);
	}

	@Test
	public void givenDivision_whenMakeDivision_thenQuotient() {

		String actualResult = formatter.format(division.divide(14789, 20));

		expectedResult.append("_14789|20").append(System.lineSeparator());
		expectedResult.append(" 140  |---").append(System.lineSeparator());
		expectedResult.append(" ---  |739").append(System.lineSeparator());
		expectedResult.append("  _78").append(System.lineSeparator());
		expectedResult.append("   60").append(System.lineSeparator());
		expectedResult.append("   --").append(System.lineSeparator());
		expectedResult.append("  _189").append(System.lineSeparator());
		expectedResult.append("   180").append(System.lineSeparator());
		expectedResult.append("   ---").append(System.lineSeparator());
		expectedResult.append("     9");
		assertEquals(expectedResult.toString(), actualResult);
	}
}