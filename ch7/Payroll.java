package ch7;

/**
 * Adam Allard
 * Chapter 7 PC 2 Payroll Class
 * This class will create an employee object. by using parallel arrays,
 * the employee will be assigned an employeeId number, have amount of
 * hours worked, employee's pay rate, and it will calculate the employee's 
 * wages. it will also have a method (double getGross(int id)) that can show an 
 * emoplyee's wages by using his/her Id number as an argument
 */
public class Payroll {
	
	public final int NUM_EMPLOYEES = 7;
	
	private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 
								 8451277, 1302850, 7580489 };
	private int[] hours = new int[NUM_EMPLOYEES];
	private double[] payRate = new double[NUM_EMPLOYEES];
	private double[] wages = new double[NUM_EMPLOYEES];
	
	// setters
	public void setEmployeeId(int[] id) {
		employeeId = id;
	}
	
	public void setHours(int index, int h) {
		hours[index] = h;
	}
	
	public void setPayRate(int index, double p) {
		payRate[index] = p;
	}
	
	public void setWages(int index) {
		wages[index] = hours[index] * payRate[index];
	}
	
	// getters
	public int getEmployeeId(int i) {
		return employeeId[i];
	}
	
	public int getHours(int i) {
		return hours[i];
	}
	
	public double getPayRate(int i) {
		return payRate[i];
	}
	
	public double getWages(int i) {
		return wages[i];
	}

	// needed to comply with instructions. i do not like this 
	// method at all, using getWages with the parallel 
	// index is way better in my opinion
	public double getGross(int id) {
		int index = 0;
		boolean validId = false;
		double gross = 0;
		for (int i = 0; i < NUM_EMPLOYEES; i++)
		{
			if (id == employeeId[i])
			{
				index = i;
				validId = true;
				break;
			}
		}
		if (validId)
		{
			gross = hours[index] * payRate[index];
		}
		
		return gross;
	}
}
