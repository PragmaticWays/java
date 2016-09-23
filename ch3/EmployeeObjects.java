package ch3;

public class EmployeeObjects {

	public static void main(String[] args) {
		
		String employeeName,
			   employeeDepartment,
			   employeePosition;
		int employeeIdNumber;
		
		// enter info for employee 1, then use info to create object employee1
		employeeName = "Susan Meyers";
		employeeIdNumber = 47899;
		employeeDepartment = "Accounting";
		employeePosition = "Vice President";
		
		Employee employee1 = new Employee(employeeName, 
									      employeeDepartment, 
									      employeePosition,
									      employeeIdNumber);
		
		// enter info for employee 2, then use info to create object employee2
		employeeName = "Mark Jones";
		employeeIdNumber = 39119;
		employeeDepartment = "IT";
		employeePosition = "Programmer";
		
		Employee employee2 = new Employee(employeeName, 
									      employeeDepartment, 
									      employeePosition,
									      employeeIdNumber);
		
		// enter info for employee 3, then use info to create object employee3
		employeeName = "Joy Rogers";
		employeeIdNumber = 81774;
		employeeDepartment = "Manufacturing";
		employeePosition = "Engineer";
		
		Employee employee3 = new Employee(employeeName, 
									      employeeDepartment, 
									      employeePosition,
									      employeeIdNumber);
		
		// format and print all employee objects
		System.out.printf("%-15s %-10s %-15s %-15s %n", "Name", 
				                                    "ID Number",
				                                    "Department",
				                                    "Position");
		System.out.println("_________________________________________________________");
		
		System.out.printf("%-15s %-10s %-15s %-15s %n",employee1.getName(),  
					     						       employee1.getIdNumber(),
					     						       employee1.getDepartment(), 
					     						       employee1.getPosition());
		
		System.out.printf("%-15s %-10s %-15s %-15s %n",employee2.getName(),  
				   								   	   employee2.getIdNumber(),
				   								   	   employee2.getDepartment(), 
				   								   	   employee2.getPosition());
		
		System.out.printf("%-15s %-10s %-15s %-15s %n",employee3.getName(),  
				   								       employee3.getIdNumber(),
				   								       employee3.getDepartment(), 
				   								       employee3.getPosition());	
	}

}
