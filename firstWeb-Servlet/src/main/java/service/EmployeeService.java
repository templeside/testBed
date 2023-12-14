package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {
	public String save(Employee e);
	public Employee getById(Integer id);
	public List<Employee> getAllEmployee();

}
