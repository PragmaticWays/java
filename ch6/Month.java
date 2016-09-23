package ch6;

/**
 * Adam Allard
 * Chapter 6 PC 5 Month Class
 * This class demonstrates different methods and techniques for
 * creating classes and objects. it can associate a month number
 * with the appropriate name and vice versa. it can compare
 * two months to see if they are equal, greater than, or less than another.
 */

public class Month {
	private int monthNumber;
	
	// constructor with no arguments 
	public Month() {
		monthNumber = 1;
	}
	
	// constructor with one int argument. if argument is not in valid month range, 
	//it will be assigned to 1 
	public Month(int m) {
		monthNumber = m;
		if (monthNumber < 1 || monthNumber > 12) {
			monthNumber = 1;
		}
	}
	
	// constructor with a string argument used to assign a month string literal
	// to associate it with the corresponding month number
	public Month(String m) {
		if (m.equalsIgnoreCase("january")) {
			monthNumber = 1;
		} else if (m.equalsIgnoreCase("february")) {
			monthNumber = 2;
		} else if (m.equalsIgnoreCase("march")) {
			monthNumber = 3;
		} else if (m.equalsIgnoreCase("april")) {
			monthNumber = 4;
		} else if (m.equalsIgnoreCase("may")) {
			monthNumber = 5;
		} else if (m.equalsIgnoreCase("june")) {
			monthNumber = 6;
		} else if (m.equalsIgnoreCase("jule")) {
			monthNumber = 7;
		} else if (m.equalsIgnoreCase("august")) {
			monthNumber = 8;
		} else if (m.equalsIgnoreCase("september")) {
			monthNumber = 9;
		} else if (m.equalsIgnoreCase("october")) {
			monthNumber = 10;
		} else if (m.equalsIgnoreCase("november")) {
			monthNumber = 11;
		} else if (m.equalsIgnoreCase("december")) {
			monthNumber = 12;
		}
	}
	
	// setter
	public void setMonthNumber(int m) {
		monthNumber = m;
		if (monthNumber < 1 || monthNumber > 12) {
			monthNumber = 1;
		}
	}
	
	// getters
	public int getMonthNumber() {
		return monthNumber;
	}
	
	public String getMonthName() {
		String mName;
		switch (monthNumber) {
		case 1:
			mName = "January";
			break;
		case 2:
			mName = "February";
			break;
		case 3:
			mName = "March";
			break;
		case 4:
			mName = "April";
			break;
		case 5:
			mName = "May";
			break;
		case 6:
			mName = "June";
			break;
		case 7:
			mName = "July";
			break;
		case 8:
			mName = "August";
			break;
		case 9:
			mName = "September";
			break;
		case 10:
			mName = "October";
			break;
		case 11:
			mName = "November";
			break;
		case 12:
			mName = "December";
			break;
		default:
			mName = "Unknown";
		}
		return mName;
	}
	
	// used to show month name as a string literal
	public String toString() {
		return getMonthName();
	}
	
	// used to check if two months are the same
	public boolean equals(Month month2) {
		boolean status;
		
		if (month2.getMonthNumber() == monthNumber)
			status = true;
		else
			status = false;
		
		return status;
	}
	
	// used to check if one month is after (greater than) another
	public boolean greaterThan(Month month2) {
		boolean status;
		
		if (monthNumber > month2.getMonthNumber())
			status = true;
		else
			status = false;
		
		return status;
	}
	
	// used to check if one month is before (less than) another
	public boolean lessThan(Month month2) {
		boolean status;
		
		if (monthNumber < month2.getMonthNumber())
			status = true;
		else
			status = false;
		
		return status;
	}
}