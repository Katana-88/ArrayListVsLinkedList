import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbManager {
	private String user;
	private String pass;
	private static final String url = 
			"jdbc:mysql://localhost:3306/shops?useUnicode=true&characterEncoding=utf-8&useLegacyDatetimeCode=false&serverTimezone=UTC";

	public DbManager(String user, String pass) {
		this.user = user;
		this.pass = pass;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public Connection connect() {
		try {
			return DriverManager.getConnection(url, this.user, this.pass);
		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public ResultSet getSelectQuery(String sql, Connection conn) {
		Statement comm = null;
		ResultSet set = null;
		try {
			comm = (Statement) conn.createStatement();
			set = ((Statement) comm).executeQuery(sql);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return set;
	}
}
