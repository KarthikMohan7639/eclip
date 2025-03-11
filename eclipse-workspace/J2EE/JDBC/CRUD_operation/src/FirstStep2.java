
import java.sql.*;
import java.lang.*;

public class FirstStep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// load and register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// etablishconnection
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "root");

			// create statement
			Statement s = c.createStatement();

			// execute query
			s.executeUpdate("insert into user values(1,'Aadhi','moolam','male','Aadhi@12.gmail.com')");
			s.executeUpdate("insert into user values(2,'Aarya','vadivel','male','AaRathinam@12.gmail.com')");
			s.executeUpdate("insert into user values(3,'Bala','murugan','male','AadhiRhinam@12.gmail.com')");
			s.executeUpdate("insert into user values(4,'chitra','devi','female','AaiRathinam@12.gmail.com')");
			s.executeUpdate("insert into user values(5,'Aadhi','rathinam','male','AadhRathinam@12.gmail.com')");

			System.out.println("data saved");
		} catch (	Exception e) {
			e.printStackTrace();

		}

	}

}
