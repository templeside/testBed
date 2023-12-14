package repository;

import java.util.List;

import model.Employee;

public interface EmployeeRepository {
	public String save(Employee e);
	public Employee getById(Integer id);
	public List<Employee> getAllEmployee();
}