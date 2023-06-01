package week3;

import java.util.Scanner;

public class quiz3 {

	String name;
	int language;
	int english;
	int math;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("이름: ");
		String name = s.next();
		
		System.out.println("국어 점수: ");
		int language = s.nextInt();  

		System.out.println("영어 점수: ");  //그냥 printn 쓰면 자동 줄바꿈 안생김!
		int english = s.nextInt();

		System.out.println("수학 점수: ");
		int math = s.nextInt();
		
		double average = ((math+english+language)/3);
		System.out.println("제 기말고사 평균은 " + average + "점입니다.");
	}

}
