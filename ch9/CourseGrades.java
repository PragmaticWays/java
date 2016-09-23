/**
 * Adam Allard
 * Chapter 9 PC 5 Course Grades
 * This class contains a GradedActivity array and assigns 
 * its elements to different objects inherited from GradedActivity
 */


package ch9;

public class CourseGrades extends GradedActivity {
	
	private GradedActivity[] grades = new GradedActivity[4];
	
	// setLab method assigns its argument to the first element in GradedActivity array
	public void setLab(GradedActivity obj) {
		grades[0] = obj;
	}
	
	// setPassFailExam method assigns its argument to the second element in GradedActivity array
	public void setPassFailExam(PassFailExam obj) {
		grades[1] = obj;
	}
	
	// setEssay method assigns its argument to the third element in GradedActivity array
	public void setEssay(Essay obj) {
		grades[2] = obj;
	}
	
	// setFinalExam method assigns its argument to the fourth element in GradedActivity array
	public void setFinalExam(FinalExam obj) {
		grades[3] = obj;
	}
	
	// toString method returns a string containing the information about each element in 
	// GradedActivity array
	public String toString() {
		String str = 
				  "Lab Score: \t\t" 			+ grades[0].getScore() 
				+ "\t Grade: " 					+ grades[0].getGrade()
												
				+ "\nPass/Fail Exam Score: \t" 	+ grades[1].getScore() 
				+ "\t Grade: " 					+ grades[1].getGrade()
												
				+ "\nEssay Score: \t\t" 		+ grades[2].getScore() 
				+ "\t Grade: " 					+ grades[2].getGrade()
												
				+ "\nFinal Exam Score: \t" 		+ grades[3].getScore() 
				+ "\t Grade: " 					+ grades[3].getGrade();
		return str;
	}
}
