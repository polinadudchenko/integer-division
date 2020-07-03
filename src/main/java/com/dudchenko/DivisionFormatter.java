package com.dudchenko;

public class DivisionFormatter {

	public String format(DivisionResult result) {

		String dividend = String.valueOf(result.getDividend());
		String divisor = String.valueOf(result.getDivisor());

		StringBuilder resultString = new StringBuilder();

		if (result.isResultZero()) {
			resultString.append(String.format("%s" + "%s", dividend + "/" + divisor + "=", result.getQuotient()));
			return resultString.toString();
		}

		resultString.append(getFirstLine(dividend, divisor));
		resultString.append(getSecondLine(dividend, result));
		resultString.append(getThirdLine(dividend, result));

		int j = result.getMinuend().get(0).length();
		for (int i = 1; i < result.getMinuend().size() - 1; i++) {
			System.out.println(result.getMinuend());
			int elementLength = result.getSubtrahend().get(i).length();
			resultString.append(String.format("%" + (j + 2) + "s", "_" + result.getMinuend().get(i)));
			resultString.append(System.lineSeparator());
			resultString.append(String.format("%" + (j + 2) + "s", result.getSubtrahend().get(i)));
			resultString.append(System.lineSeparator());
			resultString.append(String.format("%" + (j + 2) + "s", repeatChar('-', elementLength)));
			resultString.append(System.lineSeparator());
			j++;
		}
		resultString.append(getLastLine(dividend, result));
		return resultString.toString();
	}

	private String repeatChar(char character, int times) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < times; i++) {
			result.append(character);
		}
		return result.toString();
	}

	private StringBuilder getFirstLine(String dividend, String divisor) {
		StringBuilder firstLine = new StringBuilder();
		firstLine.append("_");
		firstLine.append(dividend);
		firstLine.append("|");
		firstLine.append(divisor);
		firstLine.append(System.lineSeparator());

		return firstLine;
	}

	private StringBuilder getSecondLine(String dividend, DivisionResult result) {
		StringBuilder secondLine = new StringBuilder();
		secondLine.append(" ");
		secondLine.append(result.getSubtrahend().get(0));
		secondLine.append(repeatChar(' ', dividend.length() - result.getSubtrahend().get(0).length()));
		secondLine.append("|");
		secondLine.append(repeatChar('-', result.getQuotient().length()));
		secondLine.append(System.lineSeparator());

		return secondLine;
	}

	private StringBuilder getThirdLine(String dividend, DivisionResult result) {
		StringBuilder thirdLine = new StringBuilder();
		thirdLine.append(" ");
		thirdLine.append(repeatChar('-', result.getMinuend().get(0).length()));
		thirdLine.append(repeatChar(' ', dividend.length() - result.getMinuend().get(0).length()));
		thirdLine.append("|");
		thirdLine.append(result.getQuotient());
		thirdLine.append(System.lineSeparator());

		return thirdLine;
	}

	private StringBuilder getLastLine(String dividend, DivisionResult result) {
		StringBuilder lastLine = new StringBuilder();
		lastLine.append(repeatChar(' ', dividend.length()));
		lastLine.append(result.getMinuend().get(result.getMinuend().size() - 1));
		return lastLine;
	}
}
