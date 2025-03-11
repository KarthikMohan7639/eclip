import java.sql.*;
public class First_Step {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			java.sql.Driver d=new com.mysql.cj.jdbc.Driver();
			
			DriverManager.registerDriver(d);
			System.out.println("1st step completed");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
