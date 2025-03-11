package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.*;

public abstract class FetchByFname {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("enter fname");
		String fname=s.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			PreparedStatement ps=c.prepareStatement("select * from user where fname=?");
			ps.setString(1, fname);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("ID="+rs.getInt(1));
				System.out.println("FNAME:"+rs.getString(2));
				System.out.println("LNAME:"+rs.getString(3));
				System.out.println("GENDER:"+rs.getString(4));
				System.out.println("GMAIL:"+rs.getString("email"));
				System.out.println("PASSWORD:"+rs.getString("password"));
				System.out.println("PHONE"+rs.getString("phone"));
			}
			else
				System.out.println("first Name not found");
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
