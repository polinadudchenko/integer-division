package com.dudchenko;

import lombok.Data;

@Data
public class DivisionResult {
	
	private StringBuilder result = new StringBuilder();
    private StringBuilder quotient = new StringBuilder();
	private boolean resultZero;
	
	public boolean getResultZero() {
		return resultZero;
	}
	
	public void setResultZero(boolean resultZero){
		this.resultZero = resultZero;
		
	}
	
	public StringBuilder getResult() {
		return result;
	}
	
	public void appendResult(String result) {
		this.result.append(result).append(" ");
	}
	
	public StringBuilder getQuotient() {
		return quotient;
	}
	
	public void appendQuotient(String quotient) {
		this.quotient.append(quotient);
	}
}
