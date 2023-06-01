package week8;

class Person1
{
	String name;
	int age;
	
	void sleep()
	{
		System.out.println("자다");
	}
}

class Student1 extends Person1
{
	int id;
	
	void study()
	{
		System.out.println("공부하다");
	}
}

public class quiz2 {

	public static void main(String[] args) {
		Student1 p = new Student1();
		
		System.out.println(p.name);
		System.out.println(p.id);
		p.sleep();
		p.study();
	}
}