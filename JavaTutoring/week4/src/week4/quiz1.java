package week4;

class Final_Test
{
	double x;
	double y;
	
	double average(int x, int y)
	{
		double rere = (double)((x + y)/2);
		return rere;
	}
	
	double average(double x, double y)
	{
		double rere = (x + y)/2;
		return rere;
	}
	
	void execute()
	{
		double result = average(2,2); //Visual Studio 에서는 average(x:2, y:2) 형태로 작성해야 한다.
		double result2 = average(2.5,2.5);
		
		System.out.println("result: " + result + ", result2: " + result2);
	}
}


public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Final_Test test = new Final_Test();
		test.execute();
	}

}
