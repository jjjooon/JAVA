package exSwitch01;
import java.util.Scanner;
public class exSwitch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자 하나를 읽어들여 1이면 "spring", 2이면 "summer",3이면 "fall", 4이면 "winter"을, 그외는 
//		"wrong"을 출력하는 프로그램 작성. (switch~case, if~else if 문으로 동시에 코드)
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("spring");break;
		case 2:
			System.out.println("summer");break;
		case 3:
			System.out.println("fall");break;
		case 4:
			System.out.println("winter");break;
			default :
				System.out.println("wrong");
			
		}

	}

}
