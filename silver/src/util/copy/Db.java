package util.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	private static Connection con;

	public static Connection open() throws SQLException, ClassNotFoundException {
		if (con == null) {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mariadb://localhost/worldcup_2014", "root", "root");
		}
		return con;
	}

	public static void close(Connection c) throws SQLException {
		if (c != null && !c.isClosed()) {
			c.close();
		}
	}
}
