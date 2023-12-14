package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

/**
 * Servlet implementation class FetchAll
 */
@WebServlet("/FetchAll")
public class FetchAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EmployeeService employeeService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		employeeService= new EmployeeServiceImpl();
		List<Employee> employees = employeeService.getAllEmployee();
		request.setAttribute("emp", employees);
		RequestDispatcher rd = request.getRequestDispatcher("FetchAll.jsp");
		rd.forward(request, response);
	}
}
