package exam02;
import java.util.Scanner;
public class exam02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �ϳ� �о�鿩 1~10 �� �̸� '������ ���Դϴ�'�� ����ϰ�     num>=1     &&    num<=10
		//�ƴϸ� '�߸� �ԷµǾ����ϴ�'�� ����ϴ� �ڵ� �ۼ�
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		if(num>=1 && num<=10) {
			System.out.println("������ ���Դϴ�.");
		}else {
			System.out.println("�߸� �ԷµǾ����ϴ�.");
		}

	}

}
