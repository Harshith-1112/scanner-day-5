package com.codegnan.fundamentals;
import java.util.Scanner;
public class studentsdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the student name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter the Roll number: ");
		int rollNumber = scanner.nextInt();
		
		System.out.println("Enter the student age: ");
		int age = scanner.nextInt();
		
		scanner.nextLine(); 
		 
		System.out.println("Enter the grade: ");
		String grade = scanner.nextLine();
		
		System.out.println("\n     Student Details     ");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age        : " + age);
        System.out.println("Grade      : " + grade);

        scanner.close();
	}

}