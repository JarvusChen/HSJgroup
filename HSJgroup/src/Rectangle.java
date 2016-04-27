
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
	@Override
	public double calculateArea(){
		return width*height;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(width+height);
	}

	@Override
	public void printInfo() {
		System.out.printf("Rectangle with an id of %.0d, width of %.6d, height of %.6d, area of %.6d, and perimeter of %.6d",getId(),width,height,calculateArea(),calculatePerimeter());		
	}
	
	public void drawRectangle(){
		for(int i=0;i<height;i++)
		{
			for(int k=0;k<width;k++){
				if(k==0&i==0||k==width&&i==0||k==0&&i==height||k==width&&i==height)
					System.out.println("+");
				else if(k==0||k==width)
					System.out.println("|");
					
				System.out.print("-");
			}
		}
	}
	
}
