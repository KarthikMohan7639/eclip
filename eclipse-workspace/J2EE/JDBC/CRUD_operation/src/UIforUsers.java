import java.sql.*;
import java.util.Scanner;
public class UIforUsers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter option");
		int option=s.nextInt();
		int id=s.nextInt();
		
		do
			System.out.println("1.signup \n2.login \n3.logout");
		while(option<4);{
			switch(option) {
			case 1:{
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
					PreparedStatement ps=c.prepareStatement("select * from user where id=?");
					ps.setInt(option, id);
					
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
						System.out.println("id not found");
				}
				catch(Exception e){
					e.printStackTrace();
					
				}
			}
			case 2:{
				break;
			}
			case 3:{
				
			}
			}
			
		}
		
		
			
		
	}

}
