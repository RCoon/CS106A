/**
 * The employee class contains the following pieces of information
 * about an employee: The name of the employee, the name of the
 * employee's supervisor, and the employee's annual salary.  This
 * information is private to the class.  Clients can obtain this
 * information only by using the various methods defined by the
 * class.
 */

import acm.program.*;

public class Employee {
	
	/**
	 * Creates a new Employee object with the specified name,
	 * supervisor, and salary.
	 * @param name The employee's name
	 * @param boss The employee's supervisor
	 * @param salary The employee's annual salary
	 */
	public Employee (String name, String boss, double salary) {
		empName = name;
		empBoss = boss;
		empSalary = salary;
	}
	
	/**
	 * Gets the name of the employee
	 * @return The name of the employee
	 */
	public String getName() {
		return empName;
	}
	
	/**
	 * Gets the employee's supervisor
	 * @return The employee's supervisor
	 */
	public String getBoss() {
		return empBoss;
	}
	
	/**
	 * Gets the employee's annual salary
	 * @return The employee's annual salary
	 */
	public double getSalary() {
		return empSalary;
	}
	
	/**
	 * Sets the employee's new name
	 * @param newName The employee's new name
	 */
	public void setName(String newName) {
		empName = newName;
	}
	
	/**
	 * Sets the employee's new supervisor
	 * @param newBoss The employee's new supervisor
	 */
	public void setBoss(String newBoss) {
		empBoss = newBoss;
	}
	
	/**
	 * Sets the employee's new salary
	 * @param newSalary The employee's new annual salary
	 */
	public void setSalary(double newSalary) {
		empSalary = newSalary;
	}
	
	public String toString() {
		return getName() + ", " + getBoss() + ", $" + getSalary();
	}
	
// Private instance variables
	private String empName; // The employee's name
	
	private String empBoss; // The employee's supervisor
	
	private double empSalary; // The employee's annual salary
}
