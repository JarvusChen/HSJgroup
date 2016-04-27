
abstract public class Shape {
	private double id;
	
//	constructor
	public Shape() {

	}
	
//	getter and setter
	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}
	


	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	public abstract void printInfo();
	
}
