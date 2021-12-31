package com.calculator;

import java.util.*;

public class TestCalculator {

	public static void main(String[] args) {
		
		
		int choice;
		
		//Object creation
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("\n ----------------------------------");
		System.out.println("\n Chandana B R \n Associate Software Engineer Intern");
		System.out.println("\n ----------------------------------");
		while(true) {
			
			System.out.println("\n ********************** Calculator ******************************");
			System.out.println("1. Addition (+) ");
			System.out.println("2. Subtraction (-) ");
			System.out.println("3. Multiplication (*) ");
			System.out.println("4. Division (/) ");
			System.out.println("5. Exit ");
			
			System.out.print("Please enter your choice : ");
			
			//Choice Input for calculation
			choice = scan.nextInt();
			
			switch(choice) {
				
				case 1:
					calculator.addition();
					break;
				
				case 2:
					calculator.subtraction();
					break;
				
				case 3:
					calculator.multiplication();
					break;
					
				case 4:
					calculator.division();
					break;
					
				case 5:
					//scan.close();
					System.out.println("\nExiting!!!!");
					System.exit(1);
					
				default:
					System.out.println("\n Please enter valid option between 1-5");
					break;
					
				
			}		
			
		}
		
		
		
	}

}