import java.sql.*;

public class ExecuteSelQry {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
            Statement s=c.createStatement();
             boolean b=s.execute("select * from user");
             ResultSet rs=s.getResultSet();
             while (rs.next()){
                 System.out.println("id:"+rs.getInt(1));
                 System.out.println("fname:"+rs.getString(2));
             }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
