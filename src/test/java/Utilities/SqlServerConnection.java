package Utilities;
import  java.sql.Connection;        
import  java.sql.Statement;     
import  java.sql.ResultSet;     
import  java.sql.DriverManager;     
import  java.sql.SQLException; 

public class SqlServerConnection {

	static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static String server = "jdbc:sqlserver://66.77.5.201:1433;databaseName=BCBSNCCQR_ST_HAPO_Transaction";
	static String usr = "Dir\\sunny.c.gupta";
	static String psw = "Discover5";
	static Connection dbConn;
	static Statement statement;
	static ResultSet result;
	 
	
	 public static void  createSqlConnection() throws  ClassNotFoundException, SQLException {
		 

		 Class.forName(driver);
		 dbConn = DriverManager.getConnection(server,usr,psw);
		 statement = dbConn.createStatement();
		 String tableName = "dbo.ClaimAuditResult";
		 result=statement.executeQuery("select * from "+tableName );
		 System.out.print(result.getString(1));
		 dbConn.close();
                 
 }
}
