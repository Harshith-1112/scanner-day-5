package com.codegnan.fundamentals;
import java.util.Scanner;
public class simpleandcompound {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        
        System.out.println("Enter Annual Rate of Interest (in %): ");
        double rate = scanner.nextDouble();

        
        System.out.println("Enter Time (in months): ");
        int timeInMonths = scanner.nextInt();

        
        double timeInYears = timeInMonths / 12.0;

        
        double simpleInterest = (principal * rate * timeInYears) / 100;
        double totalWithSI = principal + simpleInterest;

        
        double compoundAmount = principal * Math.pow((1 + rate / 100), timeInYears);
        double compoundInterest = compoundAmount - principal;

        System.out.printf("%n--- Interest Calculation Results ---\n");
        System.out.printf("Time in years               : %.2f%n", timeInYears);
        System.out.printf("Simple Interest             : %.2f%n", simpleInterest);
        System.out.printf("Total with Simple Interest  : %.2f%n", totalWithSI);
        System.out.printf("Compound Interest           : %.2f%n", compoundInterest);
        System.out.printf("Total with Compound Interest: %.2f%n", compoundAmount);

        scanner.close();
	}

}