package exam01;
import java.util.Scanner;
public class exam01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1. 값을 하나 읽어들여 10보다 크면 '10보다 큽니다'를 출력하고
		//아니면 '10보다 크지 않습니다'를 출력하는 코드 작성.
		Scanner scn = new Scanner(System.in); //시스템 장치로부터 읽는 scn 생성
		int num = scn.nextInt();
		
		if(num>10) {
			System.out.println("10보다 큽니다.");
		}else {
			System.out.println("10보다 크지 않습니다");
		}

	}

}
