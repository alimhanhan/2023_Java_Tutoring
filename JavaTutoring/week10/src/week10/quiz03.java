package week10;

interface Animal
{
	void cry();
	void eat();
}

class Dog implements Animal
{
	public void cry()
	{
		System.out.println("멍멍");
	}
	
	public void eat()
	{
		System.out.println("강아지가 밥을 먹습니다.");
	}
}

class Cat implements Animal
{
	public void cry()
	{
		System.out.println("야용");
	}
	
	public void eat()
	{
		System.out.println("고양이가 밥을 먹습니다.");
	}
}

public class quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		Cat c = new Cat();
		
		d.cry();
		d.eat();
		
		c.cry();
		c.eat();
	}

}
