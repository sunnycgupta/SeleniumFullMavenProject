package sunnyTestng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
             
             // This will load the driver
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver Loaded");



// This will connect with Database , getConnection taking three argument
//  first argument Test_Oracle is the dsn which you can change as per your system,
// second argument is username and third argument is password

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");

System.out.println("Connection created");

// This will create statement  
Statement smt=con.createStatement();

System.out.println("Statement created");

// Now execute the query, here facebook is the table which I have created in DB 

ResultSet rs=  smt.executeQuery("Select * from sunny");

System.out.println("Query Executed");

// Iterate the resultset now

while(rs.next()){

String uname=    rs.getString("ID");
String pass=    rs.getString("NAME");
String email=    rs.getString("CITY");

System.out.println("Uname is "+uname+" password is "+pass+" email id is "+email);

}
}
catch (Exception e) {
System.out.println(e.getMessage());
}
	}

}
