package com.dudchenko;

import java.util.ArrayList;

public class DivisionResult {

	private int dividend;
	private int divisor;
	private ArrayList<String> minuend = new ArrayList<String>();
	private ArrayList<String> subtrahend = new ArrayList<String>();
	private StringBuilder quotient = new StringBuilder();
	private boolean resultZero;

	public int getDividend() {
		return dividend;
	}

	public void setDividend(int dividend) {
		this.dividend = dividend;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	public ArrayList<String> getMinuend() {
		return minuend;
	}

	public void addMinuend(String minuend) {
		this.minuend.add(minuend);
	}

	public ArrayList<String> getSubtrahend() {
		return subtrahend;
	}

	public void addSubtrahend(String subtrahend) {
		this.subtrahend.add(subtrahend);
	}

	public StringBuilder getQuotient() {
		return quotient;
	}

	public void appendQuotient(int quotient) {
		this.quotient.append(quotient);
	}

	public boolean isResultZero() {
		return resultZero;
	}

	public void setResultZero(boolean resultZero) {
		this.resultZero = resultZero;

	}
}
