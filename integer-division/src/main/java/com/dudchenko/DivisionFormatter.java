package com.dudchenko;

public class DivisionFormatter {
	
	StringBuilder resultString = new StringBuilder();
	DivisionResult divisionResult = new DivisionResult();
	
	public StringBuilder format(DivisionResult result) {
		
		String dividend = result.getInputData().get(0).toString();
		String divisor = result.getInputData().get(1).toString();
		
		if(result.getResultZero()) {
			resultString.append(String.format("%s" + "%d", dividend + "/" + divisor + "=", 0));
			return resultString;
		}
		
//	first line
		resultString.append("_");
		resultString.append(dividend);
		resultString.append("|");
		resultString.append(divisor);
		resultString.append(System.lineSeparator());
		
//	second line
		resultString.append(" ");
		resultString.append(result.getSubtrahend().get(0));
		resultString.append(assemblyString(dividend.length() - result.getSubtrahend().get(0).length(), " "));
		resultString.append("|");
		resultString.append(assemblyString(result.getQuotient().length(), "-"));	
		resultString.append(System.lineSeparator());

//	third line	
		resultString.append(" ");
		resultString.append(assemblyString(result.getMinuend().get(0).length(), "-"));
		resultString.append(assemblyString(dividend.length() - result.getMinuend().get(0).length(), " "));
		resultString.append("|");
		resultString.append(result.getQuotient());
		resultString.append(System.lineSeparator());

//	the other lines
		int j = result.getMinuend().get(0).length();
		for (int i = 1; i <result.getMinuend().size() - 1; i++) {
			System.out.println(result.getMinuend());
			int elementLength = result.getSubtrahend().get(i).length();
			resultString.append(String.format("%" + (j + 2) + "s", "_" + result.getMinuend().get(i)));
			resultString.append(System.lineSeparator());
			resultString.append(String.format("%" + (j + 2) + "s", result.getSubtrahend().get(i)));
			resultString.append(System.lineSeparator());
			resultString.append(String.format("%" + (j + 2) + "s", assemblyString(elementLength, "-")));
			resultString.append(System.lineSeparator());
			j++;
		}
//	append the last element
		resultString.append(assemblyString(dividend.length(), " "));
		resultString.append(result.getMinuend().get(result.getMinuend().size()-1));
		return resultString;
	}
	
	private String assemblyString(int numberOfSymbols, String symbols) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < numberOfSymbols; i++) {
            string.append(symbols);
        }
        return string.toString();
    }

}
