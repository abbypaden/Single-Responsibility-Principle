package domain.dao;

import domain.Employee;

public class EmployeeDAO {
	
	public void saveEmployee(Employee emp) {
		System.out.println("saved employee to the database, " + emp);
	}
	
	public void deleteEmployee(Employee emp) {
		System.out.println("deleted employee from database, " + emp);
	}
}
