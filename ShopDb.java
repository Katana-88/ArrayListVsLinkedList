import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShopDb {
	DbManager db = new DbManager("root", "Khersonitstep2020"); 
	Connection conn = db.connect();

	
	public void addShop(Shop shop) throws SQLException {
		
		PreparedStatement statement = conn.prepareStatement("insert into Shop(name,type) values(?,?)");
		statement.setString(1, shop.getName());
		statement.setString(2, shop.getType());
		statement.executeUpdate();
	}

}
