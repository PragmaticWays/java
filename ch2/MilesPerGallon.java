package ch2;

import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		double milesDriven;
		double gallonsOfGas;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many miles were driven? ");
		milesDriven = keyboard.nextDouble();
		
		System.out.print("How much gas was used? ");
		gallonsOfGas = keyboard.nextDouble();
		
		System.out.print("Your vehicle got " + (milesDriven / gallonsOfGas) +
				" MPG");
		
		keyboard.close();
	}

}
