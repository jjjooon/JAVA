package exSwitch02;
import java.util.Scanner;
public class exSwitch02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� �ϳ��� �о�鿩 1�̸� "���� ��ȸ����", 2�̸� "���� ��ݼ���", 3�̸� "���� �Աݼ���",
//		4�̸� "���� ��ü����"��, �� �ܴ� "�߸� �����̽��ϴ�."�� ����ϴ� ���α׷� �ۼ�.
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		switch(num) { 
		  case 1: 
		   System.out.println("���� ��ȸ����");break;
		  case 2:
			System.out.println("���� ��ݼ���");break;
		  case 3:
		    System.out.println("���� �Աݼ���");break;
		  case 4:
		    System.out.println("���� ��ü����");break;
		  default :
			System.out.println("�߸� �����̽��ϴ�.");
		
		
		}
		

	}

}
