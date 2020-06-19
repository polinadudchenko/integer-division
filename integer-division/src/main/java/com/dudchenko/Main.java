package com.dudchenko;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Let's make a division! Type a dividend");
		int dividend = scanner.nextInt();
		System.out.println("Type a divisor, cannot be zero");
		int divisor = scanner.nextInt();
	
		Division division = new Division();
		String result = division.makeDivision(dividend, divisor);
		System.out.println(result);
	}
}
