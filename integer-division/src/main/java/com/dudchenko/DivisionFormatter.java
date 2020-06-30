package com.dudchenko;

public class DivisionFormatter {
	
	StringBuilder resultString = new StringBuilder();
	DivisionResult divisionResult = new DivisionResult();
	
	public StringBuilder format(String dividend, String divisor, DivisionResult result) {
		
//	first line
		resultString.append("_");
		resultString.append(dividend);
		resultString.append("|");
		resultString.append(divisor);
		resultString.append(System.lineSeparator());
		
//	second line
		resultString.append(" ");
		resultString.append(result.getSubtrahend().get(0));
		for (int i = 0; i < (dividend.length() - result.getSubtrahend().get(0).length()); i++) {
			resultString.append(" ");
		}
		resultString.append("|");
		for (int i = 0; i < result.getQuotient().length(); i++) {
			resultString.append("-");
		}		
		resultString.append(System.lineSeparator());

//	third line	
		resultString.append(" ");
		resultString.append(assemblyString(result.getMinuend().get(0).length(), "-"));
		resultString.append(assemblyString(dividend.length() - result.getMinuend().get(0).length(), " "));
		resultString.append("|");
		resultString.append(result.getQuotient());
		resultString.append(System.lineSeparator());
		
		int j = result.getMinuend().get(0).length();
		for (int i = 1; i < result.getMinuend().size() - 1; i++) {
			int elementLength = result.getSubtrahend().get(i).length();
			resultString.append(String.format("%" + (j + 2)  + "s", "_" + result.getMinuend().get(i)));
			resultString.append(System.lineSeparator());
			resultString.append(String.format("%" + (j + 2)  + "s", result.getSubtrahend().get(i)));
			resultString.append(System.lineSeparator());
			resultString.append(String.format("%" + (j + 2) + "s", assemblyString(elementLength, "-")));
			resultString.append(System.lineSeparator());
			
			if (i + 1 == result.getMinuend().size() - 1) {
                resultString.append(String.format("%" + (j + 2) + "s", result.getMinuend().get(i+1))).append(System.lineSeparator());
            }
			j++;
		}		
		return resultString;
	}
	
	private String assemblyString(int numberOfSymbols, String symbols) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < numberOfSymbols; i++) {
            string.append(symbols);
        }
        return string.toString();
    }
	
//	private boolean isLastElement(DivisionResult result, int index) {
//		return index == result.getResult().size() - 1;
//	}

	

}
