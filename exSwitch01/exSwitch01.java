package exSwitch01;
import java.util.Scanner;
public class exSwitch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� �ϳ��� �о�鿩 1�̸� "spring", 2�̸� "summer",3�̸� "fall", 4�̸� "winter"��, �׿ܴ� 
//		"wrong"�� ����ϴ� ���α׷� �ۼ�. (switch~case, if~else if ������ ���ÿ� �ڵ�)
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
