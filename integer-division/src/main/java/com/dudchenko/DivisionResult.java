package com.dudchenko;

import java.util.ArrayList;

public class DivisionResult {
	
    private ArrayList<Integer> inputData = new ArrayList<Integer>();
    private ArrayList<String> minuend = new ArrayList<String>();
    private ArrayList<String> subtrahend = new ArrayList<String>();
    private StringBuilder quotient = new StringBuilder();    
	private boolean resultZero;
		
	public ArrayList<Integer> getInputData() {
		return inputData;
	}
	
	public void addInputData(int inputData) {
		this.inputData.add(inputData);
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
	
	public boolean getResultZero() {
		return resultZero;
	}
	
	public void setResultZero(boolean resultZero){
		this.resultZero = resultZero;
		
	}
}
