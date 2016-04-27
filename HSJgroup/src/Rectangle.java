
public class Rectangle extends Shape {
	private double width;
	private double height;
	
	
public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(width<=0){
			System.out.println("Put positive number for width.");
		}
		else
			this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height<=0){
			System.out.println("Put positive number for height.");
		}
		else
		this.height = height;
	}

	//	constructor
	Rectangle(double width, double height){
		setWidth(width);
		setHeight(height);
	}
	
	public double calculateArea(){
		return width*height;
	}
	
	public double calculateParameter(){
		
	}
	
	void drawRectangle(){
		
	}
	
	void printInfo(){
		
	}
}
