package com.dudchenko;

class Division {
	  
    private DivisionResult divisionResult = new DivisionResult();
    private StringBuilder reminder = new StringBuilder();

    public DivisionResult divide(int dividend, int divisor) {
    	
    	divisionResult.appendQuotient(dividend / divisor);
    	
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        divisionResult.addInputData(dividend);
    	divisionResult.addInputData(divisor);

        if (dividend < divisor) {
            divisionResult.setResultZero(true);
            return divisionResult;
        }

        String[] digits = String.valueOf(dividend).split("");
        Integer reminderNumber;
        Integer multiplyResult;
        Integer divisorDigit = calculateDigit(divisor);
        Integer mod;

        for (int i = 0; i < digits.length; i++) {
            reminder.append(digits[i]);
            reminderNumber = Integer.parseInt(reminder.toString());

            if (reminderNumber >= divisor) {
                mod = reminderNumber % divisor;
                multiplyResult = reminderNumber / divisor * divisor;

                divisionResult.addMinuend(reminderNumber.toString());
                divisionResult.addSubtrahend(multiplyResult.toString());
                
               

                reminder.replace(0, reminder.length(), mod.toString());
                reminderNumber = Integer.parseInt(reminder.toString());
            } 
            if (i == digits.length - 1) {
            	divisionResult.addMinuend(reminderNumber.toString());
            }
        }
        return divisionResult;
    }

    private int calculateDigit(int i) {
        return (int) Math.log10(i) + 1;
    }

}