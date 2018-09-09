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
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testbase", "root", "root");
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery("Select * from empinfo");
			while(rs.next())
			{
				String empno=rs.getString(1);
				String empname=rs.getString(2);
				String empsurname=rs.getString(3);
				String empage=rs.getString(4);
				String emplocation=rs.getString(5);
				System.out.print("First record :"+empno+" " +empname+" "+empsurname+" "+empage+" "+emplocation +"\n");
			}
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
