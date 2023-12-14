package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;
import utility.ConnectionProvider;

public class EmployeeRepositoryImpl implements EmployeeRepository{
	@Override
	public String save(Employee e) {
		String msg=null;
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2,  e.getName());
			ps.setString(3,  e.getSalary());
			ps.setString(4,  e.getMobileNo());
			ps.setString(5,  e.getAddress());
			int x = ps.executeUpdate();
			if( x!=0) {
				msg = "Record inserted Successfully";
				return msg;
			}
			else {
				msg = "Error in Query";
				return msg;
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return msg;
	}

	@Override
	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList();
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from batch66.employee");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				employees.add(e);
			}
		} catch (SQLException e) {
			System.out.println("Error from getAll Employee Repo"+e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return employees;
		}
	}

}
