package utilities;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

;

public class MysqlConnection {
	
	@Test
	public static void mySqlConnectivity(){
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/wwwqa", "root", "password");
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery("Select * from employeInfo");
			while(rs.next())
			{
				
				int eid=rs.getInt("eid");
				String ename=rs.getString("ename");
				int esalary=rs.getInt("esalary");
				String elocation=rs.getString("elocation");
				
				System.out.print("Records :"+eid+" " +ename+" "+esalary+" "+elocation+" " +"\n");
			}
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
