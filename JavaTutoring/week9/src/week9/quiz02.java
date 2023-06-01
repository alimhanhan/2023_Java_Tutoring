package week9;

class Parent
{
	Parent()
	{
		this(3);
		System.out.println("parent 생성자 1");
	}
	
	Parent(int a)
	{
		System.out.println("parent 생성자 2");
	}
}

class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Child 생성자 1");
	}
	
	Child(int a)
	{
		System.out.println("Child 생성자 2");
	}
}

public class quiz02 {

	public static void main(String[] args) {

		Parent pa = new Parent();
		System.out.println();
		
		Parent pa2 = new Parent(2);
		System.out.println();
		
		Child ch = new Child();
		System.out.println();
		
	}

}
