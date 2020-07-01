package com.dudchenko;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DivisionFormatterTest {
	
	private Division division;
	private DivisionFormatter formatter;
	
	@BeforeEach
	private void setUp() {
		division = new Division();
		formatter = new DivisionFormatter();
	}
	
	@Test
    public void givenNegativeDividend_whenMakeDivision_thenNegativeQuotient() {
		
		String actualResult = formatter.format(division.divide(-86, 12));
        		
		String expectedResult =   "_86|12" + System.lineSeparator() + 
                            " 84|--" + System.lineSeparator() + 
                            " --|-7" + System.lineSeparator() + 
                            "  2"; 
		assertEquals(expectedResult, actualResult.toString());
    }
	
	@Test
    public void givenNegativeDivisor_whenMakeDivision_thenNegativeQuotient() {
		
		String actualResult = formatter.format(division.divide(86, -12));
        String expectedResult =   "_86|12" + System.lineSeparator() + 
                            	" 84|--" + System.lineSeparator() + 
                            	" --|-7" + System.lineSeparator() + 
                            	"  2"; 
        assertEquals(expectedResult, actualResult.toString());
    }
	
	@Test
    public void givenDividendFewerThanDivisor_whenMakeDivision_thenQuotientIsZero() {
		
		String actualResult = formatter.format(division.divide(12, 86));
        String expectedResult =   "12/86=0";
        assertEquals(expectedResult, actualResult.toString());
    }
	
	@Test
    public void givenSingleDividendAndDivisor_whenMakeDivision_thenSingleQuotient() {
		
		String actualResult = formatter.format(division.divide(9, 2));
        String expectedResult =   "_9|2" + System.lineSeparator() + 
                            	" 8|-" + System.lineSeparator() + 
                            	" -|4" + System.lineSeparator() + 
                            	" 1"; 
        assertEquals(expectedResult, actualResult.toString());
    }
	
	@Test
    public void givenDivisionWithoutReminder_whenMakeDivision_thenQuotientWithoutReminder() {
		
		String actualResult = formatter.format(division.divide(8, 2));
		
        String expectedResult =   "_8|2" + System.lineSeparator() + 
                            	" 8|-" + System.lineSeparator() + 
                            	" -|4" + System.lineSeparator() + 
                            	" 0";
        assertEquals(expectedResult, actualResult.toString());
    }
	
    @Test
    public void givenDivision_whenMakeDivision_thenQuotient() {
    	
        String actualResult = formatter.format(division.divide(14789, 20));
    	
    	String expectedResult =   "_14789|20" + System.lineSeparator() + 
                            	" 140  |---" + System.lineSeparator() + 
                            	" ---  |739" + System.lineSeparator() +  
                            	"  _78" + System.lineSeparator() +  
                            	"   60" + System.lineSeparator() +  
                            	"   --" + System.lineSeparator() +  
                            	"  _189" + System.lineSeparator() +  
                            	"   180" + System.lineSeparator() +  
                            	"   ---" + System.lineSeparator() +  
                            	"     9"; 
        assertEquals(expectedResult, actualResult.toString());
    }
}