package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("enter the count");
        int count=in.nextInt();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
            PreparedStatement ps=c.prepareStatement("insert into user values (?,?,?,?,?,?,?)");
            for(int i=1;i<=count;i++){
                System.out.println("Enter id");
                int id=in.nextInt();
                System.out.println("enter fname");
                String fname=in.next();
                System.out.println("enter lname");
                String lname=in.next();
                System.out.println("enter gender");
                String gender=in.next();
                System.out.println("enter password");
                String password=in.next();
                System.out.println("enter email");
                String gmail=in.next();
                System.out.println("enter phone");
                 int phone=in.nextInt();

                ps.setInt(1,id);
                ps.setString(2,fname);
                ps.setString(3,lname);
                ps.setString(4,gender);
                ps.setString(5,gmail);
                ps.setString(6,password);
                ps.setInt(7,phone);

                ps.addBatch();

            }
            ps.executeBatch();
            System.out.println("Executed");
        }catch (Exception e){
            e.printStackTrace();
        }
	}

}
