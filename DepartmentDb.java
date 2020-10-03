import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentDb {
	DbManager db = new DbManager("root", "Khersonitstep2020"); 
	Connection conn = db.connect();

	
	public void addDepartment(Department department) throws SQLException {
		
		PreparedStatement statement = conn.prepareStatement("insert into Department(name,type) values(?,?)");
		statement.setString(1, department.getName());
		statement.setString(2, department.getType());
		statement.executeUpdate();
	}

}
