package student_project.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static Connection dbcon;
	public Statement dbStmt;
	public ResultSet dbRst;

	public static Connection SetDBConnection() {

		if (dbcon != null)
			return dbcon;

		try {

			System.out.println("Inside Db Connection");

			Class.forName("com.mysql.jdbc.Driver");
			dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_project_database", "root", "root");
			System.out.println("Connection Succesful");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dbcon;
	}

	public ResultSet getResultSet(String sqlQuery, Connection conn) throws SQLException {

		//System.out.println(sqlQuery);
		String sqlquery = sqlQuery;
		dbcon = conn;
		try {
			dbStmt = dbcon.createStatement();
			dbRst = dbStmt.executeQuery(sqlquery);
			System.out.println(dbRst);
		} catch (Exception e) {
			System.out.println(e);
		}
		return dbRst;
	}

	public static void closeConnection(Connection name) {
		if (name == null)
			return;
		try {
			name.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DBUtil.SetDBConnection();
		
		
	}

}
