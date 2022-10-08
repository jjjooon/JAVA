package Ex39;

public class Ex39 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=75;
		
		if(score>=90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급이 A 입니다.");
		}else if(score>=80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급이 B 입니다");
		}else if(score>=70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급이 C 입니다.");
		}else if(score>=60) {
			System.out.println("점수가 60~69 입니다.");
			System.out.println("등급이 D 입니다.");
		}else {
			System.out.println("점수가 60 미만입니다.");
			System.out.println("점수가 F 입니다.");
		}//else
	}//main
}//class
