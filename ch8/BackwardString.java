package ch8;
import java.util.Scanner;

/** Adam Allard
 *  CH 8 PC 1 Backward String
 *  This program accepts a user input string and returns 
 *  that string backwards.
 */

public class BackwardString 
{
	public static void main(String[] args)
	{
		String str;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter Something: ");
		str = keyboard.nextLine();
		
		System.out.println(reverseString(str));
		
		keyboard.close();
	}

	// this method accepts a string and returns its contents backwards
	public static String reverseString(String strng)
	{
		int index;
		int len = strng.length();
    
		StringBuilder bkwrdStr = new StringBuilder(len);

		for (index = (len - 1); index >= 0; index--)
		{
			bkwrdStr.append(strng.charAt(index));
		}

		return bkwrdStr.toString();
	}
}
