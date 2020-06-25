package com.dudchenko;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DivisionTest {
	
	private Division division;
	
	@BeforeEach
	private void setUp() {
		division = new Division();
	}
	
	@Test
    public void givenNegativeDividend_whenMakeDivision_thenNegativeQuotient() {
        String expected =   "_86|12%n" + 
                            " 84|--%n" + 
                            " --|-7%n" + 
                            "  2%n";
        assertEquals(expected, division.divide(-86, 12));
    }
	
	@Test
    public void givenNegativeDivisor_whenMakeDivision_thenNegativeQuotient() {
        String expected =   "_86|12%n" + 
                            " 84|--%n" + 
                            " --|-7%n" + 
                            "  2%n";
        assertEquals(expected, division.divide(86, -12));
    }
	
	@Test
    public void givenDividendFewerThanDivisor_whenMakeDivision_thenQuotientIsZero() {
        String expected =   "Quotient = 0";
        assertEquals(expected, division.divide(12, 86));
    }
	
	@Test
    public void givenSingleDividendAndDivisor_whenMakeDivision_thenSingleQuotient() {
        String expected =   "_9|2%n" + 
                            " 8|-%n" + 
                            " -|4%n" + 
                            " 1%n";
        assertEquals(expected, division.divide(9, 2));
    }
	
	@Test
    public void givenDivisionWithoutReminder_whenMakeDivision_thenQuotientWithoutReminder() {
        String expected =   "_8|2%n" + 
                            " 8|-%n" + 
                            " -|4%n" + 
                            " 0%n";
        assertEquals(expected, division.divide(8, 2));
    }
	
    @Test
    public void givenDivision_whenMakeDivision_thenQuotient() {
        String expected =   "_14789|20%n" + 
                            " 140  |---%n" + 
                            " ---  |739%n" + 
                            "  _78%n" + 
                            "   60%n" + 
                            "   --%n" + 
                            "  _189%n" + 
                            "   180%n" + 
                            "   ---%n" + 
                            "     9%n";
        assertEquals(expected, division.divide(14789, 20));
    }
}