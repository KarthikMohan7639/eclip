package com;
import java.sql.*;
import java.util.*;
import java.lang.*;
public class Delete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			
			Statement s=c.createStatement();
			
			s.execute("select * from user");
			
			System.out.println("data updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}



	}

}
