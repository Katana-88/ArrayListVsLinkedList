import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ToyotaCarFactory extends CarFactory<ToyotaCar>{
	DbManager db = new DbManager("root", "Khersonitstep2020"); 
	Connection conn = db.connect();

	@Override
	public List<ToyotaCar> getAll() throws SQLException {
		ArrayList<ToyotaCar> toyotaCars = new ArrayList<>();
		String sel = "select * from ToyotaCar";
		ResultSet resultSet = db.getSelectQuery(sel, conn);
 
		 while (resultSet.next()) {
			 
			 ToyotaCar toyota = new ToyotaCar();
			 
			 toyota.setId(resultSet.getInt("id"));
			 toyota.setCarModel(resultSet.getString("carModel"));
			 toyota.setYearOfManufacture(resultSet.getInt("yearOfManufacture"));
			 toyota.setColor(resultSet.getString("color"));
			 toyota.setCost(resultSet.getDouble("cost"));
			 toyota.setRegNumber(resultSet.getInt("regNumber"));

			 toyotaCars.add(toyota);	 
			} 

		return toyotaCars;
	}

	@Override
	public void addCar(ToyotaCar car) throws SQLException {
		
		PreparedStatement statement2 = conn.prepareStatement("insert into ToyotaCar(carModel,yearOfManufacture,color,cost,regNumber) values(?,?,?,?,?)");
		statement2.setString(1, car.getCarModel());
		statement2.setInt(2, car.getYearOfManufacture());
		statement2.setString(3, car.getColor());
		statement2.setDouble(4, car.getCost());
		statement2.setInt(5, car.getRegNumber());
		statement2.executeUpdate();
	}

	@Override
	public ToyotaCar getCarById(int id) throws SQLException {
		ToyotaCar toyota = new ToyotaCar();
		String sel = "select * from ToyotaCar where id = ?";
		PreparedStatement statement3 = conn.prepareStatement(sel);
		statement3.setInt(1, id);
		statement3.execute();
		ResultSet resultSet = statement3.getResultSet();
		if(resultSet.next()) {
			 toyota.setId(resultSet.getInt("id"));
			 toyota.setCarModel(resultSet.getString("carModel"));
			 toyota.setYearOfManufacture(resultSet.getInt("yearOfManufacture"));
			 toyota.setColor(resultSet.getString("color"));
			 toyota.setCost(resultSet.getDouble("cost"));
			 toyota.setRegNumber(resultSet.getInt("regNumber"));
		} else {toyota=null;}

		return toyota;
	}
	


}