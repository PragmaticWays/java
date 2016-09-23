package ch6;

/**
 * Month Class Demo Program 1
 */
public class MonthDemo1 {
	public static void main(String[] args) {
		
		// use the default constructor
		Month m = new Month();
		
		
		System.out.println("Month " + m.getMonthNumber() + " is " + m);
		
		// set the month number to the values 0 throught 12
		// (0 is invalid), and display the resulting month name
		
		
		for (int i = 0; i <= 12; i++) {
			m.setMonthNumber(i);
			System.out.println("Month " + m.getMonthNumber() + " is " + m);
			
		}
	}
}
