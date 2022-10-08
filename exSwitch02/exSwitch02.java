package exSwitch02;
import java.util.Scanner;
public class exSwitch02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자 하나를 읽어들여 1이면 "예금 조회선택", 2이면 "예금 출금선택", 3이면 "예금 입금선택",
//		4이면 "예금 이체선택"을, 그 외는 "잘못 누르셨습니다."를 출력하는 프로그램 작성.
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		switch(num) { 
		  case 1: 
		   System.out.println("예금 조회선택");break;
		  case 2:
			System.out.println("예금 출금선택");break;
		  case 3:
		    System.out.println("예금 입금선택");break;
		  case 4:
		    System.out.println("예금 이체선택");break;
		  default :
			System.out.println("잘못 누르셨습니다.");
		
		
		}
		

	}

}
