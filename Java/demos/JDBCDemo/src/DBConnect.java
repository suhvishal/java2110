import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create statement object 
		
//		String sql = "INSERT INTO employee (empId, empName, city, salary) VALUES (?,?,?,?)";
//
//		PreparedStatement stmt = con.prepareStatement(sql);
//		
//		int id = 108;
//		String en = "Vamshi";
//		String ct = "Mumbai";
//		double sal = 2300.00;
//		
//		
//		//execute the sql statement 
//		
//		stmt.setInt(1, id);
//		stmt.setString(2, en);
//		stmt.setString(3, ct);
//		stmt.setDouble(4, sal);
//		
//		int result =  stmt.executeUpdate();		
//		
//		if(result>0)
//			System.out.println("inserted");
		
		
	}
	
	
	public Employee getEmployee(int id) {
		
		return null;
	}
	
	public Employee saveEmployee(Employee emp) {
		
		return null;
	}
	
	
	public Employee updateEmployee(Employee emp) {
		//find the emp
		//update 
		//return updated emp
		return null;
	}
	
	public Employee deleteEmployee(int id) {
		//find emp
		//delete 
		//return deleted emp
		return null;
	}
	
	
	
	public List<Employee> getAllEmployees(){
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "suhroot123")) {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String sql = "SELECT * FROM employee";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs  = stmt.executeQuery();
			
			List<Employee> listEmp = new ArrayList<>();
			
				while(rs.next()) {
					
					int empid = rs.getInt("empId");
					String ename = rs.getString("empName");
					String city = rs.getString("city");
					double salary = rs.getDouble("salary");
					
					Employee emp = new Employee(empid, ename, city, salary);
					
					listEmp.add(emp);
				}
			
				return listEmp;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	
}
