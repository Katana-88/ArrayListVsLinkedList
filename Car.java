public abstract class Car {
	protected int id;
	protected String carModel;
	protected int yearOfManufacture;
	protected String color;
	protected double cost;
	protected int regNumber;
	
	public Car(String carModel, int yearOfManufacture, String color, double cost, int regNumber){
		//this.id=id;
		this.carModel=carModel;
		this.yearOfManufacture = yearOfManufacture;
		this.color = color;
		this.cost = cost;
		this.regNumber = regNumber;
	}
	public Car(){
		//this.id=0;
		this.carModel=null;
		this.yearOfManufacture = 0;
		this.color = null;
		this.cost = 0;
		this.regNumber = 0;
	}
	@Override
	public String toString() {
		return "ID: " + id + ". " +carModel+" of "+yearOfManufacture+" year of manufacture, "+color+" color, "+
	"cost: "+cost+"$"+" with registration number "+regNumber+".\n";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	

}