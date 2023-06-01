package week10;

interface Flyable
{
	void fly();
}

interface Jumpable
{
	void jump();
}

class Bird implements Flyable, Jumpable
{
	public void fly()
	{
		System.out.println("fly~");
	}

	@Override
	public void jump() {
		System.out.println("jump!");
	}
}

public class quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird bird = new Bird();
		bird.fly();
		bird.jump();
	}

}
