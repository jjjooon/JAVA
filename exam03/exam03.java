package exam03;
import java.util.Scanner;
public class exam03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �ϳ� �о�鿩 ¦���̸� '¦���Դϴ�'�� ����ϰ�
		//�ƴϸ� 'Ȧ���Դϴ�'�� ����ϴ� �ڵ� �ۼ�.
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		if(num%2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}

	}

}
