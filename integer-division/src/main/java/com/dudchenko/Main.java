package com.dudchenko;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Let's make a division! Type a dividend");
		String dividend = scanner.nextLine();
		System.out.println("Type a divisor, can not be zero");
		String divisor = scanner.nextLine();
	
		Division division = new Division();
		DivisionResult result = division.divide(Integer.parseInt(dividend), Integer.parseInt(divisor));
		
		DivisionFormatter formatter =  new DivisionFormatter();
				
		System.out.print(formatter.format(dividend, divisor, result));
	}
}
