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
    public void shouldMakeDivision() {
        String expected =   "_14789│20\n" + 
                            " 140  │---\n" + 
                            " ---  │739\n" + 
                            "  _78\n" + 
                            "   60\n" + 
                            "   --\n" + 
                            "  _189\n" + 
                            "   180\n" + 
                            "   ---\n" + 
                            "     9\n";
        assertEquals(expected, division.makeDivision(14789, 20));
    }
}