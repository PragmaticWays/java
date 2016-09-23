package ch7;

/**
 * Adam Allard
 * Chapter 7 PC 2 Payroll Class
 * This program creates an instance of the Payroll class which is 
 * an array of employees. the program will prompt the user to enter in
 * hours and pay rate info for each employee and it will display their gross wages. 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class PayrollDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Payroll p = new Payroll();
		
		int hours;
		double pay;
		
		for (int index = 0; index < 7; index++)
		{
			System.out.print("Enter the hours worked by employee number " +
					p.getEmployeeId(index) + ": ");
			hours = keyboard.nextInt();
			while (hours < 0)
			{
				System.out.print("ERROR: Enter 0 or greater for hours: ");
				hours = keyboard.nextInt();
			}
			p.setHours(index, hours);
			System.out.print("Enter the hourly pay rate for employee number " +
					p.getEmployeeId(index) + ": ");
			pay = keyboard.nextDouble();
			while (pay < 6)
			{
				System.out.print("ERROR: Enter 6.00 or greater for pay rate: ");
				pay = keyboard.nextDouble();
			}
			p.setPayRate(index, pay);
			p.setWages(index);
		}
		
		keyboard.close();
		
		
		// display the data
		System.out.println();
		System.out.println("PAYROLL DATA");
		System.out.println("============");
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		for (int index = 0; index < 7; index++)
		{
			System.out.println("Employee ID: " + p.getEmployeeId(index));
			System.out.println("Gross Pay:   $" + dollar.format(p.getGross(p.getEmployeeId(index))));
			System.out.println();
		}
		/*
		 * NOTE: I had it simpler before - line 50 
		 * dollar.format(p.getWages(index)) - which is a lot more simple
		 * and easy to understand. but due to how i read the instructions,
		 * it stated to make an additional method that accepts an employee id
		 * num to return the wages value, hence the not so pretty code above.
		 * 
		 * correct logic, but doesn't look the greatest. did you have a better way?
		 */
	}

}
