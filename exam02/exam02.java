package exam02;
import java.util.Scanner;
public class exam02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//값을 하나 읽어들여 1~10 수 이면 '적당한 수입니다'를 출력하고     num>=1     &&    num<=10
		//아니면 '잘못 입력되었습니다'를 출력하는 코드 작성
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		if(num>=1 && num<=10) {
			System.out.println("적당한 수입니다.");
		}else {
			System.out.println("잘못 입력되었습니다.");
		}

	}

}
