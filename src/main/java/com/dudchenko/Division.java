package com.dudchenko;

class Division {

	public DivisionResult divide(int dividend, int divisor) {

		DivisionResult divisionResult = new DivisionResult();
		StringBuilder reminder = new StringBuilder();

		if (divisor == 0) {
			throw new IllegalArgumentException("Divisor cannot be 0, division by zero");
		}

		divisionResult.appendQuotient(dividend / divisor);

		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);

		divisionResult.setDividend(dividend);
		divisionResult.setDivisor(divisor);

		if (dividend < divisor) {
			divisionResult.setResultZero(true);
			return divisionResult;
		}

		String[] digits = String.valueOf(dividend).split("");
		for (int i = 0; i < digits.length; i++) {
			reminder.append(digits[i]);
			int reminderNumber = Integer.parseInt(reminder.toString());

			if (reminderNumber >= divisor) {
				int mod = reminderNumber % divisor;
				int multiplyResult = reminderNumber / divisor * divisor;

				divisionResult.addMinuend(String.valueOf(reminderNumber));
				divisionResult.addSubtrahend(String.valueOf(multiplyResult));

				reminder.replace(0, reminder.length(), String.valueOf(mod));
				reminderNumber = Integer.parseInt(reminder.toString());
			}
			if (i == digits.length - 1) {
				divisionResult.addMinuend(String.valueOf(reminderNumber));
			}
		}
		return divisionResult;
	}
}