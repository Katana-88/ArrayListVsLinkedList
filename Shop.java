import java.util.ArrayList;

public class Shop {
	String name;
	String type;
	ArrayList<Department> departments;
	
	public Shop(String name, String type, ArrayList<Department> departments) {
		this.name = name;
		this.type = type;
		this.departments = departments;
	}
	
	public Shop() {
		this.name = "";
		this.type = "";
		this.departments = new ArrayList<Department>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}	

}
