package week4;

public class quiz3 {
	
	public int quiz3(int w, int h)
	{
		Rectangle rect = new Rectangle();
		rect.width = w;
		rect.height = h;
		int answer = 0;
		answer = rect.getArea();
		return answer;
	}
	
	public double quiz3(int r)
	{
		Circle cir = new Circle();
		cir.r = r;
		double answer = 0.0;
		answer = cir.getArea();
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		quiz3 sol = new quiz3();
		
		int ret = sol.quiz3(3, 5);
		System.out.println(ret);
		
		double ci = sol.quiz3(2);
		System.out.println(ci);
	}

}

class Rectangle
{
	int width;
	int height;
	
	int getArea()
	{
		return width*height;
	}
}

class Circle
{
	int r;
	
	double getArea()
	{
		return 3.14*r*r;
	}
}
