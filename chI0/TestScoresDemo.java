package chI0;

/**
 * TestScores Class Demo Program Chapter 10, Programming Challenge 1
 */

public class TestScoresDemo {
	public static void main(String[] args) {

		/***   Below are the arrays to test .
		 *     remove // one at a time to test
		 */
		
        double[] Scores = {97.5, 66.7, 88.0, 100.0, 99.0};
		//double[] Scores = {97.5, 66.7, 88.0, 101.0, 99.0};
		//double[] Scores = {97.5, 99.7};
		//double[] Scores = {97.5, -10};	

		// try to create a TestScores object initialized with Scores.
		try {
			TestScores t = new TestScores(Scores);
			System.out.println("The average of the scores is "
					+ t.getAverage());
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid score found.\n" + e.getMessage());
		}

	}
}
