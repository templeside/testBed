package service;

import java.util.List;

import model.Employee;
import repository.EmployeeRepository;
import repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeRepository employeeRepository;
	
	@Override
	public String save(Employee e) {
		employeeRepository = new EmployeeRepositoryImpl();
		String msg = employeeRepository.save(e);
		return msg;
	}

	@Override
	public Employee getById(Integer id) {
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		employeeRepository = new EmployeeRepositoryImpl();
		List<Employee> emps = employeeRepository.getAllEmployee();

		return emps;
	}

}
