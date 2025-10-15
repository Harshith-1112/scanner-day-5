package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompundInterestCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the principal amount: ");
		double principal = scanner.nextDouble();

		System.out.println("Enter the rate of interest(%): ");
		double rate=scanner.nextDouble();
		
		System.out.println("Enter the time in years: ");
		double time=scanner.nextDouble();
		
		//double amount=principal*(1+rate/100)^time;
		double amount=principal*Math.pow((1+rate/100),time);
		double compoundInterest=amount-principal;
		
		System.out.println("Compund Interest: "+compoundInterest);
		System.out.println("Total Amount: "+ amount);
		scanner.close();
	}

}

