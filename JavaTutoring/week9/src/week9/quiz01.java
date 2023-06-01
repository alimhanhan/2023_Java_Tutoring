package week9;

class Shape
{
	void area(int width, int height)
	{
		
	}
}

class Triangle extends Shape
{
	void area(int width, int height)
	{
		System.out.println("삼각형의 넓이는 " + width*height/2 + "입니다.");
	}
}

class Rectangle extends Shape
{
	void area(int width, int height)
	{
		System.out.println("사각형의 넓이는 " + width*height + "입니다.");
	}
}

public class quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = new Shape();
		s.area(2, 3);
		
		Triangle t = new Triangle();
		t.area(5, 4);
		
		Rectangle r = new Rectangle();
		r.area(6, 3);

	}

}
