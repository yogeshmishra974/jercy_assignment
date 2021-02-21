import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import student.csulb.edu.util.DBUtil;

public class DBUtilsTest {
	Connection connection;
	Statement stmt;
	ResultSet rs;

	@Before
	public void before() throws SQLException {
		connection = DBUtil.SetDBConnection();
		stmt=connection.createStatement();
	}

	@After
	public void after() {
		DBUtil.closeConnection(connection);
	}

	@Test
	public void setDBConnectionTest() {
		assertEquals(connection != null, true);
	}

	public void tearDown() {
		System.out.println("Closed the connection successfully");
	}

}
