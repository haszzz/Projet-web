package connectBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class Connect {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Connection conn = null;

		try {
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			 conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
			System.out.println("ok");
			Statement s = null;
			s = conn.createStatement();
			s.executeUpdate("INSERT INTO `personne`(`nom`) VALUES ('bababar')");
			conn.close();
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
}
