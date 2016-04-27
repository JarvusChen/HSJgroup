
public class Circle extends Shape 
{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius<=0)
		{
			System.out.println("Put positive number for side1.");
		}
		else
		this.radius = radius;
	}
	
	Circle(double radius)
	{
		setRadius(radius);
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		double result;
		result=radius*radius*3.14;
		return result;
	}

	
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		double result;
		result=2*3.14*radius;
		return result;
	}

	@Override
	public void printInfo() {
		System.out.printf("Circle with an id of %.0d, radius of %.6d, area of %.6d, and perimeter of %.6d",getId(),radius,calculateArea(),calculatePerimeter());		
	}
	
	
}
