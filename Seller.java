import java.sql.Date;

public class Seller {
	String firstName;
	String secondName;
	Date dOb;
	double salary;
	String depName;
	
	public Seller(String firstName, String secondName, Date dOb, double salary, String depName) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.dOb = dOb;
		this.salary = salary;
		this.depName = depName;
	}
	
	public Seller() {
		this.firstName = "";
		this.secondName = "";
		this.dOb = null;
		this.salary = 0;
		this.depName = "";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Date getdOb() {
		return dOb;
	}

	public void setdOb(Date dOb) {
		this.dOb = dOb;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

}
