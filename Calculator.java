package com.calculator;

import java.util.*;
import java.text.NumberFormat;

public class Calculator {
	
	private double number1;
	private double number2;
	Scanner scan;
	
	//for formatting the output
	NumberFormat nf;
	
	public Calculator () {
		this.scan = new Scanner(System.in);
		this.nf = NumberFormat.getNumberInstance();
		nf.setGroupingUsed(false) ; // don't group by threes 
		nf.setMaximumFractionDigits(2) ; //we set the max number of decimal digits.
		nf.setMinimumFractionDigits(2) ; //we set the min number of decimal digits.
		
	}
	
	
	void takeInput() {
		System.out.print("Enter first number : ");
		this.number1 = scan.nextDouble();
		System.out.print("Enter second number : ");
		this.number2 = scan.nextDouble();
	}
	
	void addition() {
		takeInput();
	
		System.out.println("\n");
		System.out.println("Adding " + number1 + " + " + number2 + "\nResult is " + nf.format(this.number1 + this.number2));
	}
	
	
	void subtraction() {
		takeInput();
		
		System.out.println("\n");
		System.out.println("Subtracting " + number1 + " - " + number2 + " \nResult is " +  nf.format(this.number1 - this.number2));
	}
	
	void multiplication() {
		takeInput();
		
		System.out.println("\n");
		System.out.println("Multipling " + number1 + " * " + number2 + " \nResult is " +  nf.format(this.number1 * this.number2));
	}
	
	void division() {
		takeInput();
		
		//Validation
		if ( this.number2 == 0 ) {
			System.out.println("Second number cannot be zero(infinity)");
			takeInput();
		}
		
		System.out.println("\n");
		System.out.println("Dividing " + number1 + " / " + number2 + " \nResult is " +  nf.format(this.number1 / this.number2));
	}
	
}