import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class MainDbClass {

	public static void main(String[] args) throws SQLException {
		
		DbManager db = new DbManager("root", "Khersonitstep2020"); 
	
		Connection conn = db.connect();
		Statement statement = conn.createStatement();
		statement.execute("create table if not exists ToyotaCar(id integer primary key auto_increment, carModel varchar(100), yearOfManufacture integer, color varchar(100), cost double, regNumber integer);");
		statement.execute("create table if not exists MercedesCar(id integer primary key auto_increment, carModel varchar(100), yearOfManufacture integer, color varchar(100), cost double, regNumber integer);");

		MercedesCarFactory mf = new MercedesCarFactory();
		mf.addCar(new MercedesCar("600", 2017, "black", 4512.50, 37123));
		mf.addCar(new MercedesCar("Benz", 2019, "red", 1567.30, 45327));
		ArrayList<MercedesCar> mercedeses = new ArrayList<>();
		mercedeses=(ArrayList<MercedesCar>) mf.getAll();		 
	 
		ToyotaCarFactory tf = new ToyotaCarFactory();
		tf.addCar(new ToyotaCar("Rav4", 2018, "silver", 3516.46, 11123));
		tf.addCar(new ToyotaCar("Prado", 2020, "blue", 90758.81, 98654));
		ArrayList<ToyotaCar> toyotas = new ArrayList<>();
		toyotas=(ArrayList<ToyotaCar>) tf.getAll();
		
		
		toyotas.forEach(toyota -> { System.out.println(toyota);});
		mercedeses.forEach(mercedes -> { System.out.println(mercedes);});
		
		System.out.println(tf.getCarById(1));
		System.out.println(mf.getCarById(2));
	}

}

