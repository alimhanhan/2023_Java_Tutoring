package week10;

abstract class Shape2
{
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public void displayInfo()
	{
		System.out.println("도형 정보");
		System.out.println("면적: " + getArea());
		System.out.println("둘레: " + getPerimeter());
	}
}

class Circle1 extends Shape2
{
	private double radius;
	
	public double getArea()
	{
		return radius * radius * 3.14;
	}
	
	public Circle1(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 3.14 * 2.0 * radius;
	}
}

public class quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape2 circle = new Circle1(5.0);
		circle.displayInfo();

	}

}
