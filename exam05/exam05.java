package exam05;
import java.util.Scanner;
public class exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 개 숫자를 읽어 들여 같은 수이면 "same"을,
		// 다른 수 이면 "Different"를 출력하는 프로그램을 작성하시오.
		Scanner scn=new Scanner(System.in);
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		
		if(num1==num2) {
			System.out.println("same");
		}else {
			System.out.println("Different");
		}
		

	}

}
