
public class Triangle extends Shape
{
	private double side1;
	private double side2;
	private double side3;
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		if(side1<=0)
		{
			System.out.println("Put positive number for side1.");
		}
		else
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		if(side2<=0)
		{
			System.out.println("Put positive number for side1.");
		}
		else
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		if(side3<=0)
		{
			System.out.println("Put positive number for side1.");
		}
		else
		this.side3 = side3;
			
	}
	
	Triangle(double side1, double side2, double side3)
	{
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}
	
	@Override
	public double calculateArea()
	{
		double s, result;
		s=(side1+side2+side3)/2;
		result=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return result;
	}
	
	@Override
	public double calculatePerimeter()
	{
		return side1+side2+side3;
	}
	
	
	
	@Override
	public void printInfo() {
		System.out.printf("Triangle with an id of %.0f, sides of %.6f, %.6f and %.6f, area of %.6f, and perimeter of %.6f%n",getId(),side1,side2,side3,calculateArea(),calculatePerimeter());		
	}

	
	
	
}
