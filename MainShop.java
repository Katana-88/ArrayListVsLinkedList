import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainShop {

	public static void main(String[] args) throws SQLException, ParseException {
		DbManager db = new DbManager("root", "Khersonitstep2020"); 
		
		Connection conn = db.connect();
		Statement statement = conn.createStatement();
		statement.execute("create table if not exists Seller(id integer primary key auto_increment, firstName varchar(100),secondName varchar(100), dOb datetime, salary double, depName varchar(100));");
		statement.execute("create table if not exists Department(id integer primary key auto_increment, name varchar(100),type varchar(100));");
		statement.execute("create table if not exists Shop(id integer primary key auto_increment, name varchar(100),type varchar(100));");
		ShopDb shopDb = new ShopDb();
		Shop shop1=new Shop();
		shop1.setName("ShopName");
		shop1.setType("market");
		shopDb.addShop(shop1);
		
		DepartmentDb depDb= new DepartmentDb();
		Department dep1=new Department();
		dep1.setName("FirstDep");
		dep1.setType("industrial goods");
		Department dep2=new Department();
		dep2.setName("SecondDep");
		dep2.setType("food");
		depDb.addDepartment(dep1);
		depDb.addDepartment(dep2);
		
		SellerDb sellerDb = new SellerDb();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = formatter.parse("1991-02-14");
		sellerDb.addSeller(new Seller("Jhohn", "Smith", new java.sql.Date(date.getTime()), 5400.20, "industrial goods"));
		date = formatter.parse("1987-12-01");
		sellerDb.addSeller(new Seller("Helen", "Brown", new java.sql.Date(date.getTime()), 5390.20, "industrial goods"));
		date = formatter.parse("1989-07-29");
		sellerDb.addSeller(new Seller("Debora", "Klaus", new java.sql.Date(date.getTime()), 6000.15, "food"));
		date = formatter.parse("1976-08-31");
		sellerDb.addSeller(new Seller("Adam", "Black", new java.sql.Date(date.getTime()), 6800.74, "food"));

	}

}
