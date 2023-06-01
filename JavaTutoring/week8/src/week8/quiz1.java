package week8;

class Person
{
	String name;
	int age;
	
	void sleep()
	{
		System.out.println("자다");
	}
}

class Student extends Person
{
	int id;
	
	void study()
	{
		System.out.println("공부하다");
	}
}

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		p.name = "홍길동";
		p.age = 22;
		p.sleep();
		
		Student s = new Student();
		s.age = 22;
		s.id = 2022111354;
		s.name = "한아림";
		s.sleep();
		s.study();
	}
}