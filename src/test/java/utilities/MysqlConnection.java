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
				
				int empno=rs.getInt(1);
				String empname=rs.getString(2);
				int empsurname=rs.getInt(3);
				String empage=rs.getString(4);
				
				System.out.print("First record :"+empno+" " +empname+" "+empsurname+" "+empage+" " +"\n");
			}
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
