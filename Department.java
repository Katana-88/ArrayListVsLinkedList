import java.util.ArrayList;

public class Department {
	String name;
	String type;
	ArrayList<Seller> sellers;
	
	public Department(String name, String type, ArrayList<Seller> sellers) {
		this.name = name;
		this.type = type;
		this.sellers = sellers;
	}
	
	public Department() {
		this.name = "";
		this.type = "";
		this.sellers = new ArrayList<Seller>();
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

	public ArrayList<Seller> getSellers() {
		return sellers;
	}

	public void setSellers(ArrayList<Seller> sellers) {
		this.sellers = sellers;
	}

}
