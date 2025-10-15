package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the principal amount: ");
		double principal = scanner.nextDouble();

		System.out.println("Enter the rate of interest(%): ");
		double rate=scanner.nextDouble();
		
		System.out.println("Enter the time in years: ");
		double time=scanner.nextDouble();
		
		double interest=(principal*rate*time)/100;
		double totalAmount=principal+interest;
		
		System.out.println("Simple Interest: "+interest);
		System.out.println("Total Amount: "+totalAmount);
		scanner.close();

	}

}
