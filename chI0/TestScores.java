package chI0;
// package ch10

/**
 * Adam Allard
 * CH 10 PC 1 Test Scores
 * This class accepts an array as its constructor argument and throws an exception 
 * if the array has an element that is less than 0 or greater than 100.
 * the class then has a method that returns the average of the array
 * 
 * package is named chI0 instead of ch10 to keep my folders in order...
 */

public class TestScores {
	
	private double[] testScores;
	
	// constructor accepts an array and tests it for valid scores (between 0 - 100)
	public TestScores(double[] s) {
		
		testScores = s;
		
		for (int index = 0; index < testScores.length; index++)
		{
			if (testScores[index] < 0 | testScores[index] > 100)
			{
				// if an element is not in range, throw an exception
				throw new IllegalArgumentException("Element: " + index + 
												   " Score: "  + testScores[index]);
			}
		}
	}
	
	// get the average of the array
	public double getAverage() {
		
		double avg = 0;
		
		for (int index = 0; index < testScores.length; index++)
		{
			avg += testScores[index];
		} 
		avg /= testScores.length;
		return avg;
	}
}
