package exam05;
import java.util.Scanner;
public class exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ���ڸ� �о� �鿩 ���� ���̸� "same"��,
		// �ٸ� �� �̸� "Different"�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
