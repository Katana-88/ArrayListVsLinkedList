import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SellerDb {
	DbManager db = new DbManager("root", "Khersonitstep2020"); 
	Connection conn = db.connect();

	
	public void addSeller(Seller seller) throws SQLException {
		
		PreparedStatement statement = conn.prepareStatement("insert into Seller(firstName,secondName, dOb, salary, depName) values(?,?,?,?,?)");
		statement.setString(1, seller.getFirstName());
		statement.setString(2, seller.getSecondName());
		statement.setDate(3, (Date) seller.getdOb());
		statement.setDouble(4, seller.getSalary());
		statement.setString(5, seller.getDepName());
		statement.executeUpdate();
	}

}
