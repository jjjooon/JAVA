package exam01;
import java.util.Scanner;
public class exam01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1. ���� �ϳ� �о�鿩 10���� ũ�� '10���� Ů�ϴ�'�� ����ϰ�
		//�ƴϸ� '10���� ũ�� �ʽ��ϴ�'�� ����ϴ� �ڵ� �ۼ�.
		Scanner scn = new Scanner(System.in); //�ý��� ��ġ�κ��� �д� scn ����
		int num = scn.nextInt();
		
		if(num>10) {
			System.out.println("10���� Ů�ϴ�.");
		}else {
			System.out.println("10���� ũ�� �ʽ��ϴ�");
		}

	}

}
