package com.codegnan.fundamentals;

import java.util.Scanner;

public class CricleAreaCalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double radius=scanner.nextDouble();
		double area=3.14*radius*radius;
		System.out.println("Area of the circle: "+ String.format("%.2f\n",area));
		scanner.close();
	}

}
