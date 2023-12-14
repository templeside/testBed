package controller;

import java.io.IOException;

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
 * Servlet implementation class EmployeeRegistration
 */
@WebServlet("/EmployeeRegistration")
public class EmployeeRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeService employeeService;
       
    public EmployeeRegistration() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id= Integer.parseInt( request.getParameter("id"));
		String name = request.getParameter("name");
		String salary = request.getParameter("salary");
		String mobileNo = request.getParameter("mobile");
		String address = request.getParameter("address");
		
		employeeService = new EmployeeServiceImpl();
		
		Employee e = new Employee(id, name, salary, mobileNo, address);
		
		String msg = employeeService.save(e);
		request.setAttribute("message", msg);
		
		RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	}
}
