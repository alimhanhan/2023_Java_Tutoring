package week1;
import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점수를 입력하시오: ");
		Scanner s = new Scanner(System.in);
		
		int score = s.nextInt();
		
		if(score>=90)
		{
			System.out.print("A등급입니다.");
		}
		else if(score>=80)
		{
			System.out.print("B등급입니다.");
		}
		else if(score>=70)
		{
			System.out.print("C등급입니다.");
		}
		else
		{
			System.out.print("D등급입니다.");
		}
	}
}
