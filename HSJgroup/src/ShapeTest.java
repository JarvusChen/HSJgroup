
public class ShapeTest {

	public static void main(String[] args) {
		ShapeTest test = new ShapeTest();
		test.start();
	}

	void start(){
		Shape shape[] = new Shape[5];
		shape[0] = new Rectangle(10, 5);
		shape[1] = new Triangle(2, 3, 5);
		shape[2] = new Circle(10);
		
		shape[0].setId(2);
		shape[1].setId(3);
		shape[2].setId(1);
		
		processShape(shape[0]);
		processShape(shape[1]);
		processShape(shape[2]);
	}
	
	void processShape(Shape shape){
		shape.printInfo();
		
		if(shape instanceof Rectangle){
			Rectangle r = (Rectangle) shape;
			r.drawRectangle();
		}
	}
}
