package exam03;
import java.util.Scanner;
public class exam03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//값을 하나 읽어들여 짝수이면 '짝수입니다'를 출력하고
		//아니면 '홀수입니다'를 출력하는 코드 작성.
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}

	}

}
