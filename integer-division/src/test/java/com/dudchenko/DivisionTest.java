package com.dudchenko;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DivisionTest {
	
	private Division division;
	private DivisionFormatter formatter;
	
	@BeforeEach
	private void setUp() {
		division = new Division();
		formatter = new DivisionFormatter();
	}
	
//	@Test
//    public void givenNegativeDividend_whenMakeDivision_thenNegativeQuotient() {
//        DivisionResult result = division.divide(-86, 12);
//		
//		String expected =   "_86|12%n" + 
//                            " 84|--%n" + 
//                            " --|-7%n" + 
//                            "  2%n";
//        assertEquals(expected, formatter.format("-86", "12", result));
//    }
//	
//	@Test
//    public void givenNegativeDivisor_whenMakeDivision_thenNegativeQuotient() {
//        String expected =   "_86|12%n" + 
//                            " 84|--%n" + 
//                            " --|-7%n" + 
//                            "  2%n";
//        assertEquals(expected, division.divide(86, -12));
//    }
//	
//	@Test
//    public void givenDividendFewerThanDivisor_whenMakeDivision_thenQuotientIsZero() {
//        String expected =   "Quotient = 0";
//        assertEquals(expected, division.divide(12, 86));
//    }
//	
//	@Test
//    public void givenSingleDividendAndDivisor_whenMakeDivision_thenSingleQuotient() {
//        String expected =   "_9|2%n" + 
//                            " 8|-%n" + 
//                            " -|4%n" + 
//                            " 1%n";
//        assertEquals(expected, division.divide(9, 2));
//    }
//	
//	@Test
//    public void givenDivisionWithoutReminder_whenMakeDivision_thenQuotientWithoutReminder() {
//        String expected =   "_8|2%n" + 
//                            " 8|-%n" + 
//                            " -|4%n" + 
//                            " 0%n";
//        assertEquals(expected, division.divide(8, 2));
//    }
//	
    @Test
    public void givenDivision_whenMakeDivision_thenQuotient() {
    	
    	
        StringBuilder actual = formatter.format("14789", "20", division.divide(14789, 20));
    	
    	String expected =   "_14789|20" + System.lineSeparator() + 
                            " 140  |---" + System.lineSeparator() + 
                            " ---  |739" + System.lineSeparator() +  
                            "  _78" + System.lineSeparator() +  
                            "   60" + System.lineSeparator() +  
                            "   --" + System.lineSeparator() +  
                            "  _189" + System.lineSeparator() +  
                            "   180" + System.lineSeparator() +  
                            "   ---" + System.lineSeparator() +  
                            "     9" + System.lineSeparator();
        assertEquals(expected, actual.toString());
    }
}