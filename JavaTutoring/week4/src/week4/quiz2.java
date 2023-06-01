package week4;

class Final_Test1
{
	int test_time = 60;
	String name;
	int avg;
	
	Final_Test1()
	{
	}
	
	Final_Test1(String n)
	{
		this.name = n;
	}
	
	Final_Test1(String n, int k)
	{
		this.name = n;
		this.avg = k;
	}
	
}

public class quiz2 
{

	public static void main(String[] args) 
	{
		Final_Test1 test1 = new Final_Test1();
		System.out.println("test1의 시험 시간은 : " + test1.test_time);
		
		Final_Test1 test2 = new Final_Test1("송다은");
		System.out.println("test2의 시험 시간은 : " + test2.test_time + " /test2를 시험 본 학생의 이름은 : " + test2.name);
		
		Final_Test1 test3 = new Final_Test1("송다은",95);
		System.out.println("test3의 시험시간은 : " + test3.test_time + " /test3를 시험 본 학생의 이름은 : " + test3.name + " /test3의 평균은 : " + test3.avg);
	}
}
