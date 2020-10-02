import java.sql.SQLException;
import java.util.List;

public abstract class CarFactory <T extends Car> {

	public abstract List<T> getAll() throws SQLException;
	public abstract void addCar(T car) throws SQLException;
	public abstract T getCarById(int id) throws SQLException;

}