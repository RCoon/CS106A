/*
 * File: EmployeeTester.java
 * ---------------------
 * This program tests the class Employee to ensure proper
 * functionality.
 */

import acm.program.*;

public class EmployeeTester extends ConsoleProgram {
	
	public void run() {
		Employee emp1 = new Employee("Bob Smith", "Darin Young", 20000);
		Employee emp2 = new Employee("Gary Jones", "Tom Henry", 40000);
		
		println(emp1.getName());
		println(emp1.getBoss());
		println(emp1.getSalary());
		println(emp1.toString());
		
		println(emp2.toString());
		
		emp2.setSalary(emp2.getSalary() * 2);
		emp2.setName("Gary W. Jones");
		emp2.setBoss("Thomas Henry");
		println(emp2.toString());
	}
}
