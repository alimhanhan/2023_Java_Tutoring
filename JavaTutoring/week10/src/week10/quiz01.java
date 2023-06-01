package week10;

abstract class Shape
{
	int radius;
	int width;
	int height;
	
	abstract double getArea();
}

class Circle extends Shape
{
	Circle(int radius)
	{
		this.radius = radius;
	}
	
	double getArea()
	{
		return radius * radius * 3.14;
	}
}

class Rectangle extends Shape
{
	Rectangle(int width, int height)
	{
		this.height = height;
		this.width = width;
	}
	
	double getArea()
	{
		return width * height;
	}
}

public class quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(4,6);
		
		System.out.println("Circle의 면적: " + circle.getArea());
		System.out.println("Rectangle의 면적: " + rectangle.getArea());
	}

}
