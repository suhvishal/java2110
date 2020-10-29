import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "suhroot123")) {
			//load db drivers  
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create statement object 
			Statement stmt = con.createStatement();
			
			//execute the sql statement 
			String sql = "INSERT INTO employee (empId, empName, city, salary) VALUES (101, 'Mitul', 'Mumbai', 2000.00)";
			
			int result = stmt.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("Record is inserted...");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
