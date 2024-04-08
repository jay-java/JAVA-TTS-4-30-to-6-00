package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentUtil {
	public static Connection createConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD", "root", "");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;

	}
}
