package ch4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * SoftwareSalesDemo Program
 */

public class SoftwareSalesDemo {
	public static void main(String[] args) {
		int units;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the units sold: ");
		units = keyboard.nextInt();
		
		SoftwareSales sales = new SoftwareSales(units);
		
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		System.out.println("Units sold: " + sales.getUnitsSold());
		System.out.println("Discount: $" + dollar.format(sales.getDiscount()));
		System.out.println("Cost: $" + dollar.format(sales.getCost()));
		
		keyboard.close();
	}
}
