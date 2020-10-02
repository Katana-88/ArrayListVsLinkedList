import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MercedesCarFactory extends CarFactory<MercedesCar>{
	DbManager db = new DbManager("root", "Khersonitstep2020"); 
	Connection conn = db.connect();


	@Override
	public List<MercedesCar> getAll() throws SQLException {
		ArrayList<MercedesCar> mercedesCars = new ArrayList<>();
		String sel = "select * from MercedesCar";
		ResultSet resultSet = db.getSelectQuery(sel, conn);
 
		 while (resultSet.next()) {
			 
			 MercedesCar mercedes = new MercedesCar();
			 
			 mercedes.setId(resultSet.getInt("id"));
			 mercedes.setCarModel(resultSet.getString("carModel"));
			 mercedes.setYearOfManufacture(resultSet.getInt("yearOfManufacture"));
			 mercedes.setColor(resultSet.getString("color"));
			 mercedes.setCost(resultSet.getDouble("cost"));
			 mercedes.setRegNumber(resultSet.getInt("regNumber"));

			 mercedesCars.add(mercedes);	 
			} 

		return mercedesCars;
	}

	@Override
	public MercedesCar getCarById(int id) throws SQLException {
		MercedesCar mercedesCar = new MercedesCar();
		String sel = "select * from MercedesCar where id = ?";
		PreparedStatement statement3 = conn.prepareStatement(sel);
		statement3.setInt(1, id);
		statement3.execute();
		ResultSet resultSet = statement3.getResultSet();
		if(resultSet.next()) {
			mercedesCar.setId(resultSet.getInt("id"));
			mercedesCar.setCarModel(resultSet.getString("carModel"));
			mercedesCar.setYearOfManufacture(resultSet.getInt("yearOfManufacture"));
			mercedesCar.setColor(resultSet.getString("color"));
			mercedesCar.setCost(resultSet.getDouble("cost"));
			mercedesCar.setRegNumber(resultSet.getInt("regNumber"));
		} else {mercedesCar=null;}

		return mercedesCar;
	}

	@Override
	public void addCar(MercedesCar car) throws SQLException {
		PreparedStatement statement2 = conn.prepareStatement("insert into MercedesCar(carModel,yearOfManufacture,color,cost,regNumber) values(?,?,?,?,?)");
		statement2.setString(1, car.getCarModel());
		statement2.setInt(2, car.getYearOfManufacture());
		statement2.setString(3, car.getColor());
		statement2.setDouble(4, car.getCost());
		statement2.setInt(5, car.getRegNumber());
		statement2.executeUpdate();
		
	}
}