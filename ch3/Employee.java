package ch3;

public class Employee {
	// fields
	private String name;
	private String department;
	private String position;
	private int idNumber;
		
	// constructor
	public Employee(String userName, String dept, String pos, int idNum) {
		name = userName;
		department = dept;
		position = pos;
		idNumber = idNum;
	}
		
	// setters
	public void setName(String userName) {
		name = userName;
	}
	public void setDepartment(String dept) {
		department = dept;
	}
	public void setPosition(String pos) {
		position = pos;
	}
	public void setIdNumber(int idNum) {
		idNumber = idNum;
	}
		
	// getters
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public String getPosition() {
		return position;
	}
	public int getIdNumber() {
		return idNumber;
	}	
}


