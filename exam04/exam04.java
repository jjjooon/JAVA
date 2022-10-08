package exam04;
import java.util.Scanner;
public class exam04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0이 아닌 숫자를 읽어들여 양수는 "양수입니다"
		//음수는 "음수입니다"를 출력하는 프로그램을 작성하시오.
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		if(num>0) {
			System.out.println("양수입니다.");
		}else {
			System.out.println("음수입니다.");
		}

	}

}
