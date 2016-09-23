package ch5;

import java.util.Scanner;

/** Adam Allard
 * Chapter 5 PC 5 Hotel Occupancy
 * This program calculates the occupancy rate for each floor in a hotel room.
 */

public class HotelOccupancy {
	public static void main(String[] args) {
		int floors,
		    temp,
		    roomsTotal = 0,
		    roomsOccupied = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many floors does the hotel have? ");
		floors = keyboard.nextInt();
		
		while (floors < 1) 
		{
			System.out.print("Invalid. Enter 1 or more: ");
			floors = keyboard.nextInt();
		}
		
		for (int x = 0; x < floors; x++)
		{
			System.out.print("How many rooms does floor " + (x + 1) + " have? ");
			// temp (temporary) is used in place of roomTotal for validation
			temp = keyboard.nextInt();
			while (temp < 10)
			{
				System.out.print("Invalid. Enter 10 or more: ");
				temp = keyboard.nextInt();
			}
			// if temp is >= 10, add it to roomsTotal
			roomsTotal += temp;
			
			System.out.print("How many occupied rooms does floor " + (x + 1) + " have? ");
			// temp is used in place of roomOccupied for validation 
			temp = keyboard.nextInt();
			while (temp < 0)
			{
				System.out.print("Invalid. Enter 1 or more: ");
				temp = keyboard.nextInt();
			}
			// if temp is >= 0, add it to roomsOccupied
			roomsOccupied += temp;
		}
		
		System.out.println("Number of rooms: " + roomsTotal);
		System.out.println("Occupied rooms: " + roomsOccupied);
		System.out.println("Vacant rooms: " + (roomsTotal - roomsOccupied));
		System.out.println("Occupancy rate: " + ((double)roomsOccupied / (double)roomsTotal));
		
		keyboard.close();
	}

}
